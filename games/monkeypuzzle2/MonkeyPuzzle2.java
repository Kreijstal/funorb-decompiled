/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class MonkeyPuzzle2 extends bi {
    static ib field_C;
    static hb field_D;
    static PacketBuffer field_A;
    static String field_E;
    public static boolean field_F;

    final void initializeClient(int param0) {
        try {
          this.a(24, 10, 0, 9, -25172, false, 11, 8);
          v.a(22050, true, 512, rc.field_k, (java.awt.Component) ((Object) ie.field_e));
          this.a(true, 4472, true, false, false);
          he.e(0);
          int var2_int = 56 / ((param0 - 32) / 33);
          nh.a((byte) 62);
          lc.field_e = 7829367;
          qj.field_D = 1;
          ki.field_s = 5683782;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "MonkeyPuzzle2.AA(" + param0 + ')');
        }
    }

    public final void init() {
        try {
          this.a(12, 126, "monkeypuzzle2");
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "MonkeyPuzzle2.init()");
        }
    }

    public MonkeyPuzzle2() {
    }

    final void disposeClient(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          aa.a(-11449);
          if (AwtRasterBuffer.field_f != null) {
            vh.a(AwtRasterBuffer.field_f, (byte) -117);
            AwtRasterBuffer.field_f.exitFullscreen((byte) -107, rc.field_k);
          }
          if (param0) {
            MonkeyPuzzle2.g((byte) -20);
          }
          fi.b(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "MonkeyPuzzle2.BA(" + param0 + ')');
        }
    }

    final void clearClientResources(byte param0) {
        try {
          MonkeyPuzzle2.g((byte) -127);
          GameApplet.c(false);
          rl.clearStaticReferences(-104);
          gj.a(1);
          bd.a((byte) -54);
          bi.clearStaticReferences((byte) -35);
          ClientException.clearStaticReferences((byte) -123);
          qa.a((byte) 115);
          tk.clearStaticReferences(119);
          qh.clearStaticReferences(8);
          MouseWheelInput.clearStaticReferences(256);
          SoftwareRasterizer.clearStaticReferences();
          ResourceArchive.clearStaticReferences((byte) 123);
          el.resetStaticState(true);
          vj.a(17812);
          PacketBuffer.clearBufferStatics(-74);
          pf.clearStaticReferences((byte) -118);
          mb.clearStaticReferences(-128);
          qg.clearStaticReferences(1);
          fe.clearStaticReferences(47);
          w.clearStaticReferences(-32);
          ke.clearStaticReferences(false);
          lh.clearStaticReferences(0);
          tf.clearStaticReferences(640);
          hl.clearStaticReferences(2);
          re.clearStaticReferences(9050);
          qb.clearStaticReferences(203);
          ne.resetStaticState((byte) -17);
          AwtRasterBuffer.clearStaticReferences(false);
          pd.clearStaticReferences((byte) 105);
          FullscreenFocusCanvas.clearStaticReferences((byte) -124);
          oe.resetStaticState(-12248);
          kk.clearStaticReferences((byte) -104);
          hj.c(1903697041);
          wl.clearStaticReferences((byte) 126);
          DiskCacheWorker.resetStaticState(10);
          c.clearStaticReferences(true);
          BufferedRandomAccessFile.clearStaticReferences((byte) -73);
          BufferedSocket.clearStaticReferences(1);
          IntrusiveDeque.resetStaticState(83);
          SpriteState.clearStaticReferences((byte) -69);
          IntrusiveNode.clearStaticReferences(-1733);
          hk.clearStaticReferences((byte) 85);
          qf.clearStaticReferences();
          AudioOutput.clearStaticReferences();
          lg.b(-24358);
          ce.clearStaticReferences(65);
          dl.clearStaticReferences((byte) 54);
          ki.clearDeclaredStaticReferences(12950);
          cb.clearStaticReferences((byte) 8);
          wg.clearStaticReferences(false);
          gb.b((byte) -123);
          sc.a(-21718);
          sg.clearStaticReferences(27303);
          vb.clearDeclaredStaticReferences(-76);
          gg.clearStaticReferences(38);
          ub.a(false);
          BitmapFont.clearStaticReferences();
          nl.clearStaticReferences((byte) -118);
          dh.clearStaticReferences(-14955);
          wd.clearStaticReferences(0);
          GzipDecompressor.clearStaticReferences(-32);
          rf.a(true);
          gd.clearStaticReferences(-81);
          int var2_int = 32 % ((param0 + 60) / 56);
          fi.clearStaticReferences(-128);
          ld.clearStaticReferences(-82);
          kj.clearDeclaredStaticReferences((byte) 121);
          AccountCreationResultPanel.releaseDeclaredStaticReferences(-249);
          ul.releaseDeclaredStaticReferences(-105);
          ra.clearStaticReferences((byte) -96);
          ha.resetStaticState((byte) -128);
          AccountRegistrationPanel.releaseDeclaredStaticReferences(20660);
          lb.clearStaticReferences((byte) 86);
          LoginPanel.d((byte) 98);
          DisplayNameSelectionPanel.releaseDeclaredStaticReferences(-109);
          aj.clearStaticReferences(-14958);
          dk.clearStaticReferences(117);
          qd.clearStaticReferences(false);
          kd.clearStaticReferences((byte) 91);
          PcmResampler.clearStaticReferences((byte) 112);
          ud.clearStaticReferences(-93);
          ma.clearStaticReferences((byte) 94);
          e.clearStaticReferences((byte) 31);
          cl.clearStaticReferences(52);
          ph.clearStaticReferences(1);
          kh.a(106);
          ac.clearStaticReferences((byte) 79);
          fk.clearStaticReferences((byte) -113);
          kc.clearStaticReferences(4);
          hb.d((byte) 126);
          ea.resetStaticState(0);
          cf.clearStaticReferences((byte) 126);
          da.clearStaticReferences(-119);
          he.clearDeclaredStaticReferences(4);
          jc.clearStaticReferences(336);
          v.clearStaticReferences(false);
          bh.clearStaticReferences(-8765);
          lf.clearStaticReferences(false);
          ef.resetStaticState(true);
          BoundedRandomAccessFile.b((byte) -77);
          DelegatingCanvas.clearStaticReferences(-101);
          ec.clearStaticReferences((byte) 123);
          IsaacRandom.clearStaticReferences(120);
          NetworkArchiveRequest.clearDeclaredStaticReferences(8364);
          SectorCacheStore.clearStaticReferences(-4435);
          DiskArchiveRequest.b((byte) 20);
          ca.clearStaticReferences(-1);
          ArchiveRequest.clearStaticReferences((byte) -61);
          cg.resetStaticState((byte) -115);
          tl.clearStaticReferences((byte) -17);
          s.releaseDeclaredStaticReferences(7993);
          wk.clearStaticReferences(false);
          a.clearStaticReferences(true);
          ig.clearStaticReferences();
          sf.clearStaticReferences();
          j.b(5);
          ed.clearStaticReferences(false);
          sj.b(-21);
          kb.clearStaticReferences(2872);
          wa.a(1000);
          p.clearStaticReferences(-14);
          qk.clearStaticReferences(2762);
          ah.clearStaticReferences(0);
          af.a((byte) 122);
          ej.clearStaticReferences((byte) -99);
          q.resetStaticState((byte) 74);
          ii.clearStaticReferences((byte) 120);
          vd.clearStaticReferences(112);
          ie.clearStaticReferences((byte) -107);
          ByteStorage.clearStaticReferences(-123);
          Bzip2Decompressor.clearStaticReferences();
          Bzip2State.resetStaticState(0);
          i.clearStaticReferences(true);
          nj.clearStaticReferences(-151);
          vi.a(0);
          pb.clearStaticReferences((byte) 88);
          ak.c(-1);
          db.clearStaticReferences((byte) -36);
          mc.a(-74);
          aa.resetStaticState(-1);
          UiWidget.resetStaticState(0);
          ButtonWidget.j(-64);
          jk.clearStaticReferences((byte) 77);
          nf.o(-4110);
          WidgetContainer.clearDeclaredStaticReferences(0);
          DequeCursor.clearStaticReferences(110);
          ri.a((byte) -66);
          VorbisFloor.clearStaticReferences();
          ll.a((byte) 115);
          pi.clearDeclaredStaticReferences(-13739);
          nc.clearStaticReferences(124);
          wh.clearStaticReferences(-18728);
          WeightedObjectCache.clearStaticReferences((byte) 12);
          n.clearStaticReferences(-6991);
          pe.b(16711680);
          di.clearStaticReferences(false);
          ek.clearStaticReferences(-114);
          ProxyAuthenticationRequiredException.clearStaticReferences((byte) 114);
          NanoFrameTimer.clearStaticReferences((byte) -107);
          ImageProducerRasterBuffer.b((byte) 74);
          tj.a(89);
          eg.clearStaticReferences((byte) -108);
          oh.a((byte) 4);
          dj.clearStaticReferences(16384);
          ei.a(-22787);
          ok.clearStaticReferences((byte) 123);
          uc.clearStaticReferences(-2355);
          gi.b(8);
          PcmOutputWorker.clearStaticReferences((byte) -7);
          il.clearStaticReferences(false);
          ci.clearStaticReferences((byte) -128);
          mh.clearDeclaredStaticReferences((byte) 99);
          ValidatedTextField.releaseDeclaredStaticReferences(125);
          EditableTextField.clearDeclaredStaticReferences(0);
          pc.resetStaticState(true);
          jh.clearDeclaredStaticReferences(7434);
          cm.clearStaticReferences((byte) 111);
          jj.d((byte) 117);
          vh.clearDeclaredStaticReferences(-9473);
          vg.clearDeclaredStaticReferences(-3114);
          em.resetDeclaredStaticState(-27714);
          TextFieldValidator.e((byte) -95);
          fl.clearStaticReferences((byte) -45);
          ja.clearStaticReferences(false);
          fj.c((byte) 62);
          qj.clearDeclaredStaticReferences(4201);
          dm.clearStaticReferences();
          bb.clearStaticReferences(true);
          sb.clearStaticReferences(12817);
          oi.a((byte) -90);
          oa.clearStaticReferences(false);
          te.clearStaticReferences((byte) -88);
          IterableNodeHashTable.b(24);
          SecondaryNodeDeque.clearStaticReferences((byte) 101);
          b.e(116);
          ProxySocketConnector.clearStaticReferences((byte) -125);
          gh.clearStaticReferences((byte) 56);
          SoundFilter.clearStaticReferences();
          NodeHashTableIterator.clearStaticReferences((byte) 67);
          SecondaryNodeDequeIterator.clearStaticReferences(127);
          de.clearDeclaredStaticReferences(-6742);
          d.resetStaticState(true);
          me.clearStaticReferences(true);
          hd.clearStaticReferences(0);
          lc.resetStaticState(-115);
          mg.clearStaticReferences(-1);
          ve.clearStaticReferences((byte) 15);
          wi.a(256);
          ue.clearDeclaredStaticReferences(8443);
          rb.resetStaticState(-121);
          m.clearDeclaredStaticReferences(49);
          rk.clearStaticReferences(10);
          AccountRequestState.clearStaticReferences(true);
          AccountServiceResult.clearStaticReferences(50);
          h.clearStaticReferences((byte) 85);
          ib.clearStaticReferences(55);
          nh.clearDeclaredStaticReferences(-19931);
          sk.clearStaticReferences(false);
          f.b((byte) -77);
          od.clearStaticReferences((byte) -57);
          rc.clearStaticReferences((byte) 117);
          k.clearStaticReferences((byte) -85);
          vl.clearStaticReferences(false);
          kg.clearStaticReferences((byte) 0);
          jf.e(-51);
          wf.a((byte) -47);
          uh.a(true);
          mk.clearDeclaredStaticReferences(8134);
          hc.clearStaticReferences((byte) -105);
          be.clearStaticReferences(true);
          AccountNameAvailabilityValidator.e(-17202);
          PasswordValidator.clearDeclaredStaticReferences(0);
          EmailFormatValidator.clearDeclaredStaticReferences(98);
          ConfirmedEmailAvailabilityValidator.clearDeclaredStaticReferences(-28970);
          AgeValidator.clearStaticReferences((byte) -107);
          MatchingFieldValidator.resetStaticState(10396);
          sd.clearStaticReferences((byte) 122);
          bl.clearDeclaredStaticReferences(0);
          DebouncedFieldValidator.clearStaticReferences(-122);
          this.field_u = null;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "MonkeyPuzzle2.JA(" + param0 + ')');
        }
    }

    final void renderClientFrame(int param0) {
        Object stackIn_5_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        boolean stackIn_15_2 = false;
        int stackIn_50_0 = 0;
        boolean stackIn_51_1 = false;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = field_F ? 1 : 0;
        try {
          if (null == AwtRasterBuffer.field_f) {
            stackIn_5_0 = ie.field_e;
          } else {
            stackIn_5_0 = AwtRasterBuffer.field_f;
          }
          var5 = stackIn_5_0;
          var2 = var5;
          if (param0 != -25976) {
            field_A = (PacketBuffer) null;
          }
          if (lc.field_d) {
            if (!WeightedObjectCache.field_h) {
              return;
            }
          } else {
            if (TextFieldValidator.d(109)) {
              stackIn_14_0 = var5;
              stackIn_14_1 = 44;
              if (AwtRasterBuffer.field_f == null) {
                stackIn_15_2 = ke.field_a;
              } else {
                stackIn_15_2 = true;
              }
              PacketBuffer.a((java.awt.Canvas) (stackIn_14_0), stackIn_14_1, stackIn_15_2);
              return;
            }
            if (!WeightedObjectCache.field_h) {
              LoginPanel.a((java.awt.Canvas) (var5), (byte) -128);
              return;
            }
            if (!this.m(0)) {
              ResourceArchive.setLoadingStatus(h.field_f, -24119, 100.0f);
              LoginPanel.a((java.awt.Canvas) (var5), (byte) -111);
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (Bzip2State.field_f != qh.field_b && (-1 == qh.field_b ||
            Bzip2State.field_f == -1)) {
            if (qh.field_b != -1) {
              ProxyAuthenticationRequiredException.field_d[qh.field_b].b((byte) 124);
            } else {
              if (-1 != Bzip2State.field_f) {
                ProxyAuthenticationRequiredException.field_d[Bzip2State.field_f].b((byte) 125);
              }
            }
            gl.a(SoftwareRasterizer.field_i, 0, lb.field_H.field_s, 0, 307200);
            DebouncedFieldValidator.field_f.b(-76);
            EmailFormatValidator.a(ej.field_b, (byte) 123, lb.field_H);
            decompiledFrameRemainder0 = false;
          }
          else {
            if (re.field_f) {
              e.b((byte) 117);
            } else {
              if (qh.field_b != -1) {
                ProxyAuthenticationRequiredException.field_d[qh.field_b].b((byte) 122);
              } else {
                DebouncedFieldValidator.field_f.b(-106);
              }
            }
          }
          if (ResourceArchive.isMessageDialogActive(false)) {
            af.a(15, NodeHashTableIterator.field_e, 15, -3);
          } else {
            if (kg.a((byte) 90)) {
              stackIn_50_0 = param0 + 25905;
              if (null != AwtRasterBuffer.field_f) {
                stackIn_51_1 = true;
              } else {
                stackIn_51_1 = ke.field_a;
              }
              hb.b(stackIn_50_0, stackIn_51_1);
            }
          }
          if (sc.field_e != 0) {
            var3 = 256 * ej.field_b / 25;
            if (0 < var3) {
              SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.field_h, SoftwareRasterizer.field_g, 0, var3);
            }
          }
          oh.a(0, (byte) 16, 0, (java.awt.Canvas) (var5));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2_ref), "MonkeyPuzzle2.HA(" + param0 + ')');
        }
    }

    final void updateClient(int param0) {
        boolean discarded$0 = false;
        int stackIn_9_1 = 0;
        boolean stackIn_10_2 = false;
        boolean stackIn_33_0 = false;
        int stackIn_60_0 = 0;
        boolean stackIn_61_1 = false;
        boolean stackIn_88_0 = false;
        boolean stackIn_130_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        var3 = field_F ? 1 : 0;
        try {
          ld.a(false);
          if (AwtRasterBuffer.field_f != null &&
            AwtRasterBuffer.field_f.focusLost) {
            rb.h(3591);
            cm.k(param0 - 15241);
          }
          stackIn_9_1 = 99;
          stackIn_10_2 = (null != AwtRasterBuffer.field_f);
          this.a((byte) stackIn_9_1, stackIn_10_2);
          if (BoundedRandomAccessFile.field_d) {
            this.h((byte) -32);
            BoundedRandomAccessFile.field_d = false;
          }
          if (TextFieldValidator.d(-26)) {
            this.i(250);
            if (TextFieldValidator.d(-76)) {
              if (vg.c(false)) {
                discarded$0 = this.b((byte) 36, false);
              }
              return;
            }
          }
          boolean decompiledFrameRemainder1 = true;
          if (!WeightedObjectCache.field_h) {
            b.a(-21342, DirectByteStorage.field_d);
            WeightedObjectCache.field_h = this.b((byte) 36, true);
          } else {
            if (this.m(param0 ^ 15245)) {
              if (ek.a((byte) 25) &&
                !ResourceArchive.isMessageDialogActive(false)) {
                stackIn_33_0 = (null != AwtRasterBuffer.field_f);
                var2_int = PcmOutputWorker.a(stackIn_33_0, -32323, (bi) (this));
                if (var2_int == 2364824) {
                  DirectByteStorage.e(-18753);
                } else {
                  if ((var2_int == 1 ||
                    var2_int == 2)) {
                    if (AwtRasterBuffer.field_f != null) {
                      vh.a(AwtRasterBuffer.field_f, (byte) 47);
                      AwtRasterBuffer.field_f.exitFullscreen((byte) -107, rc.field_k);
                      AwtRasterBuffer.field_f = null;
                    }
                    if ((var2_int == 2)) {
                      hd.a(true, ii.a(false));
                    }
                  }
                }
                decompiledFrameRemainder1 = false;
              }
              else {
                if (sc.field_e == 0) {
                  boolean decompiledFrameRemainder0 = true;
                  if (qh.field_b != Bzip2State.field_f && (qh.field_b == -1 ||
                    Bzip2State.field_f == -1)) {
                    if (-1 == Bzip2State.field_f) {
                      if (ej.field_b == 50) {
                        AccountServiceResult.a((byte) -28, ke.field_h[13]);
                      }
                      ej.field_b = ej.field_b - 1;
                      if ((ej.field_b == 0)) {
                        ej.field_b = 0;
                        qh.field_b = Bzip2State.field_f;
                      }
                    } else {
                      if (ej.field_b == 0) {
                        AccountServiceResult.a((byte) 119, ke.field_h[12]);
                      }
                      ej.field_b = ej.field_b + 1;
                      if ((ej.field_b == 50)) {
                        if (qh.field_b == 2) {
                          s.field_S = null;
                        }
                        qh.field_b = Bzip2State.field_f;
                        if ((qh.field_b == 2 ||
                          qh.field_b == 6 ||
                          qh.field_b == 10)) {
                          vl.field_g = 0;
                        }
                      }
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    if (re.field_f) {
                      stackIn_88_0 = !(pi.a((byte) 124));
                      re.field_f = stackIn_88_0;
                      if (!re.field_f) {
                        bl.a(50, uh.field_e);
                      }
                    } else {
                      if (!ResourceArchive.isMessageDialogActive(false) &&
                        !ek.a((byte) -126)) {
                        if (qh.field_b != -1) {
                          ProxyAuthenticationRequiredException.field_d[qh.field_b].a(-23);
                        } else {
                          DebouncedFieldValidator.field_f.e((byte) 85);
                        }
                      }
                    }
                  }
                  if (!re.field_f && (-1 != qh.field_b ||
                    Bzip2State.field_f != -1)) {
                    vb.f(param0 ^ 15323);
                  }
                } else {
                  if (sc.field_e == 1) {
                    ej.field_b = ej.field_b + 1;
                    if (ej.field_b == 25) {
                      if (ResourceArchive.isMessageDialogActive(false)) {
                        PasswordValidator.e(param0 ^ -15328);
                      } else {
                        sk.b(false);
                      }
                      sc.field_e = 2;
                    }
                  } else {
                    if (sc.field_e == 2) {
                      if (ok.a(false)) {
                        qh.field_b = di.field_c;
                      } else {
                        cg.a(false);
                        if (null != DebouncedFieldValidator.field_f) {
                          DebouncedFieldValidator.field_f.c((byte) 4);
                        }
                        stackIn_60_0 = 44;
                        stackIn_61_1 = !(af.field_c <= 0);
                        sb.$cfr$intArgs$a$7ffe4b125357(stackIn_60_0, stackIn_61_1);
                        ProxyAuthenticationRequiredException.field_d[1] = new kk(1);
                        qh.field_b = dh.field_c;
                        uh.a((byte) -101, qh.field_b);
                        if (ResourceArchive.isMessageDialogActive(false)) {
                          ue.a((byte) 122, false);
                        }
                      }
                      sc.field_e = 3;
                      Bzip2State.field_f = qh.field_b;
                    } else {
                      ej.field_b = ej.field_b - 1;
                      if (ej.field_b == 0) {
                        sc.field_e = 0;
                      }
                    }
                  }
                }
              }
            } else {
              cg.a(false);
              IntrusiveDeque.a(false, 31645);
              if (this.m(0) &&
                FrameTimer.field_b <= 0) {
                if (dh.field_c == 6) {
                  dh.field_c = 2;
                } else {
                  if (dh.field_c == 10) {
                    dh.field_c = 0;
                  }
                }
              }
            }
          }
          stackIn_130_0 = (qh.field_b == 6) || (qh.field_b == 10);
          IntrusiveDeque.a(stackIn_130_0, 31645);
          if (ResourceArchive.isMessageDialogActive(false)) {
            var2_intLifetime1 = j.a(5);
            if (var2_intLifetime1 == 2) {
              rb.h(3591);
            } else {
              if (var2_intLifetime1 == 3) {
                ue.a((byte) 122, true);
              } else {
                if (var2_intLifetime1 == 4) {
                  gj.a(0, 0, 0);
                }
              }
            }
            if (!ResourceArchive.isMessageDialogActive(false)) {
              ProxyAuthenticationRequiredException.field_d[qh.field_b].a(true, false);
            }
          }
          if (param0 != 15245) {
            field_E = (String) null;
          }
          while (vh.a(ok.field_c, (byte) 125)) {
            this.k(-28710);
          }
          SocketConnector.a((byte) -71, 0);
          if (ld.b(true)) {
            var2_intLifetime2 = this.f(param0 ^ 15246);
            if (2 == var2_intLifetime2) {
              ha.a(8, 126, 8, BoundedRandomAccessFile.field_e.field_j, (Sprite[]) null, (Sprite[]) null, 2, 320, BoundedRandomAccessFile.field_e.field_j + BoundedRandomAccessFile.field_e.field_D, 240, BoundedRandomAccessFile.field_e);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "MonkeyPuzzle2.NA(" + param0 + ')');
        }
    }

    private final void h(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != BufferedRandomAccessFile.field_j) {
            rh.a(-9585, BufferedRandomAccessFile.field_j);
            BufferedRandomAccessFile.field_j = null;
            oe.a((byte) 103);
          }
          hk.field_k = IsaacRandom.a(-92, 1);
          cl.field_a = IsaacRandom.a(-106, 2);
          wi.field_d = IsaacRandom.a(-89, 3);
          if (param0 != -32) {
            field_C = (ib) null;
          }
          fi.field_b = IsaacRandom.a(param0 - 92, 5);
          PasswordValidator.field_p = be.a(false, true, param0 + 13303, 6, false);
          ha.field_fb = IsaacRandom.a(-117, 7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "MonkeyPuzzle2.RA(" + param0 + ')');
        }
    }

    private final boolean m(int param0) {
        boolean stackIn_8_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 0) {
            this.clearClientResources((byte) -92);
          }
          stackIn_8_0 = (k.field_i) || (ok.a(false));
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var2), "MonkeyPuzzle2.TA(" + param0 + ')');
        }
    }

    private final boolean b(byte param0, boolean param1) {
        int var3_int = 0;
        int stackIn_69_0 = 0;
        boolean stackIn_70_1 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = field_F ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (null != cl.field_a) {
            if (cl.field_a.ensureIndexLoaded(-94) &&
              cl.field_a.tryLoadAllGroups(0)) {
              if (wi.field_d.ensureIndexLoaded(param0 - 121) &&
                wi.field_d.tryLoadAllGroups(param0 ^ 36)) {
                if (fi.field_b.ensureIndexLoaded(param0 ^ -77) &&
                  fi.field_b.tryLoadAllGroups(0)) {
                  if (hk.field_k.ensureIndexLoaded(85) &&
                    hk.field_k.tryLoadAllGroups(param0 ^ 36)) {
                    if (ha.field_fb.ensureIndexLoaded(param0 - 126) &&
                      ha.field_fb.tryLoadAllGroups(0)) {
                      if (PasswordValidator.field_p.ensureIndexLoaded(65) &&
                        PasswordValidator.field_p.tryLoadAllGroups(0)) {
                        if (TextFieldValidator.field_j.ensureIndexLoaded(123) &&
                          TextFieldValidator.field_j.tryLoadGroupByName(0, "basic")) {
                          if (TextFieldValidator.field_j.ensureIndexLoaded(param0 ^ -117) &&
                            TextFieldValidator.field_j.tryLoadGroupByName(0, "kartika13")) {
                            if ((ri.field_a.ensureIndexLoaded(param0 - 59) &&
                              ri.field_a.tryLoadGroupByName(0, "kartika13")) &&
                              (decompiledFrameRemainder0 = !(param1))) {
                              ResourceArchive.setLoadingStatus(bd.field_a, -24119, 65.0f);
                              return false;
                            }
                            if (decompiledFrameRemainder0) {
                              ResourceArchive.setLoadingStatus(tk.a(TextFieldValidator.field_j, "basic", ed.field_a, 1, vb.field_i), -24119, 59.0f);
                              return false;
                            }
                          }
                          if (decompiledFrameRemainder0) {
                            ResourceArchive.setLoadingStatus(tk.a(TextFieldValidator.field_j, "basic", ed.field_a, param0 - 35, vb.field_i), -24119, 58.0f);
                            return false;
                          }
                        }
                        if (decompiledFrameRemainder0) {
                          ResourceArchive.setLoadingStatus(tk.a(TextFieldValidator.field_j, "basic", ed.field_a, 1, vb.field_i), -24119, 56.0f);
                          return false;
                        }
                      }
                      if (decompiledFrameRemainder0) {
                        ResourceArchive.setLoadingStatus(tk.a(hk.field_k, "", PacketBuffer.field_f, param0 ^ 37, tl.field_a), param0 - 24155, 55.0f);
                        return false;
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      ResourceArchive.setLoadingStatus(tk.a(ha.field_fb, "", ek.field_e, 1, DiskCacheWorker.field_b), param0 - 24155, 51.0f);
                      return false;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    ResourceArchive.setLoadingStatus(tk.a(hk.field_k, "", ed.field_a, 1, vb.field_i), param0 - 24155, 50.0f);
                    return false;
                  }
                }
                if (decompiledFrameRemainder0) {
                  ResourceArchive.setLoadingStatus(tk.a(fi.field_b, "", oh.field_a, 1, NodeHashTableIterator.field_a), -24119, 35.0f);
                  return false;
                }
              }
              if (decompiledFrameRemainder0) {
                ResourceArchive.setLoadingStatus(tk.a(wi.field_d, "", fe.field_b, 1, ButtonWidget.field_y), -24119, 25.0f);
                return false;
              }
            }
            if (decompiledFrameRemainder0) {
              ResourceArchive.setLoadingStatus(tk.a(cl.field_a, "", fe.field_b, 1, ButtonWidget.field_y), param0 ^ -24083, 15.0f);
              return false;
            }
          }
          if (fi.field_b != null &&
            null != cl.field_a &&
            null != wi.field_d) {
            he.f(param0 - 36);
            ResourceArchive.setLoadingStatus(bd.field_a, -24119, 65.0f);
            this.renderClientFrame(-25976);
            ri.a(fi.field_b, 0, cl.field_a, wi.field_d);
            fi.field_b = null;
            wi.field_d = null;
            cl.field_a = null;
            oe.a((byte) 125);
            return false;
          }
          if (null != hk.field_k &&
            ha.field_fb != null) {
            ResourceArchive.setLoadingStatus(gd.field_a, -24119, 75.0f);
            this.renderClientFrame(param0 ^ -25940);
            sj.a(ha.field_fb, TextFieldValidator.field_j, ri.field_a, hk.field_k, 0);
            ha.field_fb = null;
            hk.field_k = null;
            oe.a((byte) 101);
            return false;
          }
          if (PasswordValidator.field_p != null) {
            ResourceArchive.setLoadingStatus(q.field_b, param0 - 24155, 90.0f);
            this.renderClientFrame(-25976);
            v.a((byte) -121, PasswordValidator.field_p);
            PasswordValidator.field_p = null;
            oe.a((byte) 109);
            return false;
          }
          ok.b(-29387);
          db.b((byte) 80);
          stackIn_69_0 = 119;
          stackIn_70_1 = !(af.field_c <= 0);
          sb.$cfr$intArgs$a$7ffe4b125357(stackIn_69_0, stackIn_70_1);
          if (param0 != 36) {
            field_D = (hb) null;
          }
          for (var3_int = 0; var3_int < 11; var3_int++) {
            ProxyAuthenticationRequiredException.field_d[var3_int] = new kk(var3_int);
          }
          qh.field_b = 0;
          tk.a(50, true);
          jj.c((byte) 60);
          wg.a(-106);
          gj.a((byte) -31);
          if (!ok.a(false)) {
            s.field_S = PcmResampler.a(41, 10, 3, 1, -46);
            cg.a(false);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var3), "MonkeyPuzzle2.SA(" + param0 + ',' + param1 + ')');
        }
    }

    public static void g(byte param0) {
        try {
          field_A = null;
          field_D = null;
          if (param0 > -124) {
            field_D = (hb) null;
          }
          field_E = null;
          field_C = null;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "MonkeyPuzzle2.QA(" + param0 + ')');
        }
    }

    static {
        field_C = new ib();
    }
}
