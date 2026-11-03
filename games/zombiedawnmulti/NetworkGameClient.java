/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class NetworkGameClient extends GameApplet {
    static String field_r;
    private boolean field_m;
    static Sprite field_u;
    private int field_y;
    private int field_C;
    static String field_n;
    private boolean field_z;
    private int field_p;
    static hh field_B;
    private long field_D;
    private boolean field_s;
    static int field_x;
    static boolean field_t;
    private int field_A;
    static java.applet.Applet field_w;
    static String[] field_l;
    String field_v;
    private int field_q;
    private int field_o;

    private final void e(byte param0) {
        if (param0 < 116) {
          field_w = (java.applet.Applet) null;
        }
        wj.field_l[1] = true;
    }

    public static void o(int param0) {
        if (param0 != 10) {
          NetworkGameClient.o(-41);
        }
        field_u = null;
        field_r = null;
        field_B = null;
        field_w = null;
        field_l = null;
        field_n = null;
    }

    private final int i(int param0) {
        int var2;
        if (this.field_f) {
          return -1;
        }
        if (!gh.a(100)) {
          return -1;
        }
        if (bi.field_a) {
          return -1;
        }
        var2 = fd.a(14, true, this.field_s, bb.c(-19385), s.a((byte) 32), this.field_q);
        if (var2 == -1) {
          return -1;
        }
        if (var2 != 0 &&
          var2 != 1) {
          if (!q.field_e) {
            this.reportError(param0 + 13654, "reconnect");
          }
          ib.a(-114);
          bf.a(true, var2, ol.field_q);
          if (param0 != 13546) {
            field_B = (hh) null;
          }
          bi.field_a = true;
          SocketConnector.field_e = bl.a((byte) 39) + 15000L;
          return var2;
        }
        if (a.field_b == 11 &&
          gh.field_a == 0) {
          a.b(-1);
        }
        return var2;
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, byte param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        p.field_e = this.field_C;
        HumanView.f(-7733, p.field_e);
        lf.a(param1, -5989, this.field_D, this.field_A, this.field_p, p.field_e, ArrayWidgetGroup.field_J, param5, this.field_m, this.field_o, 5000, 5000, this.field_v, this.field_y);
        jj.a(this.field_p, this.field_y, this.field_v, p.field_e, this.field_A, ArrayWidgetGroup.field_J, param5, this.field_o, (byte) -106);
        vc.a((byte) 116);
        FullscreenFocusCanvas.field_a = el.b(false);
        qi.a(100, dk.field_Ib);
        m.field_z = param3;
        ContextMenu.field_Lb = param2;
        PortalView.field_G = param0;
        if (param7 > -35) {
          this.e((byte) 2);
        }
        sq.field_R = param6;
        m.field_y = param4;
        this.initializeAccountPacketLengths((byte) 27);
        jo.a((byte) 81);
    }

    private final void n(int param0) {
        if (param0 != -26837) {
          this.p(-7);
        }
        wj.field_l[13] = true;
        wj.field_l[12] = true;
        wj.field_l[11] = true;
    }

    final static UiComponent k(int param0) {
        if (param0 >= -45) {
          return (UiComponent) null;
        }
        return eg.field_B.field_Ib;
    }

    final static ChaseEvent a(int param0, boolean param1, int param2, int param3) {
        ChaseEvent var4 = (ChaseEvent) (a.field_c.g(69));
        if (var4 == null) {
          var4 = new ChaseEvent();
        }
        if (!param1) {
          var4.a(param3, param2, param1, param0);
          return var4;
        }
        return (ChaseEvent) null;
    }

    private final void enableBaseResponses(boolean param0, int param1) {
        wj.field_l[3] = true;
        if (param1 != -7793) {
          NetworkGameClient.k(-38);
        }
        wj.field_l[16] = true;
        wj.field_l[0] = true;
        wj.field_l[18] = true;
        wj.field_l[7] = true;
        wj.field_l[8] = param0;
        wj.field_l[17] = true;
    }

    private final void a(String param0, int param1, int param2, int param3, byte param4) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
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
            if (!this.b(0)) {
              return;
            }
            this.field_v = this.getCodeBase().getHost();
            var6 = this.field_v.toLowerCase();
            stackIn_7_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_s = stackIn_7_1;
            this.field_y = Integer.parseInt(this.getParameter("gameport1"));
            this.field_o = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_A = Integer.parseInt(var7);
            }
            this.field_p = Integer.parseInt(this.getParameter("gamecrc"));
            this.field_D = Long.parseLong(this.getParameter("instanceid"));
            this.field_m = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_C = Integer.parseInt(var8);
            }
            if (this.field_C >= 5) {
              this.field_C = 0;
            }
            var9 = this.getParameter("affid");
            if (param4 >= -125) {
              field_w = (java.applet.Applet) null;
            }
            if (var9 != null) {
              this.field_q = Integer.parseInt(var9);
            }
            ii.field_e = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(this.field_p, param1, 32, 32000, param2, param0, param3);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            MouseInputHandler.a((String) null, (Throwable) ((Object) var6_ref), false);
            this.reportError(27200, "crash");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = var6_ref2;
          stackIn_23_1 = new StringBuilder().append("aq.V(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void l(int param0) {
        wj.field_l[2] = true;
        if (param0 > -36) {
          this.field_q = -11;
        }
    }

    private final void c(boolean param0) {
        if (param0) {
          return;
        }
        String var2 = al.k(103);
        ra.a(StatefulTextPainter.b(0), -44, var2);
    }

    private final void h(int param0) {
        int var2 = s.field_e.readUnsignedByte(31365);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var5 = 84 % ((param0 - 53) / 42);
        int var4 = -1 + EmailAvailabilityValidator.field_q;
        byte[] var6 = new byte[var4];
        s.field_e.readCipheredBytes(var4, 0, 0, var6);
        f.a(StatefulTextPainter.b(0), var3 != 0, (byte) -45, qe.a(-2739, var6));
    }

    final void a(String param0, int param1, byte param2) {
        try {
          int var4_int = 121 % ((-11 - param2) / 51);
          this.a(param0, 640, 480, param1, (byte) -126);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "aq.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void initializeAccountPacketLengths(byte param0) {
        sq.field_U[3] = -1;
        sq.field_U[10] = -1;
        sq.field_U[5] = -1;
        sq.field_U[6] = -2;
        sq.field_U[7] = -1;
        sq.field_U[8] = -2;
        sq.field_U[11] = -1;
        sq.field_U[2] = -2;
        sq.field_U[1] = 16;
        sq.field_U[17] = -1;
        sq.field_U[13] = -1;
        sq.field_U[16] = -1;
        sq.field_U[18] = 1;
        if (param0 == 27) {
          sq.field_U[12] = -1;
          sq.field_U[9] = -1;
          sq.field_U[4] = -1;
          return;
        }
    }

    private final void d(byte param0) {
        if (param0 != 40) {
          this.field_m = true;
        }
        wj.field_l[4] = true;
    }

    final void j(int param0) {
        boolean stackIn_33_0 = false;
        int var2;
        ka var3;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != -13) {
          this.h(-72);
        }
        var2 = PortalEntryEvent.field_i;
        if (var2 < 64 &&
          wj.field_l[var2]) {
          if (var2 == 0) {
            return;
          }
          if (var2 == 1) {
            JaggrabDownloader.c(0);
          } else {
            if (var2 != 2) {
              if (var2 != 3) {
                if (var2 == 4) {
                  qi.a((byte) 126);
                } else {
                  if (var2 != 5) {
                    if (var2 == 6) {
                      CipherPacketBuffer.i((byte) 104);
                    } else {
                      if (var2 != 7) {
                        if (var2 != 8) {
                          if (var2 == 16) {
                            ValidationState.a(false);
                          } else {
                            if (var2 != 11 &&
                              var2 != 12) {
                              if (var2 == 13) {
                                rp.e((byte) 96);
                                return;
                              }
                              if (var2 == 17) {
                                this.h(110);
                                return;
                              }
                              if (var2 == 18) {
                                pn.a((byte) 124);
                                return;
                              }
                              MouseInputHandler.a("MGS1: " + ci.a(0), (Throwable) null, false);
                              ak.a((byte) -114);
                              return;
                            }
                            stackIn_33_0 = (var2 == 12);
                            var3 = nj.a(stackIn_33_0, (byte) 107);
                            bf.a(var3, -53);
                          }
                        } else {
                          AgeValidator.a(EmailAvailabilityValidator.field_q, s.field_e, ArrayWidgetGroup.field_J, -4);
                        }
                      } else {
                        this.c(false);
                      }
                    }
                  } else {
                    he.a(param0 ^ 9350);
                  }
                }
              } else {
                NavigationGrid.c(1);
              }
            } else {
              rj.i(3);
            }
          }
          return;
        }
        MouseInputHandler.a("MGS2: " + ci.a(0), (Throwable) null, false);
        ak.a((byte) -125);
    }

    private final void q(int param0) {
        wj.field_l[5] = true;
        if (param0 < 120) {
          this.field_y = 46;
        }
    }

    private final int a(int param0, boolean param1, boolean param2) {
        try {
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
          var8 = ZombieDawnMulti.field_E ? 1 : 0;
          var4 = ak.a(p.field_e, -5, param2, t.field_d);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (var4 == 1) {
            var5_int = PowerupEvent.a(RasterBuffer.a((byte) -118), an.a(param0 ^ -2198), 32475);
            if (var5_int != -1) {
              dd.a(0, hb.field_b, ol.field_q, var5_int);
              ol.field_q = null;
              hb.field_b = null;
            }
            var11 = SocketConnector.c((byte) -125);
            if (var11 != null) {
              uc.b(16772, var11.booleanValue());
            }
          }
          if (var4 == 2) {
            var5_intLifetime1 = SimEntity.a(nh.c((byte) -98), this.field_q, gg.a(param0 ^ -2218), -125, bb.c(-19385), s.a((byte) 32), GameCharacter.h((byte) -80));
            if (var5_intLifetime1 != -1) {
              InfectionEvent.a(hb.field_b, 31407, var5_intLifetime1, ol.field_q);
              hb.field_b = null;
              ol.field_q = null;
            }
          }
          if (3 == var4) {
            if (gh.field_a != -1 &&
              gh.field_a != 0) {
              gh.field_a = -1;
              vc.b((byte) -98);
            }
            if (param1) {
              bi.field_a = false;
            } else {
              var5_intLifetime2 = fd.a(param0 + 2211, false, this.field_s, bb.c(param0 ^ 17196), s.a((byte) 32), this.field_q);
              if (var5_intLifetime2 != -1) {
                if (var5_intLifetime2 != 0) {
                  bf.a(true, var5_intLifetime2, ol.field_q);
                  ol.field_q = null;
                } else {
                  cm.field_d = ii.field_d;
                  a.b(-1);
                  a.field_b = 10;
                  og.field_N = false;
                }
              }
            }
          }
          if (var4 == 4) {
            if (!cm.field_e) {
              a.field_b = 10;
              og.field_N = true;
            } else {
              wm.a(-1, StatefulTextPainter.b(0));
            }
          }
          if (5 == var4) {
            cq.a(StatefulTextPainter.b(param0 ^ -2197), false);
          }
          if (var4 == 6 &&
            hh.field_m) {
            a.field_b = 10;
          }
          if (var4 == 7) {
            uq.a(StatefulTextPainter.b(param0 ^ -2197), 3);
          }
          if (var4 == 8) {
            wm.a(param0 + 2196, StatefulTextPainter.b(0));
          }
          if (var4 == 9) {
            ji.a(8355711, StatefulTextPainter.b(0));
          }
          if (var4 == 10) {
            ma.field_a.b((byte) -35, 17);
          }
          if (var4 == 11) {
            em.a(false, StatefulTextPainter.b(0));
          }
          if (var4 == 12) {
            ic.a(StatefulTextPainter.b(0), qe.b(6958), 49);
          }
          if (13 == var4) {
            try {
              if (null == wk.field_I) {
                wk.field_I = new JaggrabDownloader(ArrayWidgetGroup.field_J, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (wk.field_I.b(-90)) {
                var12 = wk.field_I.a((byte) 21);
                if (var12 != null) {
                  var7 = oe.a(var12.position, var12.payload, false, 0);
                  ta.b((byte) 126, var7);
                } else {
                  var9 = (String) null;
                  ta.b((byte) -110, (String) null);
                }
                wk.field_I = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              MouseInputHandler.a("S1", (Throwable) ((Object) var5), false);
              var10 = (String) null;
              ta.b((byte) -69, (String) null);
              wk.field_I = null;
            }
          }
          if (var4 == 15) {
            a.field_b = 10;
          }
          if (param0 != -2197) {
            this.field_z = false;
          }
          if (var4 == 16) {
            return 1;
          }
          if (17 != var4) {
            return 0;
          }
          return 2;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void c(byte param0) {
        wj.field_l[6] = true;
        if (param0 > -35) {
          field_t = false;
        }
    }

    final void b(byte param0, boolean param1) {
        int stackIn_23_0 = 0;
        String stackIn_103_0 = null;
        boolean stackIn_104_1 = false;
        int stackIn_106_2 = 0;
        boolean stackIn_107_3;
        int stackIn_135_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (ng.field_g != null) {
          if (rn.field_f == null) {
            var6 = nn.a(30);
            var4 = var6.getSize();
            ng.field_g.a(var4.width, (byte) -119, var4.height);
          }
          ng.field_g.b(-12371);
        }
        ik.a(param0 ^ 50);
        ArmedHumanView.latchInputState((byte) -126);
        if (!vk.l((byte) -126) &&
          11 != a.field_b) {
          PortalEntryEvent.c(param0 - 93);
        }
        if (FullscreenFocusCanvas.field_a != null) {
          t.field_d = FullscreenFocusCanvas.field_a.b(param0 - 216);
        }
        if (vo.e(1)) {
          var3 = wq.a((byte) 63) * 1200;
          if (this.field_z ||
            !(var3 >= t.b(param0 - 220)) &&
            !(b.a(true) <= var3)) {
            this.field_z = false;
            ak.a((byte) -113);
            ib.a(-107);
            bf.a(true, 2, ei.field_c);
            wp.c(param0 ^ 8287);
            bi.field_a = true;
            SocketConnector.field_e = bl.a((byte) 102) + 15000L;
          }
        }
        if (gh.field_a == -1 ||
          0 == gh.field_a) {
          stackIn_23_0 = (gh.field_a != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_23_0;
          gh.field_a = ua.h(param0 - 104);
          if (var3Lifetime1 != 0 &&
            gh.field_a == 0 &&
            11 == a.field_b &&
            !gh.a(111)) {
            a.b(param0 - 96);
          }
          if (-1 != gh.field_a &&
            0 != gh.field_a) {
            SocketConnector.field_e = 15000L + bl.a((byte) 113);
          }
        }
        if (gh.field_a != -1 &&
          gh.field_a != 0) {
          if (10 > ClientException.field_i) {
            if (gh.field_a == 3) {
              this.reportError(27200, "js5crc");
            } else {
              if (gh.field_a == 4) {
                this.reportError(27200, "js5io");
              } else {
                if (gh.field_a != 2) {
                  if (5 == gh.field_a) {
                    this.reportError(27200, "outofdate");
                  } else {
                    this.reportError(param0 + 27105, "js5connect");
                  }
                } else {
                  this.reportError(27200, "js5connect_full");
                }
              }
            }
          } else {
            if (a.field_b >= 10) {
              ib.a(-69);
              if (gh.field_a == 3) {
                bf.a(true, 256, IndexedSpriteState.field_d);
              } else {
                if (gh.field_a == 4) {
                  bf.a(true, 256, wq.field_b);
                } else {
                  if (gh.field_a != 2) {
                    if (5 == gh.field_a) {
                      bf.a(true, 5, MouseInputHandler.field_a);
                    } else {
                      bf.a(true, 256, PowerupBar.field_j);
                    }
                  } else {
                    bf.a(true, 256, qq.field_g);
                  }
                }
              }
              bi.field_a = true;
            }
          }
        }
        if (param0 != 95) {
          return;
        }
        if ((gh.field_a != -1 &&
          gh.field_a != 0 ||
          gh.a(86)) &&
          bl.a((byte) 79) >= SocketConnector.field_e) {
          bi.field_a = false;
          if (gh.field_a != -1 &&
            gh.field_a != 0) {
            gh.field_a = -1;
            vc.b((byte) -111);
          }
        }
        if (gh.field_a == 0 &&
          !gh.a(119)) {
          eb.field_p = false;
        }
        if (ClientException.field_i == 0 &&
          TertiaryLinkDeque.a((byte) 98)) {
          ClientException.field_i = 1;
        }
        if (ClientException.field_i == 1) {
          if (p.field_e != 0) {
            cp.field_P = u.a(5, ContextMenu.field_Lb);
          }
          ra.field_l = oj.a(false, PortalView.field_G, 1, -24285, true);
          fe.field_L = oj.a(false, m.field_y, 1, -24285, true);
          wm.field_V = oj.a(false, m.field_z, 1, -24285, true);
          ClientException.field_i = 2;
          he.field_f = fe.field_L;
          al.field_eb = ra.field_l;
        }
        if (ClientException.field_i == 2) {
          if (cp.field_P != null &&
            cp.field_P.a((byte) -126)) {
            if (cp.field_P.a("", 2)) {
              if (cp.field_P.a(false, "")) {
                ah.a(true, cp.field_P);
                cp.field_P = null;
                IsaacRandom.d(26673);
              }
            } else {
              cp.field_P = null;
            }
          }
          if (null == cp.field_P) {
            ClientException.field_i = 3;
          }
        }
        if (ClientException.field_i == 3 &&
          PortalView.areGraphicsArchivesReady(fe.field_L, param0 ^ -3795, ra.field_l, wm.field_V) &&
          jo.a(wm.field_V, 0)) {
          sc.b(1);
          lc.a(62);
          hh.field_m = false;
          SimArmedHuman.field_Bb = hj.field_e;
          si.a(false, cm.field_e, wm.field_V, ra.field_l, fe.field_L);
          if (gj.field_f ||
            null != kj.field_g) {
            stackIn_103_0 = kj.field_g;
            stackIn_104_1 = !(gj.field_f);
            stackIn_106_2 = 127;
            stackIn_107_3 = !(gj.field_f);
            oi.$cfr$intArgs$a$88c6728ee5b1(stackIn_103_0, stackIn_104_1, stackIn_106_2, stackIn_107_3);
          }
          if (ii.field_e) {
            bo.b(4);
          }
          if (null == PacketBuffer.field_l) {
            PacketBuffer.field_l = dg.a(30);
            TertiaryLinkDeque.field_e = vh.h(32);
          }
          ud.a(-3758, TertiaryLinkDeque.field_e, wm.field_V, PacketBuffer.field_l);
          wm.field_V = null;
          fe.field_L = null;
          ra.field_l = null;
          bk.a((java.applet.Applet) (this), -17708);
          IsaacRandom.d(26673);
          ClientException.field_i = 10;
        }
        if (ClientException.field_i == 10) {
          if (p.field_e != 0) {
            qc.field_s = u.a(5, sq.field_R);
          }
          ClientException.field_i = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (11 == ClientException.field_i) {
          if (null != qc.field_s && (!qc.field_s.a((byte) -120) ||
            !qc.field_s.a(param0 - 95))) {
            qm.a(0.0f, 80, jj.a(nh.field_n, (byte) 121, qc.field_s, ud.field_Y));
            decompiledFrameRemainder0 = false;
          }
          else {
            ClientException.field_i = 12;
            kn.field_f = true;
          }
        }
        if (ClientException.field_i == 12 &&
          !kn.field_f) {
          ClientException.field_i = 13;
        }
        if (13 == ClientException.field_i) {
          var3Lifetime2 = 1;
          if (null != bg.field_k) {
            stackIn_135_0 = (!bg.field_k.a(-94)) ? 0 : 1;
            var3Lifetime2 = stackIn_135_0;
            qm.a(bg.field_k.field_d, 80, bg.field_k.field_j);
          }
          if (var3Lifetime2 != 0) {
            ClientException.field_i = 20;
          }
        }
        if (!param1 &&
          hn.field_h) {
          SpriteState.a(95, dk.field_Ib);
          this.f(-58);
          qi.a(100, dk.field_Ib);
        }
        if (wj.field_l[8]) {
          wp.a(param0 ^ -10926);
        }
    }

    protected NetworkGameClient() {
    }

    final int a(boolean param0, int param1) {
        int var3 = -56 / ((6 - param1) / 38);
        return this.a(-2197, true, param0);
    }

    final void p(int param0) {
        int discarded$10 = 0;
        int discarded$11 = 0;
        int var3;
        int stackIn_4_1 = 0;
        boolean stackIn_4_2 = false;
        Object stackIn_5_0;
        boolean stackIn_5_3;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 <= 17) {
          return;
        }
        if (!SimZombie.p(-86)) {
          if (10 <= ClientException.field_i) {
            if (!GameKeyHandler.a(250)) {
              LevelData.b((byte) -9);
            } else {
              if (a.field_b == 0) {
                discarded$10 = this.a(-2197, false, false);
              } else {
                ud.a(t.field_d, 1000);
              }
            }
          }
        } else {
          stackIn_4_1 = -2197;
          stackIn_4_2 = false;
          if (rn.field_f == null) {
            stackIn_5_0 = this;
            stackIn_5_3 = false;
          } else {
            stackIn_5_0 = this;
            stackIn_5_3 = true;
          }
          discarded$11 = this.a(stackIn_4_1, stackIn_4_2, stackIn_5_3);
        }
    }

    final void a(boolean param0, byte param1, boolean param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        this.enableBaseResponses(true, -7793);
        if (param1 != -27) {
          NetworkGameClient.a(-38, false, -82, 45);
        }
        if (param5) {
          this.e((byte) 119);
        }
        if (param3) {
          this.l(-105);
        }
        if (param2) {
          this.d((byte) 40);
        }
        if (param4) {
          this.q(param1 + 154);
        }
        if (param0) {
          this.c((byte) -128);
        }
        if (param6) {
          this.n(param1 ^ 26830);
        }
    }

    final int m(int param0) {
        int var2 = this.i(13546);
        if (var2 == 0 ||
          1 == var2) {
          if (wj.field_l[1]) {
            dp.a((byte) 80, 2);
          }
          if (wj.field_l[2]) {
            uq.a(3, -79);
          }
          if (wj.field_l[3]) {
            km.a(4, (byte) 73);
          }
          if (wj.field_l[4]) {
            gl.b(true, 5);
          }
          if (wj.field_l[5]) {
            fe.a((byte) -121, 6);
          }
          if (wj.field_l[6]) {
            TertiaryLinkNode.a((byte) 126, 7);
          }
          if (wj.field_l[8]) {
            BufferedFile.b((byte) 105);
          }
        }
        if (param0 == 10) {
          return var2;
        }
        return 98;
    }

    static {
        field_r = "Previous";
        field_n = "Please select options in the following rows:  ";
        field_l = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_t = false;
        field_B = new hh(1);
    }
}
