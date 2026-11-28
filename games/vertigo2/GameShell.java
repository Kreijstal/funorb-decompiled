/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class GameShell extends GameApplet {
    static String field_B;
    String field_u;
    static SecondaryNodeHashTable field_l;
    private boolean field_n;
    private boolean field_t;
    static int field_x;
    private int field_w;
    private int field_o;
    private long field_y;
    private int field_s;
    private int field_p;
    static int field_z;
    private boolean field_r;
    private int field_A;
    private int field_v;
    static String field_q;
    static String field_m;

    private final void enablePacketOne(byte param0) {
        if (param0 <= 30) {
          this.enablePacketTwo(64);
        }
        wi.field_h[1] = true;
    }

    final void serviceFramework(boolean param0, int param1) {
        int stackIn_24_0 = 0;
        String stackIn_102_0 = null;
        boolean stackIn_103_1 = false;
        int stackIn_105_2 = 0;
        boolean stackIn_106_3;
        int stackIn_135_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = Vertigo2.field_L ? 1 : 0;
        if (null != DiskCacheWorker.field_m) {
          if (null == dc.field_L) {
            var6 = CrossfadingMidiPcmStream.a((byte) 87);
            var4 = var6.getSize();
            DiskCacheWorker.field_m.a(~param1, var4.height, var4.width);
          }
          DiskCacheWorker.field_m.a(16671);
        }
        dp.b((byte) 124);
        mr.b(false);
        if (!cp.a(121) &&
          11 != hn.field_w) {
          f.c((byte) -6);
        }
        if (null != th.field_g) {
          uo.field_h = th.field_g.pollRotation(100);
        }
        if (AccountCreationResultPanel.q(param1 + 85)) {
          var3 = 1200 * IterableNodeHashTable.b(true);
          if (this.field_t ||
            !(jq.a((byte) 29) <= var3) &&
            !(PlayerAvatarRenderer.getMouseIdleTicks((byte) -122) <= var3)) {
            this.field_t = false;
            rm.b((byte) 85);
            wp.a(param1 + 16);
            oq.a((byte) 102, ml.field_A, 2);
            kj.g(1);
            ValidatedTextField.field_R = true;
            ProxySocketConnector.field_j = gk.correctedCurrentTimeMillis(124) + 15000L;
          }
        }
        if (param1 != -6) {
          this.enablePacketFour((byte) -42);
        }
        if (GameplayScreen.field_f == -1 ||
          0 == GameplayScreen.field_f) {
          stackIn_24_0 = (GameplayScreen.field_f != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_24_0;
          GameplayScreen.field_f = SectorCacheStore.b(32);
          if (var3Lifetime1 != 0 &&
            GameplayScreen.field_f == 0 &&
            11 == hn.field_w &&
            !DefaultTextWidgetRenderer.b((byte) -81)) {
            vo.c((byte) 117);
          }
          if (-1 != GameplayScreen.field_f &&
            GameplayScreen.field_f != 0) {
            ProxySocketConnector.field_j = 15000L + gk.correctedCurrentTimeMillis(90);
          }
        }
        if (GameplayScreen.field_f != -1 &&
          0 != GameplayScreen.field_f) {
          if (10 <= qc.field_A) {
            if (hn.field_w >= 10) {
              wp.a(10);
              if (3 != GameplayScreen.field_f) {
                if (GameplayScreen.field_f == 4) {
                  oq.a((byte) 102, ec.field_E, 256);
                } else {
                  if (GameplayScreen.field_f == 2) {
                    oq.a((byte) 102, tq.field_d, 256);
                  } else {
                    if (GameplayScreen.field_f != 5) {
                      oq.a((byte) 102, om.field_C, 256);
                    } else {
                      oq.a((byte) 102, cb.field_Pb, 5);
                    }
                  }
                }
              } else {
                oq.a((byte) 102, ab.field_c, 256);
              }
              ValidatedTextField.field_R = true;
            }
          } else {
            if (GameplayScreen.field_f == 3) {
              this.showErrorPage(0, "js5crc");
            } else {
              if (GameplayScreen.field_f != 4) {
                if (GameplayScreen.field_f != 2) {
                  if (GameplayScreen.field_f != 5) {
                    this.showErrorPage(0, "js5connect");
                  } else {
                    this.showErrorPage(0, "outofdate");
                  }
                } else {
                  this.showErrorPage(0, "js5connect_full");
                }
              } else {
                this.showErrorPage(param1 ^ -6, "js5io");
              }
            }
          }
        }
        if ((-1 != GameplayScreen.field_f &&
          GameplayScreen.field_f != 0 ||
          DefaultTextWidgetRenderer.b((byte) -81)) &&
          gk.correctedCurrentTimeMillis(98) >= ProxySocketConnector.field_j) {
          ValidatedTextField.field_R = false;
          if (GameplayScreen.field_f != -1 &&
            GameplayScreen.field_f != 0) {
            GameplayScreen.field_f = -1;
            CrossfadingMidiPcmStream.f(-1);
          }
        }
        if (GameplayScreen.field_f == 0 &&
          !DefaultTextWidgetRenderer.b((byte) -81)) {
          DiskArchiveRequest.field_E = false;
        }
        if (qc.field_A == 0 &&
          sf.a(1)) {
          qc.field_A = 1;
        }
        if (qc.field_A == 1) {
          if (0 != np.field_Lb) {
            qc.field_B = BufferedSocket.a(eh.field_f, 125);
          }
          HuffmanCodec.field_b = FrameTimer.a(mp.field_d, false, true, false, 1);
          la.field_e = FrameTimer.a(DialogMessagePane.field_F, false, true, false, 1);
          kb.field_b = FrameTimer.a(AccountRegistrationPanel.field_G, false, true, false, 1);
          qc.field_A = 2;
          DropTargetWidgetContainer.field_G = la.field_e;
          ml.field_y = HuffmanCodec.field_b;
        }
        if (qc.field_A == 2) {
          if (null != qc.field_B &&
            qc.field_B.ensureIndexLoaded(0)) {
            if (!qc.field_B.hasGroupName("", param1 + 5)) {
              qc.field_B = null;
            } else {
              if (qc.field_B.tryLoadGroupByName("", 0)) {
                PasswordValidator.loadSharedInterfaceText(0, qc.field_B);
                qc.field_B = null;
                di.b((byte) -67);
              }
            }
          }
          if (qc.field_B == null) {
            qc.field_A = 3;
          }
        }
        if (qc.field_A == 3 &&
          ir.a(-95, la.field_e, HuffmanCodec.field_b, kb.field_b) &&
          lm.a(kb.field_b, (byte) 119)) {
          PlayerAvatarRenderer.releaseStartupFontAndImage(-1);
          vl.b(2147483647);
          LabeledWidgetContainer.field_O = false;
          IntrusiveNode.field_h = mq.field_t;
          StripedProgressWidget.a(kb.field_b, pl.field_i, (byte) -7, HuffmanCodec.field_b, la.field_e);
          if (pb.field_f ||
            null != MouseWheelInput.field_f) {
            stackIn_102_0 = MouseWheelInput.field_f;
            stackIn_103_1 = !(pb.field_f);
            stackIn_105_2 = 65536;
            stackIn_106_3 = !(pb.field_f);
            or.a(stackIn_102_0, stackIn_103_1, stackIn_105_2, stackIn_106_3);
          }
          if (fo.field_d) {
            AlphaWidgetContainer.i(0);
          }
          if (oq.field_E == null) {
            oq.field_E = rc.b(param1 + 130);
            AccountRequestState.field_c = UiWidget.e(param1 + 12349);
          }
          DiskCacheWorker.a(oq.field_E, param1 + 1513245, AccountRequestState.field_c, kb.field_b);
          la.field_e = null;
          HuffmanCodec.field_b = null;
          kb.field_b = null;
          tq.a(false, (java.applet.Applet) (this));
          di.b((byte) -68);
          qc.field_A = 10;
        }
        if (10 == qc.field_A) {
          if (np.field_Lb != 0) {
            IntrusiveDequeCursor.field_c = BufferedSocket.a(MatchingFieldValidator.field_s, 123);
          }
          qc.field_A = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (11 == qc.field_A) {
          if (IntrusiveDequeCursor.field_c != null && (!IntrusiveDequeCursor.field_c.ensureIndexLoaded(0) ||
            !IntrusiveDequeCursor.field_c.tryLoadAllGroups((byte) -112))) {
            ProxySocketConnector.a(false, 0.0f, ProgressDialog.a(IntrusiveDequeCursor.field_c, bq.field_A, eb.field_a, 274));
            decompiledFrameRemainder0 = false;
          }
          else {
            qc.field_A = 12;
            hh.field_c = true;
          }
        }
        if (qc.field_A == 12 &&
          !hh.field_c) {
          qc.field_A = 13;
        }
        if (qc.field_A == 13) {
          var3Lifetime2 = 1;
          if (le.field_d != null) {
            stackIn_135_0 = (!le.field_d.a(-21493)) ? 0 : 1;
            var3Lifetime2 = stackIn_135_0;
            ProxySocketConnector.a(false, le.field_d.field_j, le.field_d.field_h);
          }
          if (var3Lifetime2 != 0) {
            qc.field_A = 20;
          }
        }
        if (!param0 &&
          WidgetWrapper.field_F) {
          Vertigo2.a(DisplayNameSelectionPanel.field_F, (byte) -35);
          this.a((byte) -57);
          ap.a(DisplayNameSelectionPanel.field_F, -8228);
        }
        if (wi.field_h[8]) {
          l.a(119);
        }
    }

    final void startWithDefaultSize(int param0, int param1, String param2) {
        try {
          int var4_int = 119 / ((55 - param1) / 45);
          this.readAppletParameters(480, param0, false, param2, 640);
        } catch (RuntimeException runtimeException) {
          throw wn.wrapClientException((Throwable) ((Object) runtimeException), "kd.WA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void enablePacketsElevenToThirteen(int param0) {
        if (param0 != 30624) {
          field_l = (SecondaryNodeHashTable) null;
        }
        wi.field_h[11] = true;
        wi.field_h[13] = true;
        wi.field_h[12] = true;
    }

    private final int processAccountUiActions(boolean param0, byte param1, boolean param2) {
        try {
          Throwable decompiledCaughtException = null;
          int var4 = 0;
          int var5 = 0;
          Exception var6 = null;
          PacketBuffer var7 = null;
          String var8 = null;
          int var9 = 0;
          String var10 = null;
          String var11 = null;
          Boolean var12 = null;
          int var5Lifetime1;
          int var5Lifetime2;
          int var5Lifetime3;
          var9 = Vertigo2.field_L ? 1 : 0;
          var4 = JaggrabClient.a(np.field_Lb, uo.field_h, param2, 10000);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (1 == var4) {
            var5 = jl.a(jd.a(false), ie.q(20), (byte) -126);
            if (-1 != var5) {
              eq.a(AgeValidator.field_m, nk.field_Kb, var5, 0);
              nk.field_Kb = null;
              AgeValidator.field_m = null;
            }
            var12 = as.b(-599);
            if (var12 != null) {
              qk.a(var12.booleanValue(), true);
            }
          }
          if (var4 == 2) {
            var5Lifetime1 = sk.a(in.a((byte) 86), -1, this.field_v, lf.g(0), hr.h(-121), eb.a(-1), MusicPatchPcmStream.a((byte) 74));
            if (var5Lifetime1 != -1) {
              dl.a(-14, AgeValidator.field_m, nk.field_Kb, var5Lifetime1);
              AgeValidator.field_m = null;
              nk.field_Kb = null;
            }
          }
          if (var4 == 3) {
            if (GameplayScreen.field_f != -1 &&
              GameplayScreen.field_f != 0) {
              GameplayScreen.field_f = -1;
              CrossfadingMidiPcmStream.f(-1);
            }
            if (param0) {
              ValidatedTextField.field_R = false;
            } else {
              var5Lifetime2 = ByteStorage.a(24429, this.field_r, in.a((byte) 86), hr.h(-91), this.field_v, false);
              if (var5Lifetime2 != -1) {
                if (0 != var5Lifetime2) {
                  oq.a((byte) 102, nk.field_Kb, var5Lifetime2);
                  nk.field_Kb = null;
                } else {
                  f.field_F = tn.field_p;
                  vo.c((byte) 117);
                  sq.field_c = false;
                  hn.field_w = 10;
                }
              }
            }
          }
          if (var4 == 4) {
            if (pl.field_i) {
              lb.a(LoginPanel.e((byte) 105), (byte) 80);
            } else {
              hn.field_w = 10;
              sq.field_c = true;
            }
          }
          if (5 == var4) {
            sf.a(LoginPanel.e((byte) -75), -63);
          }
          if (6 == var4 &&
            LabeledWidgetContainer.field_O) {
            hn.field_w = 10;
          }
          var5Lifetime3 = -70 % ((param1 + 33) / 63);
          if (var4 == 7) {
            fq.a(LoginPanel.e((byte) -97), (byte) -16);
          }
          if (var4 == 8) {
            lb.a(LoginPanel.e((byte) -93), (byte) 80);
          }
          if (var4 == 9) {
            gm.a(LoginPanel.e((byte) -103), (byte) -126);
          }
          if (var4 == 10) {
            uh.field_Wb.writeCipheredByte(17, 127);
          }
          if (var4 == 11) {
            pd.a(LoginPanel.e((byte) -95), 1000000);
          }
          if (var4 == 12) {
            gg.a(SectorCacheStore.d(0), true, LoginPanel.e((byte) 68));
          }
          if (var4 == 13) {
            try {
              if (null == ja.field_d) {
                ja.field_d = new JaggrabClient(gi.field_s, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (ja.field_d.b(-1)) {
                var7 = ja.field_d.a(-4);
                if (var7 != null) {
                  var8 = mj.decodeCp1252String(32, var7.payload, 0, var7.position);
                  om.a(var8, (byte) -125);
                } else {
                  var10 = (String) null;
                  om.a((String) null, (byte) 120);
                }
                ja.field_d = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              HuffmanCodec.a((Throwable) ((Object) var6), "S1", 0);
              var11 = (String) null;
              om.a((String) null, (byte) -39);
              ja.field_d = null;
            }
          }
          if (var4 == 15) {
            hn.field_w = 10;
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

    final void updateLoginFlow(int param0) {
        int discarded$5 = 0;
        int discarded$6 = 0;
        int var3;
        boolean stackIn_12_1 = false;
        int stackIn_12_2 = 0;
        Object stackIn_13_0;
        boolean stackIn_13_3;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (param0 > -72) {
          this.field_o = 1;
        }
        if (ArchiveNetworkClient.c((byte) -116)) {
          stackIn_12_1 = false;
          stackIn_12_2 = -115;
          if (null == dc.field_L) {
            stackIn_13_0 = this;
            stackIn_13_3 = false;
          } else {
            stackIn_13_0 = this;
            stackIn_13_3 = true;
          }
          discarded$5 = this.processAccountUiActions(stackIn_12_1, (byte) stackIn_12_2, stackIn_13_3);
        } else {
          if (10 <= qc.field_A) {
            if (NanoFrameTimer.a((byte) 107)) {
              if (0 != hn.field_w) {
                UiWidget.a((byte) -80, uo.field_h);
              } else {
                discarded$6 = this.processAccountUiActions(false, (byte) 116, false);
              }
            } else {
              ByteArrayPoolSupport.c(-86);
            }
          }
        }
    }

    public static void clearStaticReferences(boolean param0) {
        field_m = null;
        field_l = null;
        field_q = null;
        if (!param0) {
          GameShell.clearStaticReferences(false);
        }
        field_B = null;
    }

    private final void initializePacketLengths(int param0) {
        ok.field_d[6] = -2;
        ok.field_d[12] = -1;
        ok.field_d[17] = -1;
        int var2 = 79 % ((57 - param0) / 55);
        ok.field_d[13] = -1;
        ok.field_d[1] = 16;
        ok.field_d[5] = -1;
        ok.field_d[2] = -2;
        ok.field_d[18] = 1;
        ok.field_d[4] = -1;
        ok.field_d[3] = -1;
        ok.field_d[11] = -1;
        ok.field_d[8] = -2;
        ok.field_d[9] = -1;
        ok.field_d[10] = -1;
        ok.field_d[16] = -1;
        ok.field_d[7] = -1;
    }

    final void initializeFramework(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        np.field_Lb = this.field_A;
        IntrusiveNode.a(true, np.field_Lb);
        f.a(this.field_y, this.field_w, 5000, gi.field_s, np.field_Lb, this.field_s, this.field_p, param7, this.field_n, this.field_o, param4, this.field_u, 5000, 6);
        vi.a(np.field_Lb, this.field_s, this.field_p, this.field_u, this.field_o, param7, gi.field_s, this.field_w, (byte) 112);
        mq.c(1);
        th.field_g = nb.createMouseWheelInput(0);
        ap.a(DisplayNameSelectionPanel.field_F, -8228);
        DialogMessagePane.field_F = param6;
        AccountRegistrationPanel.field_G = param2;
        mp.field_d = param3;
        MatchingFieldValidator.field_s = param0;
        eh.field_f = param1;
        if (param5 != -16) {
          return;
        }
        this.initializePacketLengths(param5 - 7);
        lo.a(8537);
    }

    private final void enablePacketFour(byte param0) {
        int var2 = -68 / ((param0 - 48) / 40);
        wi.field_h[4] = true;
    }

    final void dispatchCommonPacket(int param0) {
        boolean stackIn_27_0 = false;
        int var2;
        tn var3;
        int var4;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (param0 >= -60) {
          return;
        }
        var2 = lc.field_f;
        if (64 > var2 &&
          wi.field_h[var2]) {
          if (0 == var2) {
            return;
          }
          if (1 == var2) {
            g.b(false);
          } else {
            if (var2 != 2) {
              if (var2 == 3) {
                p.a((byte) -118);
              } else {
                if (4 == var2) {
                  le.b(-104);
                } else {
                  if (var2 == 5) {
                    to.a((byte) -99);
                  } else {
                    if (var2 != 6) {
                      if (7 != var2) {
                        if (var2 != 8) {
                          if (var2 == 16) {
                            AccountNameAvailabilityValidator.g(3);
                          } else {
                            if (11 != var2 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                InteractiveWidget.a(46);
                                return;
                              }
                              if (var2 == 17) {
                                this.i(-1);
                                return;
                              }
                              if (var2 == 18) {
                                pq.a((byte) 111);
                                return;
                              }
                              HuffmanCodec.a((Throwable) null, "MGS1: " + or.a(115), 0);
                              rm.b((byte) 127);
                              return;
                            }
                            stackIn_27_0 = (12 == var2);
                            var3 = nb.a(stackIn_27_0, (byte) 52);
                            bb.a(false, var3);
                          }
                        } else {
                          DualLinkNode.a(gi.field_s, -121, SoundCache.field_f, ca.field_b);
                        }
                      } else {
                        this.readSessionCookieUpdate((byte) -117);
                      }
                    } else {
                      c.c(4);
                    }
                  }
                }
              }
            } else {
              dm.k(0);
            }
          }
          return;
        }
        HuffmanCodec.a((Throwable) null, "MGS2: " + or.a(117), 0);
        rm.b((byte) -52);
        return;
    }

    private final void readAppletParameters(int param0, int param1, boolean param2, String param3, int param4) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
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
            if (!this.allowAppletStartup(-83)) {
              return;
            }
            this.field_u = this.getCodeBase().getHost();
            var6 = this.field_u.toLowerCase();
            stackIn_7_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_r = stackIn_7_1;
            this.field_p = Integer.parseInt(this.getParameter("gameport1"));
            this.field_s = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_o = Integer.parseInt(var7);
            }
            this.field_w = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_y = Long.parseLong(this.getParameter("instanceid"));
            this.field_n = this.getParameter("member").equals("yes");
            if (param2) {
              field_B = (String) null;
            }
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_A = Integer.parseInt(var8);
            }
            if (this.field_A >= 5) {
              this.field_A = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_v = Integer.parseInt(var9);
            }
            fo.field_d = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.startApplet(32, 77, param1, this.field_w, param0, param4, param3);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            HuffmanCodec.a((Throwable) ((Object) var6_ref), (String) null, 0);
            this.showErrorPage(0, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var6_ref2;
          stackIn_26_1 = new StringBuilder().append("kd.EB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw wn.wrapClientException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void i(int param0) {
        int var2 = SoundCache.field_f.readUnsignedByte(-11);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var4 = param0 + ca.field_b;
        byte[] var5 = new byte[var4];
        SoundCache.field_f.a((byte) 82, var4, var5, 0);
        hc.a(in.a(0, var5), param0 + 16012, var3 != 0, LoginPanel.e((byte) 81));
    }

    final int reconnectAndResendRequests(byte param0) {
        int var2;
        if (param0 > -124) {
          this.enablePacketsElevenToThirteen(58);
        }
        var2 = this.attemptReconnect(-71);
        if (var2 == 0 ||
          var2 == 1) {
          if (wi.field_h[1]) {
            in.a(-124, 2);
          }
          if (wi.field_h[2]) {
            hr.a(3, true);
          }
          if (wi.field_h[3]) {
            PcmOutputWorker.a(4, 2);
          }
          if (wi.field_h[4]) {
            in.a((byte) -102, 5);
          }
          if (wi.field_h[5]) {
            nb.d(6, -2);
          }
          if (wi.field_h[6]) {
            dl.a(-5996, 7);
          }
          if (wi.field_h[8]) {
            en.a(true);
          }
        }
        return var2;
    }

    private final void readSessionCookieUpdate(byte param0) {
        String var2 = tc.a(127);
        rp.a(LoginPanel.e((byte) 77), -2112, var2);
        if (param0 >= -104) {
          this.reconnectAndResendRequests((byte) 8);
        }
    }

    private final void enablePacketHandler(int param0) {
        wi.field_h[param0] = true;
    }

    protected GameShell() {
    }

    private final void enableDefaultPacketHandlers(boolean param0, int param1) {
        wi.field_h[16] = true;
        wi.field_h[17] = true;
        wi.field_h[7] = true;
        wi.field_h[8] = param0;
        wi.field_h[3] = true;
        if (param1 != 2594) {
          this.field_t = true;
        }
        wi.field_h[0] = true;
        wi.field_h[18] = true;
    }

    final static boolean l(int param0) {
        int var2 = 0;
        oc var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        oc var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != 7) {
            GameShell.clearStaticReferences(false);
          }
          var4 = (oc) (LabeledWidgetContainer.field_N.beginBackward((byte) 100));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          for (var2 = 0; var2 < var1.field_n; var2++) {
            if (var4.field_t[var2] != null &&
              var4.field_t[var2].status == 0) {
              return false;
            }
            if (null != var4.field_w[var2] &&
              0 == var4.field_w[var2].status) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wn.wrapClientException((Throwable) ((Object) var1_ref), "kd.BB(" + param0 + ')');
        }
    }

    private final void enablePacketFive(byte param0) {
        wi.field_h[5] = true;
        if (param0 > -118) {
          this.field_v = -21;
        }
    }

    final void configureOptionalPacketHandlers(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        this.enableDefaultPacketHandlers(true, 2594);
        if (param4) {
          this.enablePacketOne((byte) 115);
        }
        if (param3) {
          this.enablePacketTwo(15000);
        }
        if (param2) {
          this.enablePacketFour((byte) 94);
        }
        if (param5) {
          this.enablePacketFive((byte) -123);
        }
        if (param1) {
          this.field_A = -32;
        }
        if (param6) {
          this.enablePacketHandler(6);
        }
        if (param0) {
          this.enablePacketsElevenToThirteen(30624);
        }
    }

    private final void enablePacketTwo(int param0) {
        wi.field_h[2] = true;
        if (param0 != 15000) {
          GameShell.clearStaticReferences(false);
        }
    }

    final int pollAccountUiActions(boolean param0, int param1) {
        if (param1 < 57) {
          this.reconnectAndResendRequests((byte) -69);
        }
        return this.processAccountUiActions(true, (byte) -99, param0);
    }

    private final int attemptReconnect(int param0) {
        if (this.field_f) {
          return -1;
        }
        if (!DefaultTextWidgetRenderer.b((byte) -81)) {
          return -1;
        }
        if (ValidatedTextField.field_R) {
          return -1;
        }
        int var2 = ByteStorage.a(24429, this.field_r, in.a((byte) 86), hr.h(-95), this.field_v, true);
        if (var2 == -1) {
          return -1;
        }
        if (var2 == 0 ||
          var2 == 1) {
          if (11 == hn.field_w &&
            GameplayScreen.field_f == 0) {
            vo.c((byte) 117);
          }
          return var2;
        }
        if (!MusicPatchEnvelope.field_k) {
          this.showErrorPage(0, "reconnect");
        }
        if (param0 > -48) {
          this.field_v = -93;
        }
        wp.a(10);
        oq.a((byte) 102, nk.field_Kb, var2);
        ValidatedTextField.field_R = true;
        ProxySocketConnector.field_j = gk.correctedCurrentTimeMillis(74) + 15000L;
        return var2;
    }

    static {
        field_B = "Set up new unrated game";
        field_q = "Player Name: ";
        field_m = "<%0> has resigned and left.";
    }
}
