/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class GameClient extends AppletShell {
    String field_r;
    private int field_q;
    private int field_x;
    private long field_D;
    static IntrusiveDeque field_n;
    private boolean field_o;
    private boolean field_m;
    private int field_u;
    private int field_y;
    private int field_C;
    static long field_B;
    static String field_t;
    private boolean field_p;
    static int field_z;
    private int field_v;
    static String field_w;
    static int field_s;

    private final void enablePacketFive(byte param0) {
        if (param0 != 6) {
          this.field_m = false;
        }
        ImageProducerRasterBuffer.field_m[5] = true;
    }

    final void dispatchCommonPacket(int param0) {
        boolean stackIn_35_0 = false;
        int var2;
        bl var3;
        int var4;
        var4 = Bounce.field_N;
        var2 = wa.field_d;
        if (64 > var2 &&
          ImageProducerRasterBuffer.field_m[var2]) {
          if (param0 != -4) {
            field_s = 15;
          }
          if (var2 == 0) {
            return;
          }
          if (var2 != 1) {
            if (var2 == 2) {
              DiskCacheWorker.a(1);
            } else {
              if (var2 != 3) {
                if (var2 != 4) {
                  if (var2 != 5) {
                    if (var2 != 6) {
                      if (var2 != 7) {
                        if (var2 != 8) {
                          if (var2 == 16) {
                            AgeValidator.h((byte) -93);
                          } else {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                d.e((byte) -94);
                                return;
                              }
                              if (var2 == 17) {
                                this.i((byte) 50);
                                return;
                              }
                              if (var2 == 18) {
                                Platform.handleClearLoginFlagPacket(param0 + 20);
                                return;
                              }
                              ValidatedTextField.a((Throwable) null, (byte) 100, "MGS1: " + ValidationStatusIcon.a(-112));
                              kc.a((byte) 18);
                              return;
                            }
                            stackIn_35_0 = (var2 == 12);
                            var3 = vg.a(stackIn_35_0, 3904);
                            RichTextWidget.a(param0 ^ 1, var3);
                          }
                        } else {
                          DraggableWidgetContainer.a(jc.field_g, (byte) -125, pe.field_d, DebouncedFieldValidator.field_e);
                        }
                      } else {
                        this.readSessionCookieUpdate((byte) 101);
                      }
                    } else {
                      LeaderboardSubmission.handleMultiplayerLeaderboardPacket(1);
                    }
                  } else {
                    ld.b((byte) 120);
                  }
                } else {
                  ConfirmedEmailAvailabilityValidator.b(false);
                }
              } else {
                LabeledWidgetContainer.j(1790);
              }
            }
          } else {
            AwtRasterBuffer.a((byte) 124);
          }
          return;
        }
        ValidatedTextField.a((Throwable) null, (byte) 100, "MGS2: " + ValidationStatusIcon.a(param0 ^ 108));
        kc.a((byte) 18);
    }

    private final void enableDefaultPacketHandlers(boolean param0, boolean param1) {
        ImageProducerRasterBuffer.field_m[0] = true;
        ImageProducerRasterBuffer.field_m[17] = true;
        ImageProducerRasterBuffer.field_m[8] = param1;
        ImageProducerRasterBuffer.field_m[18] = true;
        ImageProducerRasterBuffer.field_m[3] = true;
        ImageProducerRasterBuffer.field_m[7] = true;
        ImageProducerRasterBuffer.field_m[16] = true;
        if (param0) {
          field_B = 46L;
        }
    }

    private final void i(byte param0) {
        int var2 = jc.field_g.readUnsignedByte((byte) -81);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = pe.field_d - 1;
        byte[] var5 = new byte[var4];
        jc.field_g.readCipheredBytes(var4, 8, 0, var5);
        if (param0 <= 42) {
          this.a(false);
        }
        AccountNameAvailabilityValidator.a(true, DiskCacheWorker.b(0), c.a(0, var5), var3 != 0);
    }

    private final void enablePacketTwo(int param0) {
        ImageProducerRasterBuffer.field_m[2] = true;
        if (param0 != 0) {
          field_n = (IntrusiveDeque) null;
        }
    }

    final void serviceFramework(boolean param0, int param1) {
        int discarded$0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_98_0 = 0;
        String stackIn_98_1 = null;
        boolean stackIn_99_2 = false;
        boolean stackIn_102_3;
        int stackIn_132_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = Bounce.field_N;
        if (vd.field_b != null) {
          if (null == sj.field_f) {
            var6 = SocketConnector.a((byte) 126);
            var4 = var6.getSize();
            vd.field_b.a((byte) 13, var4.height, var4.width);
          }
          vd.field_b.d((byte) -84);
        }
        ProxySocketConnector.c(28282);
        ve.b((byte) -91);
        if (!LoginPanel.k(-31077) &&
          ContentTransitionDialog.field_U != 11) {
          pa.a((byte) -65);
        }
        if (AgeValidator.field_k != null) {
          va.field_a = AgeValidator.field_k.pollRotation(-83);
        }
        if (ej.b(-4)) {
          var3 = 1200 * AccountNameAvailabilityValidator.f(-118);
          if (this.field_o ||
            !(var3 >= FullscreenFocusCanvas.a(31083)) &&
            !(var3 >= IterableNodeHashTable.a((byte) 77))) {
            this.field_o = false;
            kc.a((byte) 18);
            va.a(2);
            ConfirmedEmailAvailabilityValidator.a(PcmResampler.field_a, true, 2);
            Slime.evaluateDivisionGuard(-20);
            dl.field_b = true;
            EmailFormatValidator.field_n = fa.correctedCurrentTimeMillis(126) + 15000L;
          }
        }
        if (-1 == cf.field_e ||
          cf.field_e == 0) {
          stackIn_21_0 = (cf.field_e != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_21_0;
          cf.field_e = hd.a((byte) 96);
          if (var3Lifetime1 != 0 &&
            cf.field_e == 0 &&
            ContentTransitionDialog.field_U == 11 &&
            !SocketArchiveNetworkClient.e(-11)) {
            ta.b(102);
          }
          if (cf.field_e != -1 &&
            0 != cf.field_e) {
            EmailFormatValidator.field_n = 15000L + fa.correctedCurrentTimeMillis(-120);
          }
        }
        if (cf.field_e != -1 &&
          cf.field_e != 0) {
          if (sa.field_k < 10) {
            if (cf.field_e == 3) {
              this.showErrorPage((byte) -119, "js5crc");
            } else {
              if (cf.field_e != 4) {
                if (cf.field_e == 2) {
                  this.showErrorPage((byte) -68, "js5connect_full");
                } else {
                  if (cf.field_e == 5) {
                    this.showErrorPage((byte) 114, "outofdate");
                  } else {
                    this.showErrorPage((byte) -60, "js5connect");
                  }
                }
              } else {
                this.showErrorPage((byte) 89, "js5io");
              }
            }
          } else {
            if (10 <= ContentTransitionDialog.field_U) {
              va.a(2);
              if (cf.field_e == 3) {
                ConfirmedEmailAvailabilityValidator.a(ub.field_c, true, 256);
              } else {
                if (cf.field_e != 4) {
                  if (2 != cf.field_e) {
                    if (cf.field_e != 5) {
                      ConfirmedEmailAvailabilityValidator.a(ProgressDialog.field_O, true, 256);
                    } else {
                      ConfirmedEmailAvailabilityValidator.a(TextHotspotBounds.field_k, true, 5);
                    }
                  } else {
                    ConfirmedEmailAvailabilityValidator.a(jl.field_e, true, 256);
                  }
                } else {
                  ConfirmedEmailAvailabilityValidator.a(ub.field_d, true, 256);
                }
              }
              dl.field_b = true;
            }
          }
        }
        if ((cf.field_e != -1 &&
          0 != cf.field_e ||
          SocketArchiveNetworkClient.e(-11)) &&
          EmailFormatValidator.field_n <= fa.correctedCurrentTimeMillis(116)) {
          dl.field_b = false;
          if (cf.field_e != -1 &&
            0 != cf.field_e) {
            cf.field_e = -1;
            ea.d(0);
          }
        }
        if (cf.field_e == 0 &&
          !SocketArchiveNetworkClient.e(-11)) {
          ProxyAuthenticationRequiredException.field_a = false;
        }
        if (sa.field_k == 0 &&
          ResourceArchive.ensureArchiveMasterIndexLoaded(116)) {
          sa.field_k = 1;
        }
        if (1 == sa.field_k) {
          if (Slime.field_a != 0) {
            FullscreenFocusCanvas.field_a = fa.a((byte) -76, DefaultTextWidgetRenderer.field_g);
          }
          pa.field_i = jc.a(ne.field_n, false, 1, 0, true);
          kg.field_b = jc.a(ContentTransitionDialog.field_Y, false, 1, 0, true);
          ea.field_e = jc.a(b.field_a, false, 1, 0, true);
          j.field_j = pa.field_i;
          sa.field_k = 2;
        }
        if (sa.field_k == 2) {
          if (FullscreenFocusCanvas.field_a != null &&
            FullscreenFocusCanvas.field_a.ensureIndexLoaded(-114)) {
            if (FullscreenFocusCanvas.field_a.hasGroupName("", (byte) -16)) {
              if (FullscreenFocusCanvas.field_a.tryLoadGroupByName("", false)) {
                cg.loadSharedInterfaceText((byte) -99, FullscreenFocusCanvas.field_a);
                FullscreenFocusCanvas.field_a = null;
                RichTextWidget.e((byte) -44);
              }
            } else {
              FullscreenFocusCanvas.field_a = null;
            }
          }
          if (null == FullscreenFocusCanvas.field_a) {
            sa.field_k = 3;
          }
        }
        if (sa.field_k == 3 &&
          qi.a(ea.field_e, kg.field_b, (byte) -125, pa.field_i) &&
          ee.a(ea.field_e, (byte) 106)) {
          qe.c(443111233);
          pb.clearStaticReferences(16);
          pa.field_e = false;
          ea.field_c = NodeHashTableIterator.field_d;
          td.a(1, ea.field_e, pa.field_i, kg.field_b, EditableTextField.field_B);
          if (qd.field_a ||
            BouncedownMenu.field_k != null) {
            stackIn_98_0 = 4;
            stackIn_98_1 = BouncedownMenu.field_k;
            stackIn_99_2 = !(qd.field_a);
            stackIn_102_3 = !(qd.field_a);
            rk.a(stackIn_98_0, stackIn_98_1, stackIn_99_2, stackIn_102_3);
          }
          if (id.field_g) {
            PcmResampler.a((byte) -10);
          }
          if (kg.field_k == null) {
            kg.field_k = DequeWidgetContainer.h(-126);
            qc.field_c = pb.c(0);
          }
          pj.a(ea.field_e, qc.field_c, false, kg.field_k);
          pa.field_i = null;
          ea.field_e = null;
          kg.field_b = null;
          BoundedRandomAccessFile.a((java.applet.Applet) (this), -122);
          RichTextWidget.e((byte) -44);
          sa.field_k = 10;
        }
        if (sa.field_k == 10) {
          if (0 != Slime.field_a) {
            AccountCreationResultPanel.field_pb = fa.a((byte) -76, FullscreenNoticeType.field_a);
          }
          sa.field_k = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (sa.field_k == 11) {
          if (null != AccountCreationResultPanel.field_pb && (!AccountCreationResultPanel.field_pb.ensureIndexLoaded(-121) ||
            !AccountCreationResultPanel.field_pb.tryLoadAllGroups((byte) -62))) {
            AgeValidator.a(AgeValidator.a(BufferedSocket.field_p, AccountCreationResultPanel.field_pb, 130, CipherPacketBuffer.field_l), -66, 0.0f);
            decompiledFrameRemainder0 = false;
          }
          else {
            sa.field_k = 12;
            ModalDialog.field_z = true;
          }
        }
        if (12 == sa.field_k &&
          !ModalDialog.field_z) {
          sa.field_k = 13;
        }
        if (sa.field_k == 13) {
          var3Lifetime2 = 1;
          if (null != fb.field_lb) {
            stackIn_132_0 = (!fb.field_lb.a(0)) ? 0 : 1;
            var3Lifetime2 = stackIn_132_0;
            AgeValidator.a(fb.field_lb.field_d, -94, fb.field_lb.field_g);
          }
          if (var3Lifetime2 != 0) {
            sa.field_k = 20;
          }
        }
        if (param1 > -9) {
          discarded$0 = this.processAccountUiActions(true, false, false);
        }
        if (!param0 &&
          AwtRasterBuffer.field_f) {
          ContentTransitionDialog.a(MusicPatchEnvelope.field_h, (byte) 110);
          this.d(12955);
          l.a(0, MusicPatchEnvelope.field_h);
        }
        if (ImageProducerRasterBuffer.field_m[8]) {
          vg.a((byte) -17);
        }
    }

    private final void a(boolean param0) {
        ImageProducerRasterBuffer.field_m[1] = param0;
    }

    final int attemptReconnect(int param0) {
        if (this.field_e) {
          return -1;
        }
        if (!SocketArchiveNetworkClient.e(-11)) {
          return -1;
        }
        if (dl.field_b) {
          return -1;
        }
        int var2 = b.a((byte) -37, this.field_C, uf.a((byte) -112), bl.b(param0 - 50), this.field_p, true);
        if (var2 == -1) {
          return -1;
        }
        if (var2 == 0 ||
          var2 == 1) {
          if (ContentTransitionDialog.field_U == 11 &&
            cf.field_e == 0) {
            ta.b(param0 ^ 95);
          }
          return var2;
        }
        if (!wb.field_b) {
          this.showErrorPage((byte) 93, "reconnect");
        }
        va.a(2);
        ConfirmedEmailAvailabilityValidator.a(ImageProducerRasterBuffer.field_o, true, var2);
        dl.field_b = true;
        EmailFormatValidator.field_n = 15000L + fa.correctedCurrentTimeMillis(-61);
        if (param0 != 1) {
          this.field_o = true;
        }
        return var2;
    }

    private final void enablePacketHandler(int param0) {
        ImageProducerRasterBuffer.field_m[param0] = true;
    }

    final void a(boolean param0, boolean param1, int param2, boolean param3, boolean param4) {
        this.enableDefaultPacketHandlers(false, false);
        if (param3) {
          this.a(true);
        }
        if (param0) {
          this.enablePacketTwo(0);
        }
        if (param4) {
          this.enablePacketHandler(param2 ^ 22418);
        }
        if (param1) {
          this.enablePacketFive((byte) 6);
        }
        if (param2 != 22422) {
          this.field_u = -90;
        }
    }

    final void initializeFramework(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        Slime.field_a = this.field_y;
        pd.a(true, Slime.field_a);
        pa.a(this.field_r, this.field_v, param6, this.field_D, this.field_u, this.field_m, 25342, 5000, this.field_x, this.field_q, param3, DebouncedFieldValidator.field_e, 5000, Slime.field_a);
        rk.a(param3, this.field_q, this.field_r, 0, this.field_v, Slime.field_a, DebouncedFieldValidator.field_e, this.field_u, this.field_x);
        PacketBuffer.g(param5 - 8717);
        AgeValidator.field_k = ek.createMouseWheelInput(0);
        l.a(0, MusicPatchEnvelope.field_h);
        FullscreenNoticeType.field_a = param0;
        ne.field_n = param1;
        ContentTransitionDialog.field_Y = param4;
        DefaultTextWidgetRenderer.field_g = param7;
        if (param5 != 8764) {
          this.attemptReconnect(-50);
        }
        b.field_a = param2;
        this.initializePacketLengths((byte) 27);
        oh.a(true);
    }

    private final void initializePacketLengths(byte param0) {
        ce.field_n[6] = -2;
        ce.field_n[4] = -1;
        ce.field_n[10] = -1;
        ce.field_n[2] = -2;
        ce.field_n[9] = -1;
        if (param0 != 27) {
          this.initializePacketLengths((byte) 15);
        }
        ce.field_n[8] = -2;
        ce.field_n[13] = -1;
        ce.field_n[16] = -1;
        ce.field_n[12] = -1;
        ce.field_n[11] = -1;
        ce.field_n[1] = 16;
        ce.field_n[18] = 1;
        ce.field_n[7] = -1;
        ce.field_n[17] = -1;
        ce.field_n[3] = -1;
        ce.field_n[5] = -1;
    }

    private final int processAccountUiActions(boolean param0, boolean param1, boolean param2) {
        try {
          String stackIn_29_0 = null;
          boolean stackIn_30_1 = false;
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5_int = 0;
          Exception var5 = null;
          String var7 = null;
          int var8 = 0;
          String var9 = null;
          String var10 = null;
          Boolean var11 = null;
          PacketBuffer var12 = null;
          int var5_intLifetime1;
          int var5_intLifetime2;
          var8 = Bounce.field_N;
          var4 = ff.a(param2, Slime.field_a, 8786, va.field_a);
          if (0 == var4) {
            throw new IllegalStateException();
          }
          if (param1) {
            field_s = -61;
          }
          if (var4 == 1) {
            var5_int = hh.a(ne.f(32768), AwtRasterBuffer.a(30923), (byte) 99);
            if (var5_int != -1) {
              ej.a(var5_int, bi.field_l, ImageProducerRasterBuffer.field_o, 255);
              bi.field_l = null;
              ImageProducerRasterBuffer.field_o = null;
            }
            var11 = fa.b(1);
            if (var11 != null) {
              FullscreenNoticeType.a(param1, var11.booleanValue());
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = sa.a(bb.a(-102), pj.a((byte) 48), BoundedRandomAccessFile.d(1), uf.a((byte) -128), 85, this.field_C, bl.b(-71));
            if (-1 != var5_intLifetime1) {
              BufferedRandomAccessFile.a((byte) -52, bi.field_l, var5_intLifetime1, ImageProducerRasterBuffer.field_o);
              bi.field_l = null;
              ImageProducerRasterBuffer.field_o = null;
            }
          }
          if (var4 == 3) {
            if (-1 != cf.field_e &&
              cf.field_e != 0) {
              cf.field_e = -1;
              ea.d(0);
            }
            if (param0) {
              dl.field_b = false;
            } else {
              var5_intLifetime2 = b.a((byte) -37, this.field_C, uf.a((byte) -108), bl.b(-95), this.field_p, false);
              if (var5_intLifetime2 != -1) {
                if (var5_intLifetime2 != 0) {
                  stackIn_29_0 = ImageProducerRasterBuffer.field_o;
                  stackIn_30_1 = (param1) ? false : true;
                  ConfirmedEmailAvailabilityValidator.a(stackIn_29_0, stackIn_30_1, var5_intLifetime2);
                  ImageProducerRasterBuffer.field_o = null;
                } else {
                  TextFieldValidator.field_h = l.field_b;
                  ta.b(101);
                  ContentTransitionDialog.field_U = 10;
                  pg.field_c = false;
                }
              }
            }
          }
          if (4 == var4) {
            if (EditableTextField.field_B) {
              fl.a(8192, DiskCacheWorker.b(0));
            } else {
              ContentTransitionDialog.field_U = 10;
              pg.field_c = true;
            }
          }
          if (var4 == 5) {
            tc.a(DiskCacheWorker.b(0), 6091);
          }
          if (var4 == 6 &&
            pa.field_e) {
            ContentTransitionDialog.field_U = 10;
          }
          if (7 == var4) {
            NameSuggestionsPanel.a(DiskCacheWorker.b(0), 8192);
          }
          if (8 == var4) {
            fl.a(8192, DiskCacheWorker.b(0));
          }
          if (var4 == 9) {
            LabeledWidgetContainer.a((byte) -117, DiskCacheWorker.b(0));
          }
          if (var4 == 10) {
            hh.field_p.writeCipheredByte(true, 17);
          }
          if (11 == var4) {
            FullscreenNoticeType.a(0, DiskCacheWorker.b(0));
          }
          if (var4 == 12) {
            qc.a(DiskCacheWorker.b(0), 24, hd.a(-124));
          }
          if (var4 == 13) {
            try {
              if (Bzip2State.field_v == null) {
                Bzip2State.field_v = new ha(DebouncedFieldValidator.field_e, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (Bzip2State.field_v.a((byte) -53)) {
                var12 = Bzip2State.field_v.a(11951);
                if (var12 != null) {
                  var7 = lh.decodeCp1252String(0, -3789, var12.position, var12.payload);
                  MidiPcmStream.a((byte) 5, var7);
                } else {
                  var9 = (String) null;
                  MidiPcmStream.a((byte) -125, (String) null);
                }
                Bzip2State.field_v = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              ValidatedTextField.a((Throwable) ((Object) var5), (byte) 100, "S1");
              var10 = (String) null;
              MidiPcmStream.a((byte) -128, (String) null);
              Bzip2State.field_v = null;
            }
          }
          if (var4 == 15) {
            ContentTransitionDialog.field_U = 10;
          }
          if (var4 == 16) {
            return 1;
          }
          if (var4 == 17) {
            return 2;
          }
          return 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int pollAccountUiActions(int param0, boolean param1) {
        if (param0 != -1) {
          return 113;
        }
        return this.processAccountUiActions(true, false, param1);
    }

    private final void readAppletParameters(int param0, int param1, byte param2, String param3, int param4) {
        int discarded$0 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        String var6 = null;
        Exception var6_ref = null;
        RuntimeException var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        try {
          try {
            if (!this.allowAppletStartup(param2 ^ 20698)) {
              return;
            }
            this.field_r = this.getCodeBase().getHost();
            var6 = this.field_r.toLowerCase();
            stackIn_8_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_p = stackIn_8_1;
            this.field_v = Integer.parseInt(this.getParameter("gameport1"));
            this.field_x = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_q = Integer.parseInt(var7);
            }
            this.field_u = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_D = Long.parseLong(this.getParameter("instanceid"));
            this.field_m = this.getParameter("member").equals("yes");
            if (param2 != 52) {
              discarded$0 = this.processAccountUiActions(true, false, true);
            }
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_y = Integer.parseInt(var8);
            }
            if (this.field_y >= 5) {
              this.field_y = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_C = Integer.parseInt(var9);
            }
            id.field_g = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.startApplet(32, param3, param0, 102, this.field_u, param1, param4);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            ValidatedTextField.a((Throwable) ((Object) var6_ref), (byte) 100, (String) null);
            this.showErrorPage((byte) -124, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var6_ref2;
          stackIn_27_1 = new StringBuilder().append("kk.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param4).append(')').toString());
        }
    }

    final void startWithDefaultSize(int param0, byte param1, String param2) {
        if (param1 != 122) {
          return;
        }
        try {
          this.readAppletParameters(param0, 480, (byte) 52, param2, 640);
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "kk.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_n = null;
        field_w = null;
        field_t = null;
        int var1 = -62 / ((param0 + 12) / 37);
    }

    private final void readSessionCookieUpdate(byte param0) {
        String var2 = ByteArrayPoolSupport.a((byte) -54);
        ph.a(var2, DiskCacheWorker.b(0), (byte) 51);
        if (param0 <= 99) {
          this.pollAccountUiActions(-59, true);
        }
    }

    final void g(int param0) {
        int discarded$1 = 0;
        int discarded$2 = 0;
        int var3 = Bounce.field_N;
        if (hi.a((byte) -113)) {
          discarded$1 = this.processAccountUiActions(false, false, sj.field_f != null ? true : false);
        } else {
          if (sa.field_k < 10) {
          } else {
            if (!ProxyAuthenticationRequiredException.c(param0 ^ 250)) {
              BouncedownClientSupport.advanceLoginLogoAnimation((byte) -105);
            } else {
              if (0 != ContentTransitionDialog.field_U) {
                qe.a((byte) -76, va.field_a);
              } else {
                discarded$2 = this.processAccountUiActions(false, false, false);
              }
            }
          }
        }
        if (param0 != 0) {
          this.attemptReconnect(68);
        }
    }

    protected GameClient() {
    }

    static {
        field_n = new IntrusiveDeque();
        field_w = "No highscores";
        field_t = "This password is part of your Player Name, and would be easy to guess";
        field_s = 9;
    }
}
