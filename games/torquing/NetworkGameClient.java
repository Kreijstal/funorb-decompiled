/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class NetworkGameClient extends GameApplet {
    private int field_k;
    private int field_r;
    private boolean field_o;
    private boolean field_n;
    private long field_s;
    private int field_q;
    private int field_p;
    private int field_l;
    String field_i;
    private int field_m;
    private boolean field_j;

    final void initializeClientServices(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        if (param3 >= -24) {
          return;
        }
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        ImageProducerRasterBuffer.field_i = this.field_k;
        AccountNameAvailabilityValidator.a((byte) 52, ImageProducerRasterBuffer.field_i);
        in.a(this.field_l, this.field_o, this.field_i, param0, ImageProducerRasterBuffer.field_i, 5000, this.field_r, ArchiveRequest.field_u, param2, this.field_p, 0, this.field_s, 5000, this.field_m);
        mg.a(-1, ImageProducerRasterBuffer.field_i, this.field_r, this.field_m, ArchiveRequest.field_u, this.field_l, this.field_i, this.field_p, param0);
        qg.d(-125);
        wb.field_u = ResourceArchive.createMouseWheelInput(26);
        Bzip2State.a(k.field_d, (byte) -125);
        b.field_w = param6;
        TooltipPanel.field_p = param1;
        TextFieldValidator.field_k = param5;
        ug.field_b = param4;
        tp.field_g = param7;
        this.initializePacketLengths(11);
        rn.a(-117);
    }

    private final static void m(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Torquing.field_u;
        try {
          var1 = FrameTimer.field_b;
          synchronized (var1) {
            IntrusiveNode.field_g = mj.field_d;
            po.field_w = po.field_w + 1;
            if (0 > hb.field_y) {
              for (var2 = 0; var2 < 112; var2++) {
                FullscreenStatusDialog.field_P[var2] = false;
              }
              hb.field_y = n.field_w;
            } else {
              while (n.field_w != hb.field_y) {
                var2 = BufferedSocket.field_i[n.field_w];
                n.field_w = 127 & n.field_w + 1;
                if (var2 >= 0) {
                  FullscreenStatusDialog.field_P[var2] = true;
                  continue;
                }
                FullscreenStatusDialog.field_P[~var2] = false;
              }
            }
            mj.field_d = IsaacCipher.field_d;
          }
          if (param0 > -26) {
            NetworkGameClient.m(67);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) var1_ref), "tg.R(" + param0 + ')');
        }
    }

    final void updateClientServices(byte param0, boolean param1) {
        int stackIn_22_0 = 0;
        boolean stackIn_100_0 = false;
        String stackIn_102_1 = null;
        boolean stackIn_103_2 = false;
        int stackIn_133_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = Torquing.field_u;
        if (AccountRegistrationPanel.field_D != null) {
          if (TranslucentSpriteLayer.field_i == null) {
            var6 = lp.b(20);
            var4 = var6.getSize();
            AccountRegistrationPanel.field_D.a(var4.width, false, var4.height);
          }
          AccountRegistrationPanel.field_D.a((byte) -110);
        }
        NetworkGameClient.m(param0 ^ -104);
        ProxySocketConnector.c(24417);
        if (!sf.a(param0 ^ -24) &&
          11 != op.field_i) {
          ra.a((byte) 75);
        }
        if (wb.field_u != null) {
          da.field_g = wb.field_u.pollRotation(0);
        }
        if (oo.a(16158)) {
          var3 = n.c((byte) 57) * 1200;
          if (this.field_n ||
            !(var3 >= k.b(124)) &&
            !(var3 >= NetworkArchiveRequest.d((byte) -97))) {
            this.field_n = false;
            ih.b(true);
            InteractiveWidget.h(-101);
            dc.a(2, gh.field_b, 2);
            FullscreenFocusCanvas.a(false);
            gk.field_a = true;
            DualLinkNode.field_k = km.correctedCurrentTimeMillis(-1) + 15000L;
          }
        }
        if (DraggableWidgetContainer.field_J == -1 ||
          DraggableWidgetContainer.field_J == 0) {
          stackIn_22_0 = (DraggableWidgetContainer.field_J != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_22_0;
          DraggableWidgetContainer.field_J = un.a(0);
          if (var3Lifetime1 != 0 &&
            0 == DraggableWidgetContainer.field_J &&
            op.field_i == 11 &&
            !mk.a((byte) 38)) {
            qa.a((byte) -72);
          }
          if (DraggableWidgetContainer.field_J != -1 &&
            DraggableWidgetContainer.field_J != 0) {
            DualLinkNode.field_k = km.correctedCurrentTimeMillis(-1) + 15000L;
          }
        }
        if (DraggableWidgetContainer.field_J != -1 &&
          0 != DraggableWidgetContainer.field_J) {
          if (b.field_x < 10) {
            if (DraggableWidgetContainer.field_J == 3) {
              this.a(10, "js5crc");
            } else {
              if (DraggableWidgetContainer.field_J == 4) {
                this.a(param0 - 13, "js5io");
              } else {
                if (2 != DraggableWidgetContainer.field_J) {
                  if (DraggableWidgetContainer.field_J != 5) {
                    this.a(10, "js5connect");
                  } else {
                    this.a(10, "outofdate");
                  }
                } else {
                  this.a(10, "js5connect_full");
                }
              }
            }
          } else {
            if (op.field_i >= 10) {
              InteractiveWidget.h(param0 ^ -107);
              if (DraggableWidgetContainer.field_J != 3) {
                if (DraggableWidgetContainer.field_J == 4) {
                  dc.a(256, ib.field_a, 2);
                } else {
                  if (DraggableWidgetContainer.field_J == 2) {
                    dc.a(256, ra.field_b, param0 - 21);
                  } else {
                    if (DraggableWidgetContainer.field_J != 5) {
                      dc.a(256, jk.field_b, 2);
                    } else {
                      dc.a(5, e.field_d, 2);
                    }
                  }
                }
              } else {
                dc.a(256, bm.field_r, param0 ^ 21);
              }
              gk.field_a = true;
            }
          }
        }
        if ((-1 != DraggableWidgetContainer.field_J &&
          DraggableWidgetContainer.field_J != 0 ||
          mk.a((byte) 38)) &&
          DualLinkNode.field_k <= km.correctedCurrentTimeMillis(-1)) {
          gk.field_a = false;
          if (DraggableWidgetContainer.field_J != -1 &&
            DraggableWidgetContainer.field_J != 0) {
            DraggableWidgetContainer.field_J = -1;
            jl.b((byte) 106);
          }
        }
        if (DraggableWidgetContainer.field_J == 0 &&
          !mk.a((byte) 38)) {
          MenuScreen.field_g = false;
        }
        if (b.field_x == 0 &&
          sb.b(-80)) {
          b.field_x = 1;
        }
        if (1 == b.field_x) {
          if (ImageProducerRasterBuffer.field_i != 0) {
            je.field_f = vg.a(-27646, b.field_w);
          }
          lp.field_a = sd.a(true, 1, (byte) -125, tp.field_g, false);
          eg.field_v = sd.a(true, 1, (byte) -84, ug.field_b, false);
          kb.field_a = sd.a(true, 1, (byte) -65, TextFieldValidator.field_k, false);
          e.field_b = eg.field_v;
          rp.field_d = lp.field_a;
          b.field_x = 2;
        }
        if (b.field_x == 2) {
          if (null != je.field_f &&
            je.field_f.ensureIndexLoaded(-12749)) {
            if (!je.field_f.hasGroupName((byte) -58, "")) {
              je.field_f = null;
            } else {
              if (je.field_f.tryLoadGroupByName(true, "")) {
                SocketJs5Transport.a(7, je.field_f);
                je.field_f = null;
                cf.a(param0 ^ 6648);
              }
            }
          }
          if (null == je.field_f) {
            b.field_x = 3;
          }
        }
        if (b.field_x == 3 &&
          ro.a((byte) 54, lp.field_a, kb.field_a, eg.field_v) &&
          pg.a(true, kb.field_a)) {
          od.c(-8431868);
          mk.a(true);
          ob.field_b = vo.field_e;
          r.field_c = false;
          ArchiveIndex.a(SocketConnector.field_b, lp.field_a, 0, kb.field_a, eg.field_v);
          if (ra.field_a ||
            null != vo.field_c) {
            stackIn_100_0 = !(ra.field_a);
            stackIn_102_1 = vo.field_c;
            stackIn_103_2 = !(ra.field_a);
            vb.a(stackIn_100_0, stackIn_102_1, stackIn_103_2, param0 ^ 4818);
          }
          if (ii.field_n) {
            eh.c((byte) 90);
          }
          if (kb.field_d == null) {
            kb.field_d = rg.a(true);
            StandardContentDialog.field_Z = c.a(24852);
          }
          cl.a(StandardContentDialog.field_Z, false, kb.field_d, kb.field_a);
          eg.field_v = null;
          kb.field_a = null;
          lp.field_a = null;
          ne.a((java.applet.Applet) (this), 0);
          cf.a(6639);
          b.field_x = 10;
        }
        if (b.field_x == 10) {
          if (0 != ImageProducerRasterBuffer.field_i) {
            rd.field_z = vg.a(-27646, TooltipPanel.field_p);
          }
          b.field_x = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (b.field_x == 11) {
          if (null != rd.field_z && (!rd.field_z.ensureIndexLoaded(-12749) ||
            !rd.field_z.tryLoadAllGroups(-19375))) {
            IsaacPacketBuffer.a(0.0f, -84, AccountNameAvailabilityValidator.a(Torquing.field_w, rd.field_z, DelegatingCanvas.field_b, (byte) 78));
            decompiledFrameRemainder0 = false;
          }
          else {
            b.field_x = 12;
            w.field_F = true;
          }
        }
        if (b.field_x == 12 &&
          !w.field_F) {
          b.field_x = 13;
        }
        if (b.field_x == 13) {
          var3Lifetime2 = 1;
          if (null != a.field_c) {
            stackIn_133_0 = (!a.field_c.b(param0 ^ 23)) ? 0 : 1;
            var3Lifetime2 = stackIn_133_0;
            IsaacPacketBuffer.a(a.field_c.field_l, 75, a.field_c.field_h);
          }
          if (var3Lifetime2 != 0) {
            b.field_x = 20;
          }
        }
        if (!param1 &&
          b.field_v) {
          tf.a(-101, k.field_d);
          this.a(false);
          Bzip2State.a(k.field_d, (byte) -118);
        }
        if (FullscreenNoticeType.field_d[8]) {
          kj.a(8);
        }
        if (param0 != 23) {
          this.field_k = 113;
        }
    }

    private final void initializePacketLengths(int param0) {
        ArchiveRequest.field_s[6] = -2;
        ArchiveRequest.field_s[7] = -1;
        ArchiveRequest.field_s[17] = -1;
        ArchiveRequest.field_s[4] = -1;
        ArchiveRequest.field_s[16] = -1;
        ArchiveRequest.field_s[2] = -2;
        ArchiveRequest.field_s[8] = -2;
        ArchiveRequest.field_s[13] = -1;
        ArchiveRequest.field_s[1] = 16;
        ArchiveRequest.field_s[3] = -1;
        ArchiveRequest.field_s[10] = -1;
        ArchiveRequest.field_s[param0] = -1;
        ArchiveRequest.field_s[5] = -1;
        ArchiveRequest.field_s[12] = -1;
        ArchiveRequest.field_s[9] = -1;
        ArchiveRequest.field_s[18] = 1;
    }

    private final void c(byte param0) {
        String var2 = ol.a(124);
        ol.a(var2, true, ip.a(param0 - 81));
        if (param0 != 90) {
          this.k(30);
        }
    }

    private final void l(int param0) {
        FullscreenNoticeType.field_d[1] = true;
        if (param0 != 0) {
          String var3 = (String) null;
          this.startAppletClient(43, (String) null, -13);
        }
    }

    final void e(byte param0) {
        int stackIn_29_0 = 0;
        boolean stackIn_30_1 = false;
        int var2;
        int var3;
        hi var4;
        int var5;
        var5 = Torquing.field_u;
        var2 = fa.field_e;
        var3 = -51 / ((param0 - 4) / 53);
        if (64 > var2 &&
          FullscreenNoticeType.field_d[var2]) {
          if (var2 == 0) {
            return;
          }
          if (1 != var2) {
            if (2 == var2) {
              AccountNameAvailabilityValidator.f(-30593);
            } else {
              if (3 == var2) {
                vd.a(27912);
              } else {
                if (var2 == 4) {
                  wh.b(99);
                } else {
                  if (var2 != 5) {
                    if (6 != var2) {
                      if (var2 != 7) {
                        if (var2 == 8) {
                          nh.a(ArchiveRequest.field_u, oo.field_a, kj.field_d, (byte) -126);
                        } else {
                          if (var2 == 16) {
                            ti.b(1);
                          } else {
                            if (11 != var2 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                ld.a((byte) 123);
                                return;
                              }
                              if (var2 == 17) {
                                this.k(1);
                                return;
                              }
                              if (18 == var2) {
                                UrlRequest.a((byte) 60);
                                return;
                              }
                              nn.a("MGS1: " + ArchiveSource.a(-1), (Throwable) null, -9958);
                              ih.b(true);
                              return;
                            }
                            stackIn_29_0 = -11936;
                            stackIn_30_1 = (var2 == 12);
                            var4 = pa.a(stackIn_29_0, stackIn_30_1);
                            ClientException.a(false, var4);
                          }
                        }
                      } else {
                        this.c((byte) 90);
                      }
                    } else {
                      en.e((byte) 50);
                    }
                  } else {
                    PasswordValidator.e(10078);
                  }
                }
              }
            }
          } else {
            TooltipPanel.b(-109);
          }
          return;
        }
        nn.a("MGS2: " + ArchiveSource.a(-1), (Throwable) null, -9958);
        ih.b(true);
    }

    private final void i(int param0) {
        FullscreenNoticeType.field_d[2] = true;
        if (param0 != 24500) {
          this.b(false, 7);
        }
    }

    private final void a(boolean param0, byte param1) {
        FullscreenNoticeType.field_d[7] = true;
        FullscreenNoticeType.field_d[16] = true;
        if (param1 > -90) {
          return;
        }
        FullscreenNoticeType.field_d[8] = param0;
        FullscreenNoticeType.field_d[17] = true;
        FullscreenNoticeType.field_d[0] = true;
        FullscreenNoticeType.field_d[18] = true;
        FullscreenNoticeType.field_d[3] = true;
    }

    final int g(int param0) {
        int var2;
        int var3;
        var2 = -125 / ((param0 - 70) / 47);
        var3 = this.pollLoginConnection(-93);
        if (0 == var3 ||
          1 == var3) {
          if (FullscreenNoticeType.field_d[1]) {
            StripedProgressWidget.b(2, -8190);
          }
          if (FullscreenNoticeType.field_d[2]) {
            ag.a((byte) -45, 3);
          }
          if (FullscreenNoticeType.field_d[3]) {
            DirectByteStorage.a(4, 0);
          }
          if (FullscreenNoticeType.field_d[4]) {
            km.a((byte) -128, 5);
          }
          if (FullscreenNoticeType.field_d[5]) {
            DropTargetWidgetContainer.a(true, 6);
          }
          if (FullscreenNoticeType.field_d[6]) {
            fa.a(7, -21386);
          }
          if (FullscreenNoticeType.field_d[8]) {
            kg.a(112);
          }
        }
        return var3;
    }

    private final void k(int param0) {
        int var2 = kj.field_d.readUnsignedByte((byte) -101);
        int var3 = (param0 & var2) != 0 ? 1 : 0;
        int var4 = -1 + oo.field_a;
        byte[] var5 = new byte[var4];
        kj.field_d.b(0, param0 + 7, var5, var4);
        a.a(var3 != 0, SecondaryNodeDeque.a(var5, false), ip.a(9), 3);
    }

    private final void d(byte param0) {
        if (param0 != 84) {
          this.field_l = -57;
        }
        FullscreenNoticeType.field_d[5] = true;
    }

    final void startAppletClient(int param0, String param1, int param2) {
        try {
          this.readAppletConfigurationAndStart((byte) 88, param0, 480, 640, param1);
          int var4_int = 56 % ((28 - param2) / 53);
        } catch (RuntimeException runtimeException) {
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) runtimeException), "tg.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int b(boolean param0, int param1) {
        if (param1 > -85) {
          this.f(93);
        }
        return this.a(param0, true, true);
    }

    private final int pollLoginConnection(int param0) {
        if (this.field_e) {
          return -1;
        }
        if (!mk.a((byte) 38)) {
          return -1;
        }
        if (param0 > -68) {
          return 107;
        }
        if (gk.field_a) {
          return -1;
        }
        int var2 = vb.a(DialogMessagePane.i(17543), AccountRegistrationPanel.i(20), (byte) 27, true, this.field_j, this.field_q);
        if (var2 == -1) {
          return -1;
        }
        if (var2 == 0 ||
          var2 == 1) {
          if (op.field_i == 11 &&
            DraggableWidgetContainer.field_J == 0) {
            qa.a((byte) -95);
          }
          return var2;
        }
        if (!hg.field_c) {
          this.a(10, "reconnect");
        }
        InteractiveWidget.h(-128);
        dc.a(var2, pl.field_u, 2);
        gk.field_a = true;
        DualLinkNode.field_k = 15000L + km.correctedCurrentTimeMillis(-1);
        return var2;
    }

    private final void f(int param0) {
        FullscreenNoticeType.field_d[param0] = true;
    }

    final void n(int param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int var3;
        boolean stackIn_11_1 = false;
        var3 = Torquing.field_u;
        if (ResourceArchive.isClientStartupReady(true)) {
          stackIn_11_1 = (TranslucentSpriteLayer.field_i != null);
          discarded$4 = this.a(stackIn_11_1, false, true);
        } else {
          if (b.field_x >= 10) {
            if (pl.b(-115)) {
              if (op.field_i != 0) {
                RandomAccessCacheFile.a(-16513, da.field_g);
              } else {
                discarded$5 = this.a(false, false, true);
              }
            } else {
              pg.a((byte) -3);
            }
          }
        }
        if (param0 < 0) {
          this.field_j = false;
        }
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        this.a(param4, (byte) -116);
        if (param3) {
          this.l(0);
        }
        if (param2) {
          this.i(24500);
        }
        if (param0) {
          this.f(4);
        }
        if (param1) {
          this.d((byte) 84);
        }
    }

    private final void readAppletConfigurationAndStart(byte param0, int param1, int param2, int param3, String param4) {
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        String var6 = null;
        Exception var6_ref = null;
        RuntimeException var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        try {
          if (param0 < 80) {
            this.field_q = -47;
          }
          try {
            if (!this.b(false)) {
              return;
            }
            this.field_i = this.getCodeBase().getHost();
            var6 = this.field_i.toLowerCase();
            stackIn_9_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_j = stackIn_9_1;
            this.field_p = Integer.parseInt(this.getParameter("gameport1"));
            this.field_m = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_l = Integer.parseInt(var7);
            }
            this.field_r = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_s = Long.parseLong(this.getParameter("instanceid"));
            this.field_o = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_k = Integer.parseInt(var8);
            }
            if (this.field_k >= 5) {
              this.field_k = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_q = Integer.parseInt(var9);
            }
            ii.field_n = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(this.field_r, 121, param4, param2, param3, 32, param1);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            nn.a((String) null, (Throwable) ((Object) var6_ref), -9958);
            this.a(10, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var6_ref2;
          stackIn_24_1 = new StringBuilder().append("tg.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final int a(boolean param0, boolean param1, boolean param2) {
        try {
          boolean stackIn_6_0 = false;
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
          var8 = Torquing.field_u;
          var4 = vb.a(da.field_g, ImageProducerRasterBuffer.field_i, param0, 32);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            stackIn_6_0 = !param2;
            var5_int = TextLayout.a(hb.a(stackIn_6_0), (byte) 75, wp.b(-118));
            if (-1 != var5_int) {
              wb.a(var5_int, Model.field_n, (byte) -94, pl.field_u);
              Model.field_n = null;
              pl.field_u = null;
            }
            var11 = qd.a(-112);
            if (var11 != null) {
              nl.a(-2, var11.booleanValue());
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = od.a(wd.a(-19), -124, DialogMessagePane.i(17543), VertexMesh.d((byte) -87), this.field_q, oc.a(false), AccountRegistrationPanel.i(20));
            if (var5_intLifetime1 != -1) {
              gk.a(-5006, pl.field_u, Model.field_n, var5_intLifetime1);
              pl.field_u = null;
              Model.field_n = null;
            }
          }
          if (3 == var4) {
            if (DraggableWidgetContainer.field_J != -1 &&
              0 != DraggableWidgetContainer.field_J) {
              DraggableWidgetContainer.field_J = -1;
              jl.b((byte) 106);
            }
            if (!param1) {
              var5_intLifetime2 = vb.a(DialogMessagePane.i(17543), AccountRegistrationPanel.i(20), (byte) 27, false, this.field_j, this.field_q);
              if (-1 != var5_intLifetime2) {
                if (var5_intLifetime2 != 0) {
                  dc.a(var5_intLifetime2, pl.field_u, 2);
                  pl.field_u = null;
                } else {
                  TextFieldValidator.field_f = qd.field_e;
                  qa.a((byte) -106);
                  kb.field_h = false;
                  op.field_i = 10;
                }
              }
            } else {
              gk.field_a = false;
            }
          }
          if (var4 == 4) {
            if (!SocketConnector.field_b) {
              op.field_i = 10;
              kb.field_h = true;
            } else {
              bc.a(ip.a(9), (byte) 108);
            }
          }
          if (var4 == 5) {
            to.a(ip.a(9), -20);
          }
          if (var4 == 6 &&
            r.field_c) {
            op.field_i = 10;
          }
          if (var4 == 7) {
            tp.a(ip.a(9), -65);
          }
          if (!param2) {
            this.field_r = 12;
          }
          if (8 == var4) {
            bc.a(ip.a(9), (byte) 108);
          }
          if (var4 == 9) {
            LevelRun.openSupportPage(ip.a(9), (byte) -126);
          }
          if (var4 == 10) {
            wa.field_d.f(120, 17);
          }
          if (var4 == 11) {
            gq.a(25530, ip.a(9));
          }
          if (12 == var4) {
            MouseInputHandler.a(0, ah.c(2048), ip.a(9));
          }
          if (var4 == 13) {
            try {
              if (null == ValidationStatusIcon.field_G) {
                ValidationStatusIcon.field_G = new UrlRequest(ArchiveRequest.field_u, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (ValidationStatusIcon.field_G.a(3)) {
                var12 = ValidationStatusIcon.field_G.a(true);
                if (var12 == null) {
                  var9 = (String) null;
                  WidgetContainer.a((String) null, (byte) -126);
                } else {
                  var7 = GameApplet.decodeCp1252String(var12.position, true, 0, var12.payload);
                  WidgetContainer.a(var7, (byte) -84);
                }
                ValidationStatusIcon.field_G = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              nn.a("S1", (Throwable) ((Object) var5), -9958);
              var10 = (String) null;
              WidgetContainer.a((String) null, (byte) -87);
              ValidationStatusIcon.field_G = null;
            }
          }
          if (var4 == 15) {
            op.field_i = 10;
          }
          if (var4 == 16) {
            return 1;
          }
          if (var4 != 17) {
            return 0;
          }
          return 2;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected NetworkGameClient() {
    }

    static {
    }
}
