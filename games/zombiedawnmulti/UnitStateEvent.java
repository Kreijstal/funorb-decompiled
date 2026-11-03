/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UnitStateEvent extends GameEvent {
    private int field_n;
    private int field_i;
    private int field_m;
    private int field_q;
    private int field_p;
    private int field_u;
    static int field_r;
    static Sprite field_l;
    static IntrusiveDeque field_j;
    static ma field_t;
    static PacketBuffer field_k;
    private int field_v;
    static ao field_o;
    static long field_s;

    final void a(byte param0) {
        super.a((byte) -111);
        if (param0 >= -47) {
          UnitStateEvent.a(true, -39, (CharSequence) null);
        }
        fk.field_n.a((IntrusiveNode) (this), false);
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == ci.field_f) {
            return false;
          }
          if (param0 > -69) {
            field_t = (ma) null;
          }
          stackIn_8_0 = !(param1.toLowerCase().indexOf(ci.field_f.toLowerCase()) < 0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("so.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_j = null;
        field_t = null;
        field_k = null;
        field_o = null;
        int var1 = -125 / ((param0 + 13) / 41);
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
          param0.addMouseListener(on.field_Z);
          int var2_int = 51 % ((param1 - 75) / 47);
          param0.addMouseMotionListener(on.field_Z);
          param0.addFocusListener(on.field_Z);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "so.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void d(int param0) {
        if (null != we.field_g) {
          return;
        }
        uc.field_b = new String[4];
        uc.field_b[2] = DateInputWidget.field_K;
        uc.field_b[3] = DelayedPacket.field_h;
        uc.field_b[0] = Camera.field_b;
        we.field_g = new String[51];
        uc.field_b[1] = ji.field_a;
        we.field_g[4] = ScrollPaneWithFooter.field_Lb;
        we.field_g[14] = FightEvent.field_p;
        we.field_g[21] = r.field_d;
        we.field_g[1] = DraggableWidget.field_K;
        we.field_g[12] = ScrollPaneWithFooter.field_Fb;
        we.field_g[16] = kj.field_s;
        we.field_g[18] = ci.field_h;
        we.field_g[13] = DialogLayer.field_K;
        we.field_g[6] = qo.field_t;
        we.field_g[0] = Waypoint.field_f;
        we.field_g[19] = TranslatedUiText.field_b;
        we.field_g[5] = qo.field_t;
        we.field_g[15] = PowerupEvent.field_n;
        we.field_g[45] = ZombieDawnMulti.field_F;
        we.field_g[20] = s.field_g;
        we.field_g[3] = ScoreUpdateEvent.field_l;
        we.field_g[17] = NetworkGameClient.field_r;
        we.field_g[11] = ra.field_i;
        we.field_g[7] = qf.field_d;
        we.field_g[2] = r.field_b;
        we.field_g[36] = WhirlpoolHasher.field_i;
        we.field_g[39] = "Shouldn't See Me";
        we.field_g[35] = DualLinkDeque.field_a;
        we.field_g[49] = vl.field_j[1];
        we.field_g[50] = FadingDialog.field_L;
        we.field_g[48] = vl.field_j[0];
        we.field_g[40] = HuffmanCodec.field_c;
        we.field_g[46] = ClickMarker.field_m;
        we.field_g[41] = ic.field_l;
        we.field_g[38] = UiWidget.field_m;
        we.field_g[42] = u.field_j;
        we.field_g[47] = vn.field_d[0];
        we.field_g[37] = ce.field_g[0];
        gh.field_f = new String[63];
        we.field_g[44] = vg.field_f;
        we.field_g[43] = ec.field_a;
        we.field_g[34] = vi.field_a[0];
        gh.field_f[46] = we.field_i;
        gh.field_f[53] = pb.field_c;
        gh.field_f[54] = ok.field_t;
        gh.field_f[47] = og.field_S;
        gh.field_f[48] = vd.field_b;
        gh.field_f[52] = lc.field_i;
        gh.field_f[0] = SimEntity.field_F;
        wq.field_g = new String[63][2];
        gh.field_f[11] = LevelFileCatalog.field_e;
        gh.field_f[45] = db.field_d;
        gh.field_f[3] = lf.field_b;
        gh.field_f[55] = wn.field_s;
        gh.field_f[50] = w.field_n;
        gh.field_f[16] = DisplayNamePanel.field_L;
        gh.field_f[15] = i.field_c;
        gh.field_f[12] = wi.field_m;
        gh.field_f[5] = MarkerSliderPainter.field_j;
        gh.field_f[14] = vm.field_jb;
        gh.field_f[38] = ic.field_b;
        gh.field_f[51] = eb.field_e;
        gh.field_f[34] = ic.field_i;
        gh.field_f[18] = ob.field_u;
        gh.field_f[59] = TextInputValidator.field_o;
        gh.field_f[7] = ScrollPaneWithFooter.field_Mb;
        gh.field_f[60] = uc.field_c;
        gh.field_f[49] = dg.field_O;
        gh.field_f[2] = EmailAvailabilityValidator.field_t;
        gh.field_f[4] = ResourceArchive.field_d;
        gh.field_f[9] = IterableNodeHashTable.field_b;
        gh.field_f[32] = ZombieDawnMulti.field_M;
        gh.field_f[58] = me.field_j;
        gh.field_f[8] = UiComponent.field_B;
        gh.field_f[35] = gj.field_c;
        gh.field_f[56] = rn.field_c;
        gh.field_f[10] = SimArmedHuman.field_Eb;
        gh.field_f[61] = qc.field_w;
        gh.field_f[17] = PacketBuffer.field_h;
        gh.field_f[37] = FadingDialog.field_G;
        gh.field_f[36] = fk.field_l;
        gh.field_f[13] = hf.field_a;
        gh.field_f[44] = kn.field_e;
        gh.field_f[57] = MatchingTextValidator.field_r;
        gh.field_f[1] = rp.field_b;
        gh.field_f[6] = hc.field_a;
        gh.field_f[33] = cq.field_b;
        wq.field_g[0][0] = hb.field_a;
        wq.field_g[1][0] = jo.field_a;
        wq.field_g[2][0] = na.field_F;
        wq.field_g[3][0] = SimHuman.field_jb;
        wq.field_g[4][0] = qf.field_e;
        wq.field_g[5][0] = ChatMessage.field_c;
        wq.field_g[6][0] = eb.field_i;
        wq.field_g[7][0] = s.field_d;
        wq.field_g[8][0] = SimPortal.field_P;
        wq.field_g[9][0] = me.field_c;
        wq.field_g[10][0] = ClientException.field_j;
        wq.field_g[11][0] = wp.field_a;
        wq.field_g[12][0] = QuickChatHelpDialog.field_Kb;
        wq.field_g[13][0] = SecondaryNodeDeque.field_f;
        wq.field_g[14][0] = TextInputValidator.field_n;
        wq.field_g[15][0] = LinkButtonPainter.field_c;
        wq.field_g[16][0] = ha.field_h;
        wq.field_g[17][0] = DelayedPacket.field_i;
        wq.field_g[18][0] = UnitView.field_Z;
        wq.field_g[61][0] = fk.field_o;
        wq.field_g[60][0] = og.field_P;
        wq.field_g[59][0] = TextWidgetPainter.field_k;
        wq.field_g[58][0] = MusicPatch.field_i;
        wq.field_g[57][0] = wi.field_p;
        wq.field_g[56][0] = BirthDateInputWidget.field_V;
        wq.field_g[55][0] = PortalView.field_F;
        wq.field_g[54][0] = FadingDialog.field_O;
        wq.field_g[53][0] = PasswordValidator.field_u;
        wq.field_g[52][0] = DelayedPacket.field_m;
        wq.field_g[51][0] = nk.field_f;
        wq.field_g[50][0] = SocketConnector.field_d;
        wq.field_g[49][0] = ContextMenu.field_Sb;
        wq.field_g[48][0] = uf.field_d;
        wq.field_g[47][0] = cn.field_u;
        wq.field_g[46][0] = SimHuman.field_ob;
        wq.field_g[45][0] = me.field_m;
        wq.field_g[44][0] = hn.field_b;
        wq.field_g[32][0] = ic.field_j;
        wq.field_g[33][0] = ResizableDialog.field_U;
        wq.field_g[34][0] = ReportAbuseDialog.field_Ob;
        wq.field_g[35][0] = dd.field_c;
        wq.field_g[36][0] = mn.field_s;
        wq.field_g[37][0] = uf.field_c;
        wq.field_g[38][0] = InflaterDecompressor.field_g;
        wq.field_g[0][1] = UiComponent.field_db;
        wq.field_g[1][1] = PortalEntryEvent.field_j;
        wq.field_g[2][1] = UiWidget.field_t;
        wq.field_g[3][1] = VerticalScrollbar.field_Nb;
        wq.field_g[4][1] = ha.field_n;
        wq.field_g[5][1] = bl.field_d;
        wq.field_g[6][1] = lo.field_e;
        wq.field_g[7][1] = SimUnit.field_bb;
        wq.field_g[8][1] = TertiaryLinkDeque.field_d;
        wq.field_g[9][1] = SimZombie.field_ib;
        wq.field_g[10][1] = eo.field_c;
        wq.field_g[11][1] = nh.field_j;
        wq.field_g[12][1] = uc.field_d;
        wq.field_g[13][1] = rq.field_n;
        wq.field_g[14][1] = cc.field_d;
        wq.field_g[15][1] = pp.field_o;
        wq.field_g[16][1] = ArrayWidgetGroup.field_D;
        wq.field_g[17][1] = NavigationGrid.field_e;
        wq.field_g[18][1] = vf.field_a;
        wq.field_g[61][1] = ClickMarker.field_q;
        wq.field_g[60][1] = ih.field_b;
        wq.field_g[59][1] = vc.field_f;
        wq.field_g[58][1] = ok.field_i;
        wq.field_g[57][1] = UsernameAvailabilityValidator.field_u;
        wq.field_g[56][1] = lh.field_a;
        wq.field_g[55][1] = ResourceArchive.field_c;
        if (param0 != -6445) {
          UnitStateEvent.a(-95);
        }
        wq.field_g[54][1] = ResourceArchive.field_h;
        wq.field_g[53][1] = cr.field_g;
        wq.field_g[52][1] = wj.field_j;
        wq.field_g[51][1] = PowerupCommand.field_l;
        wq.field_g[50][1] = dd.field_b;
        wq.field_g[49][1] = PowerupButton.field_g;
        wq.field_g[48][1] = BirthDateEntryPanel.field_O;
        wq.field_g[47][1] = ResourceArchive.field_i;
        wq.field_g[46][1] = AccountCreationForm.field_X;
        wq.field_g[45][1] = ip.field_d;
        wq.field_g[44][1] = TertiaryLinkNode.field_q;
        wq.field_g[32][1] = UiWidget.field_o;
        wq.field_g[33][1] = WhirlpoolHasher.field_g;
        wq.field_g[34][1] = vg.field_q;
        wq.field_g[35][1] = wq.field_e;
        wq.field_g[36][1] = va.field_b;
        wq.field_g[37][1] = cb.field_r;
        wq.field_g[38][1] = UiTheme.field_q;
    }

    final static String a(boolean param0, int param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3 = QuickChatHelpDialog.a(param0, -107, param2);
          if (var3 != null) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          var4 = 61 / ((param1 - 14) / 63);
          var5 = 0;
          do {
            if (param2.length() <= var5) {
              return null;
            }
            if (!fl.a(-82, param2.charAt(var5))) {
              stackIn_11_0 = um.field_i;
              return stackIn_11_0;
            }
            var5++;
          } while (var6 == 0);
          stackIn_14_0 = null;
          return (String) (stackIn_14_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("so.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void a(int param0, long param1, int param2) {
        CipherPacketBuffer var4 = ma.field_a;
        var4.b((byte) -35, param2);
        var4.position = var4.position + 1;
        int var5 = var4.position;
        if (param0 != -21148) {
          return;
        }
        var4.writeByte(param0 + 21034, 6);
        var4.a(param1, true);
        var4.e(44, var4.position - var5);
    }

    final static void a(int param0, boolean param1, boolean param2, boolean param3, int param4) {
        UiComponent stackIn_20_0 = null;
        boolean stackIn_21_1 = false;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_65_0 = 0;
        int stackIn_71_0 = 0;
        boolean stackIn_81_0 = false;
        int stackIn_88_0 = 0;
        boolean stackIn_135_0 = false;
        int stackIn_151_0 = 0;
        UiComponent stackIn_176_0 = null;
        int stackIn_176_1 = 0;
        boolean stackIn_177_2 = false;
        UiComponent stackIn_181_0 = null;
        int stackIn_181_1 = 0;
        boolean stackIn_182_2 = false;
        UiComponent stackIn_186_0 = null;
        int stackIn_186_1 = 0;
        boolean stackIn_187_2 = false;
        Object stackIn_188_0 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_80_0;
        boolean stackOut_134_0;
        RuntimeException var5 = null;
        UiComponent var6 = null;
        UiComponent var7 = null;
        UiComponent var8 = null;
        int var9 = 0;
        String var9_ref_String = null;
        String var10_ref_String = null;
        int var10 = 0;
        int var11 = 0;
        Object var11_ref = null;
        int var12 = 0;
        int[] var13_ref_int__ = null;
        int var13 = 0;
        String var13_ref_String = null;
        int var14 = 0;
        String var14_ref_String = null;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        IntrusiveDeque var17 = null;
        Object var18 = null;
        int var18_int = 0;
        LobbyPlayer var18_ref = null;
        int var19 = 0;
        int[] var20 = null;
        UiComponent var22 = null;
        int[] var23 = null;
        String var24 = null;
        int[] var25 = null;
        UiComponent var26 = null;
        int stackIn_56_0Lifetime1;
        int stackIn_56_1Lifetime1;
        int stackIn_65_0Lifetime1;
        int var13Lifetime1;
        int var18_intLifetime1;
        var18 = null;
        var19 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          boolean decompiledFrameCompleted0 = true;
          MouseWheelInput.a(InflaterDecompressor.field_a, false);
          if (null != JaggrabDownloader.field_c) {
            jp.field_b.field_Z = true;
            en.field_b.field_z = 0;
            var22 = en.field_b;
            var26 = var22;
            var26.field_zb = 0;
            var6 = GameKeyHandler.field_a;
            GameKeyHandler.field_a.field_z = 0;
            var6.field_zb = 0;
            eb.field_B.field_z = 0;
            var7 = eb.field_B;
            var7.field_zb = 0;
            if (hl.b(0)) {
              gg.field_m.field_wb = ClientException.field_l.toUpperCase();
              var9 = (2 + LevelData.field_a.field_zb) / 2;
              en.field_b.setBounds(40, LevelData.field_a.field_z - 40, var9 - 2, 0, -3344);
              if (JaggrabDownloader.field_c.field_mc > JaggrabDownloader.field_c.field_cc) {
                en.field_b.field_wb = p.field_c.toUpperCase();
                en.field_b.field_Z = true;
                if (var19 != 0) {
                  en.field_b.field_wb = ChatMessage.field_p.toUpperCase();
                  en.field_b.field_Z = false;
                }
              } else {
                en.field_b.field_wb = ChatMessage.field_p.toUpperCase();
                en.field_b.field_Z = false;
              }
              en.field_b.field_ab = LinkButtonPainter.field_i.field_ab;
              if (cb.field_i > 0) {
                boolean decompiledSharedTail2 = (cb.field_i != 1);
                if (!decompiledSharedTail2) {
                  var10_ref_String = u.field_k;
                  decompiledSharedTail2 = (var19 != 0);
                }
                if (decompiledSharedTail2) {
                  var10_ref_String = vl.a(uk.field_R, new String[]{Integer.toString(cb.field_i)}, 2);
                }
                en.field_b.field_wb = en.field_b.field_wb + "<br>" + var10_ref_String;
                if ((PowerupCommand.field_i & 16) == 0 &&
                  !io.field_b) {
                  en.field_b.field_ab = LinkButtonPainter.field_i.field_X;
                }
              }
              GameKeyHandler.field_a.setBounds(40, -40 + LevelData.field_a.field_z, LevelData.field_a.field_zb - var9, var9, -3344);
              GameKeyHandler.field_a.field_wb = Waypoint.field_f.toUpperCase();
              var8 = GameKeyHandler.field_a;
              stackIn_20_0 = GameKeyHandler.field_a;
              stackIn_21_1 = (param3) && (0L == qi.field_c);
              stackIn_20_0.field_Z = stackIn_21_1;
              var10 = 2;
              if (iq.field_b != null) {
                if (null == GameSimulation.field_v) {
                  GameSimulation.field_v = new byte[kj.field_h];
                  FullscreenFocusCanvas.field_c = new boolean[kj.field_h];
                }
                var11 = 0;
                do {
                  if (!(var11 < kj.field_h)) {
                    var10 = 0;
                    break;
                  }
                  FullscreenFocusCanvas.field_c[var11] = false;
                  var11++;
                } while (var19 == 0);
                scanLoop1: while (true) {
                  if (var10 < 2) {
                    var11 = 0;
                    stackIn_71_0 = 0;
                    if (var19 != 0) {
                      break scanLoop1;
                    }
                    var12 = stackIn_71_0;
                    while (true) {
                      stackIn_35_0 = iq.field_b.length;
                      stackIn_35_1 = var12;
                      if (stackIn_35_0 > stackIn_35_1) {
                        var25 = iq.field_b[var12];
                        var23 = var25;
                        var20 = var23;
                        var13_ref_int__ = var20;
                        stackIn_65_0 = 0;
                        var14 = stackIn_65_0;
                        scanLoop2: while (true) {
                          if (var14 < var25.length) {
                            var15 = var25[var14];
                            var16 = var20[var14 + 1];
                            stackIn_56_0 = var15;
                            stackIn_56_1 = -1;
                            if (stackIn_56_0 == stackIn_56_1) {
                              if (var10 == 0) {
                                stackIn_44_0 = JaggrabDownloader.field_c.field_mc;
                              } else {
                                stackIn_44_0 = JaggrabDownloader.field_c.field_cc;
                              }
                              var17_int = stackIn_44_0;
                              if (var17_int != var16 &&
                                var19 == 0) {
                                break scanLoop2;
                              }
                            } else {
                              if (~(JaggrabDownloader.field_c.field_Zb[var15] & 255) != ~var16 &&
                                var19 == 0) {
                                break scanLoop2;
                              }
                            }
                            var14 += 2;
                            continue;
                          }
                          var11 = 1;
                          var14 = -1;
                          var15 = 0;
                          while (true) {
                            stackIn_56_0Lifetime1 = ~var25.length;
                            stackIn_56_1Lifetime1 = ~var15;
                            if (stackIn_56_0Lifetime1 >= stackIn_56_1Lifetime1) {
                              break;
                            }
                            var16 = var25[var15];
                            stackIn_35_0 = var16;
                            stackIn_35_1 = var14;
                            if (stackIn_35_0 > stackIn_35_1) {
                              var14 = var16;
                            }
                            var15 += 2;
                          }
                          FullscreenFocusCanvas.field_c[var14] = true;
                          break;
                        }
                        var12++;
                        continue;
                      }
                      break;
                    }
                    stackIn_65_0Lifetime1 = var11;
                    if (stackIn_65_0Lifetime1 == 0 ||
                      var19 != 0) {
                      var10++;
                      continue;
                    }
                  }
                  stackIn_71_0 = kj.field_q;
                  break;
                }
                if (stackIn_71_0 >= 2 &&
                  lc.field_m[12]) {
                  var10 = 2;
                }
              }
              boolean decompiledFrameRemainder0 = true;
              if (var10 < 2) {
                GameKeyHandler.field_a.field_Z = false;
                decompiledFrameRemainder0 = !(!GameKeyHandler.field_a.field_pb);
                if (decompiledFrameRemainder0) {
                  var11_ref = null;
                  var12 = 0;
                  var13 = 0;
                  while (true) {
                    if (kj.field_h > var13) {
                      stackOut_80_0 = FullscreenFocusCanvas.field_c[var13];
                      stackIn_88_0 = stackOut_80_0 ? 1 : 0;
                      stackIn_81_0 = stackOut_80_0;
                      if (var19 == 0) {
                        if (stackIn_81_0) {
                          var24 = "<col=A00000>" + UiWidget.field_f[var13] + "</col>";
                          if (var11_ref != null) {
                            var12 = 1;
                            var11_ref = (String) (var11_ref) + ", " + var24;
                          } else {
                            var11_ref = var24;
                          }
                        }
                        var13++;
                        continue;
                      }
                    } else {
                      stackIn_88_0 = -1;
                    }
                    break;
                  }
                  if (stackIn_88_0 == ~var10) {
                    var13_ref_String = DiskCacheWorker.field_d;
                    boolean decompiledSharedTail1 = (var12 == 0);
                    if (!decompiledSharedTail1) {
                      var14_ref_String = NetworkGameClient.field_n + (String) (var11_ref);
                      decompiledSharedTail1 = (var19 != 0);
                    }
                    if (decompiledSharedTail1) {
                      var14_ref_String = vl.a(wq.field_f, new String[]{(String) (var11_ref)}, 2);
                    }
                  } else {
                    var13_ref_String = vb.field_e;
                    boolean decompiledSharedTail0 = (var12 == 0);
                    if (!decompiledSharedTail0) {
                      var14_ref_String = ClickMarker.field_k + (String) (var11_ref);
                      decompiledSharedTail0 = (var19 != 0);
                    }
                    if (decompiledSharedTail0) {
                      var14_ref_String = vl.a(kn.field_d, new String[]{(String) (var11_ref)}, param0 - 48);
                    }
                  }
                  ui.field_j = "<col=A00000>" + var13_ref_String + "<br>" + var14_ref_String;
                }
              }
              if ((decompiledFrameRemainder0) && (!(var10 < 2) || var19 != 0) && (null != IntrusiveDequeCursor.field_g ||
                DropTargetWidget.field_G != null ||
                r.field_c != null ||
                na.field_J != null)) {
                var11 = 0;
                var12 = 0;
                var13Lifetime1 = 0;
                var14 = 0;
                var15 = 0;
                var16 = 0;
                while (kj.field_h > var16) {
                  var17_int = 255 & JaggrabDownloader.field_c.field_Zb[var16];
                  stackIn_188_0 = null;
                  if (var19 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (stackIn_188_0 != IntrusiveDequeCursor.field_g &&
                    IntrusiveDequeCursor.field_g[var16] != null &&
                    IntrusiveDequeCursor.field_g[var16][var17_int]) {
                    var11 = 1;
                  }
                  if (null != DropTargetWidget.field_G &&
                    DropTargetWidget.field_G[var16] != null) {
                    var18_int = DropTargetWidget.field_G[var16][var17_int];
                    if (var18_int > var13Lifetime1) {
                      var13Lifetime1 = var18_int;
                    }
                    if (var18_int != 0 &&
                      !bo.field_e) {
                      var11 = 1;
                    }
                  }
                  if (na.field_J != null &&
                    na.field_J[var16] != null) {
                    var15 = var15 | na.field_J[var16][var17_int];
                  }
                  if (null != r.field_c &&
                    r.field_c[var16] != null) {
                    var18_intLifetime1 = r.field_c[var16][var17_int];
                    if (var18_intLifetime1 != 0 &&
                      !bo.field_e) {
                      var11 = 1;
                    }
                    if (var14 < var18_intLifetime1) {
                      var14 = var18_intLifetime1;
                    }
                  }
                  var16++;
                }
                if (decompiledFrameCompleted0) {
                  var16 = 0;
                  var17 = bf.field_n.field_Gb.field_Cb;
                  var18_ref = (LobbyPlayer) (var17.c(81));
                  while (true) {
                    boolean decompiledFrameRemainder1 = true;
                    boolean decompiledFrameRemainder2 = true;
                    if (var18_ref != null) {
                      stackOut_134_0 = var18_ref.c((byte) 15);
                      stackIn_151_0 = stackOut_134_0 ? 1 : 0;
                      stackIn_135_0 = stackOut_134_0;
                      decompiledFrameRemainder1 = (var19 == 0);
                      if (decompiledFrameRemainder1) {
                        if (!stackIn_135_0) {
                          if (var11 != 0 &&
                            !var18_ref.field_Nb) {
                            var16 = 1;
                            decompiledFrameRemainder2 = false;
                          }
                          else {
                            if (var13Lifetime1 > var18_ref.field_Mb) {
                              var16 = 1;
                              decompiledFrameRemainder2 = false;
                            }
                            else {
                              if (var14 > var18_ref.field_Sb) {
                                var16 = 1;
                                decompiledFrameRemainder2 = false;
                              }
                              else {
                                if ((~var18_ref.field_Vb & var15) > 0) {
                                  var16 = 1;
                                  decompiledFrameRemainder2 = false;
                                }
                                else {
                                  if (var12 != 0) {
                                    var16 = 1;
                                    decompiledFrameRemainder2 = false;
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (decompiledFrameRemainder2) {
                          var18_ref = (LobbyPlayer) (var17.b(6));
                          continue;
                        }
                      }
                    }
                    if (decompiledFrameRemainder1) {
                      stackIn_151_0 = ~kj.field_q;
                    }
                    if (stackIn_151_0 <= -3 &&
                      lc.field_m[12]) {
                      var16 = 0;
                    }
                    if (var16 == 0) {
                      break;
                    }
                    GameKeyHandler.field_a.field_Z = false;
                    if (!GameKeyHandler.field_a.field_pb) {
                      break;
                    }
                    if (BirthDateInputWidget.field_U.field_c.field_Kb != 0) {
                      ui.field_j = vl.a(rn.field_b, new String[]{RasterBuffer.field_d}, 2);
                      if (var19 == 0) {
                        break;
                      }
                    }
                    ui.field_j = ChatMessage.field_s;
                    break;
                  }
                }
              }
              if ((decompiledFrameCompleted0) &&
                (var19 != 0)) {
                var9_ref_String = JaggrabDownloader.field_c.field_Nb;
                gg.field_m.field_wb = vl.a(GameEvent.field_g, new String[]{var9_ref_String}, 2).toUpperCase();
                eb.field_B.setBounds(40, LevelData.field_a.field_z - 40, LevelData.field_a.field_zb, 0, -3344);
                eb.field_B.field_wb = vl.a(mp.field_a, new String[]{var9_ref_String}, 2);
                var8 = eb.field_B;
              }
            } else {
              var9_ref_String = JaggrabDownloader.field_c.field_Nb;
              gg.field_m.field_wb = vl.a(GameEvent.field_g, new String[]{var9_ref_String}, 2).toUpperCase();
              eb.field_B.setBounds(40, LevelData.field_a.field_z - 40, LevelData.field_a.field_zb, 0, -3344);
              eb.field_B.field_wb = vl.a(mp.field_a, new String[]{var9_ref_String}, 2);
              var8 = eb.field_B;
            }
            if (decompiledFrameCompleted0) {
              if (qi.field_c != 0L) {
                var9 = (int)(-bl.a((byte) 97) + qi.field_c);
                var9 = (var9 + 999) / 1000;
                if (var9 < 1) {
                  var9 = 1;
                }
                var8.field_wb = vl.a(SimZombie.field_pb, new String[]{Integer.toString(var9)}, param0 ^ 48);
              }
              ClientException.field_h.field_wb = vl.a(pb.field_g, new String[]{Integer.toString(JaggrabDownloader.field_c.field_cc), Integer.toString(JaggrabDownloader.field_c.field_mc)}, 2);
            }
          }
          if (decompiledFrameCompleted0) {
            if (param0 != 50) {
              field_t = (ma) null;
            }
            stackIn_176_0 = JaggrabDownloader.field_i;
            stackIn_176_1 = -11838;
            stackIn_177_2 = (param1) && (!param2) && (!io.field_b);
            ((UiComponent) (Object) stackIn_176_0).a(stackIn_176_1, stackIn_177_2);
            stackIn_181_0 = LevelData.field_a;
            stackIn_181_1 = -11838;
            stackIn_182_2 = (param1) && (!param2) && (!io.field_b);
            ((UiComponent) (Object) stackIn_181_0).a(stackIn_181_1, stackIn_182_2);
            stackIn_186_0 = qf.field_b;
            stackIn_186_1 = -11838;
            stackIn_187_2 = (param1) && (!param2) && (io.field_b);
            ((UiComponent) (Object) stackIn_186_0).a(stackIn_186_1, stackIn_187_2);
            BirthDateInputWidget.field_U.field_c.processTabPresses(-40);
            stackIn_188_0 = null;
          }
          if (stackIn_188_0 != JaggrabDownloader.field_c) {
            if (jp.field_b.field_T != 0) {
              ml.a(JaggrabDownloader.field_c.i(6), param4, -76);
            }
            if (0 != en.field_b.field_T) {
              io.field_b = true;
            }
            if (0 != GameKeyHandler.field_a.field_T) {
              UiWidget.field_r = true;
            }
            if (pg.field_a.field_T != 0) {
              io.field_b = false;
            }
            QuickChatMenu.a(JaggrabDownloader.field_c, false, param4, 1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var5), "so.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean c(int param0) {
        lp var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        lp var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var4 = (lp) (we.field_k.c(74));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          var2 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var2 < var1.field_n)))) {
            if (var3 == 0) {
              if (var4.field_m[var2] != null &&
                0 == var4.field_m[var2].field_f) {
                return false;
              }
              if (var4.field_l[var2] != null &&
                var4.field_l[var2].field_f == 0) {
                return false;
              }
              var2++;
              continue;
            }
            break;
          }
          if ((decompiledNaturalLoopExit0) &&
            (param0 != 1)) {
            field_k = (PacketBuffer) null;
            return true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1_ref), "so.P(" + param0 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (this.field_p == 1) {
          return;
        }
        pb.field_e.c(Integer.toString(this.field_f - param3), this.field_q >> -param2 + 16, this.field_u >> 16 - param0, 4, -1);
        pb.field_e.c(Integer.toString(-param3 + this.field_f), -param2 + this.field_i, -param0 + this.field_m, 0, -1);
        if (!param1) {
          field_k = (PacketBuffer) null;
        }
        SoftwareRasterizer.d(this.field_q >> 16 - param2, this.field_u >> 16 - param0, this.field_i - param2, -param0 + this.field_m, 16711680, 10);
    }

    final static void a(int[] param0, boolean param1, int param2, int param3, int param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          while (true) {
            param3--;
            if (param3 >= 0) {
              var9 = param0;
              var5 = var9;
              var6 = param2;
              var7 = param4;
              var9[var6] = var7 + ScrollPane.b(8355711, var9[var6] >> 1);
              param2++;
              if (var8 != 0) {
                return;
              }
              continue;
            }
            break;
          }
          if (!param1) {
            field_k = (PacketBuffer) null;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_10_0 = var5_ref;
          stackIn_10_1 = new StringBuilder().append("so.I(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, GameScreen param1) {
        try {
          param1.applyUnitState(this.field_v, this.field_q, false, this.field_m, this.field_n, this.field_u, this.field_p, this.field_i);
          if (param0 != 0) {
            UnitStateEvent.a(-46, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "so.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7, int param8) {
        if (param7) {
          this.a((byte) 113);
        }
        super.a(0, param2);
        this.field_p = param8;
        this.field_n = param3;
        this.field_v = param0;
        this.field_q = param1;
        this.field_u = param4;
        this.field_m = param5;
        this.field_i = param6;
    }

    UnitStateEvent() {
    }

    static {
        field_j = new IntrusiveDeque();
        field_t = new ma();
        field_o = new ao(2, 4, 4, 0);
    }
}
