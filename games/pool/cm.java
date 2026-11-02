/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends ob {
    static String field_J;
    static java.awt.Color field_H;
    static String field_K;
    static String errorJs5io;
    static String[] field_L;

    final int b(byte param0, int param1) {
        vh var3 = nm.field_a.a((long)this.field_h[param1], (byte) 31);
        if (param0 != 6) {
          field_L = (String[]) null;
        }
        if (var3 != null) {
          return var3.field_ib;
        }
        return this.field_x;
    }

    final static eg[] a(eg param0, int[] param1, boolean param2) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        eg[] stackIn_3_0 = null;
        int stackIn_20_0 = 0;
        eg stackIn_20_1 = null;
        int stackIn_20_2 = 0;
        boolean stackIn_21_3;
        eg[] stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        eg[] var3 = null;
        RuntimeException var3_ref = null;
        eg var4 = null;
        eg var5 = null;
        eg var6 = null;
        eg var7 = null;
        eg var8 = null;
        int var9 = 0;
        eg var11_ref_eg = null;
        eg var12_ref_eg = null;
        eg var13 = null;
        int var14 = 0;
        eg var15 = null;
        eg[] var16 = null;
        var14 = Pool.field_O;
        try {
          if (!param2) {
            stackIn_3_0 = (eg[]) null;
            return stackIn_3_0;
          }
          var16 = new eg[param1[0] * param1[1] * param1[2]];
          var3 = var16;
          var9 = 0;
          var5 = new eg(param0, false, false, false, false);
          for (var10 = 0; var10 < param1[0]; var10++) {
            if (-1 + param1[0] <= var10) {
              var4 = var5;
            } else {
              var4 = TutorialController.b((byte) 122);
              var11_ref_eg = TutorialController.b((byte) 124);
              ej.a(0, var4, param0.field_D + (1 + var10) * (param0.field_w - param0.field_D) / param1[0], false, 0, 0, 1, 0, var11_ref_eg, var5);
              var5 = var11_ref_eg;
            }
            var7 = var4;
            for (var11 = 0; param1[1] > var11; var11++) {
              if (var11 < param1[1] - 1) {
                var15 = TutorialController.b((byte) 123);
                var6 = var15;
                var12_ref_eg = TutorialController.b((byte) 125);
                ej.a((1 + var11) * (-param0.field_y + param0.field_S) / param1[1] + param0.field_y, var15, 0, false, 0, 1, 0, 0, var12_ref_eg, var7);
                var7 = var12_ref_eg;
              } else {
                var6 = var7;
              }
              var8 = var6;
              for (var12 = 0; var12 < param1[2]; var12++) {
                if (var12 < (param1[2] - 1)) {
                  var3[var9] = TutorialController.b((byte) 124);
                  var13 = TutorialController.b((byte) 126);
                  stackIn_20_0 = 0;
                  stackIn_20_1 = var16[var9];
                  stackIn_20_2 = 0;
                  stackIn_21_3 = !(param2);
                  ej.a(stackIn_20_0, stackIn_20_1, stackIn_20_2, stackIn_21_3, param0.field_V + (var12 + 1) * (-param0.field_V + param0.field_x) / param1[2], 0, 0, 1, var13, var8);
                  var8 = var13;
                } else {
                  var3[var9] = var8;
                }
                var9++;
              }
            }
          }
          stackIn_26_0 = var3;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_29_0 = var3_ref;
          stackIn_29_1 = new StringBuilder().append("cm.S(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean f(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        Sprite var3 = null;
        int var4 = 0;
        Sprite var5 = null;
        var4 = Pool.field_O;
        try {
          if (PotEvent.field_m != null) {
            return true;
          }
          if (!ViewportController.field_q.a("benefits", 0)) {
            return false;
          }
          if (!rl.field_h.a("benefits/", 0)) {
            return false;
          }
          PotEvent.field_m = lb.a(ViewportController.field_q, param0 - 29, "benefits", "members_benefits_borders");
          for (var1_int = 0; var1_int < PotEvent.field_m.field_D.length; var1_int++) {
            if (0 == (-16777216 & PotEvent.field_m.field_D[var1_int])) {
              PotEvent.field_m.field_D[var1_int] = 0;
            }
          }
          rf.field_g = pf.a("benefits", (byte) 118, "members_benefits_logo", ViewportController.field_q);
          qp.field_Rb = pf.a("benefits", (byte) 69, "members_benefits_price", ViewportController.field_q);
          var5 = new Sprite(rl.field_h.a(false, "members_benefits_screenshots.jpg", "benefits/"), (java.awt.Component) ((Object) vj.a((byte) -67)));
          dn.field_o = new Sprite[3];
          for (var2 = 0; var2 < dn.field_o.length; var2++) {
            var3 = new Sprite(var5.field_w, var5.field_y / dn.field_o.length);
            var3.e();
            var5.a(0, -var2 * var5.field_y / dn.field_o.length);
            dn.field_o[var2] = var3;
          }
          if (param0 != 109) {
            return true;
          }
          OpacityWidget.field_P.bindAsRenderTarget(15100);
          ef.a(-2107, PotEvent.field_m, wm.textGameName);
          bq.a(40, qp.field_Rb, 80, 80, 15, -2400, 2, -1, 40);
          GameApplet.a(dn.field_o, -58);
          CheckboxPainter.a(rf.field_g, 106);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "cm.W(" + param0 + ')');
        }
    }

    final int a(byte param0, int param1) {
        vh var3 = nm.field_a.a((long)this.field_h[param1], (byte) 31);
        if (param0 != 69) {
          errorJs5io = (String) null;
        }
        if (var3 == null) {
          return 36;
        }
        return var3.field_Db;
    }

    final void b(int param0, boolean param1, int param2) {
        int var4;
        int var5;
        var5 = Pool.field_O;
        var4 = this.field_h[param2];
        if (var4 != 65) {
          if (var4 != 64) {
            if (var4 == 63) {
              if (this.field_B.isPressActivated((byte) 89) &&
                fr.field_n < 8) {
                fr.field_n = fr.field_n + 1;
                KillerRules.c((byte) -45);
              }
            } else {
              if (27 != var4) {
                if (28 != var4) {
                  if (44 != var4) {
                    if (var4 == 45) {
                      if (this.field_B.isPressActivated((byte) 71) &&
                        la.field_a < te.field_p[0] - 1) {
                        la.field_a = la.field_a + 1;
                        kn.c(param0 ^ -16473);
                      }
                    } else {
                      if (var4 != 46) {
                        super.b(-16470, param1, param2);
                      } else {
                        if (this.field_B.isPressActivated((byte) 64)) {
                          un.field_e = 1 - un.field_e;
                          mb.d(param0 ^ 16424);
                        }
                      }
                    }
                  } else {
                    if (this.field_B.isPressActivated((byte) 68) &&
                      la.field_a > 0) {
                      la.field_a = la.field_a - 1;
                      kn.c(13);
                    }
                  }
                } else {
                  if (this.field_B.isPressActivated((byte) 115)) {
                    DialWidget.field_W = (DialWidget.field_W + 2) % 3;
                    this.g(param0 + 16474);
                  }
                }
              } else {
                if (this.field_B.isPressActivated((byte) 76)) {
                  DialWidget.field_W = (DialWidget.field_W + 1) % 3;
                  this.g(4);
                }
              }
            }
          } else {
            if (this.field_B.isPressActivated((byte) 59) &&
              2 < fr.field_n) {
              fr.field_n = fr.field_n - 1;
              KillerRules.c((byte) -45);
            }
          }
        } else {
          if (this.field_B.isPressActivated((byte) 64) &&
            Pocket.a(0)) {
            this.c(param0 ^ -16474, param1);
          }
        }
        if (param0 != -16470) {
          field_H = (java.awt.Color) null;
        }
    }

    private final void h(int param0) {
        this.field_p = false;
        int var2 = 20;
        int var3 = 100;
        this.a(var2, var3, -10);
        int var4 = this.field_z != null ? this.field_z.field_y : 0;
        if (param0 >= -62) {
          this.d(4, 111);
        }
        nm.field_a = new vh(-1L, (vh) null, var2, var3, SoftwareRasterizer.width - 2 * var2, -var3 + var4 + (SoftwareRasterizer.height - var3), (String) null);
        IterableNodeHashTable.field_e = new vh(-1L, (vh) null, 40, 50, 240, 200, (String) null);
        IterableNodeHashTable.field_e.field_Fb = 1;
        IterableNodeHashTable.field_e.field_F = rm.field_g;
        IterableNodeHashTable.field_e.field_Kb = ln.field_s;
        nm.field_a.a(-114, IterableNodeHashTable.field_e);
        vh dupTemp$0 = u.a((byte) 68, 10, 55, false, 28);
        TikiTableScene.field_V = dupTemp$0;
        IterableNodeHashTable.field_e.a(-102, dupTemp$0);
        vh dupTemp$1 = u.a((byte) 120, 210, 55, true, 27);
        we.field_f = dupTemp$1;
        IterableNodeHashTable.field_e.a(122, dupTemp$1);
        MultiHandleSliderWidget.a(false, IterableNodeHashTable.field_e, TikiTableScene.field_V);
        MultiHandleSliderWidget.a(false, IterableNodeHashTable.field_e, we.field_f);
        jq.field_f = new vh(-1L, (vh) null, 0, 0, 160, 150, (String) null);
        jq.field_f.field_Fb = 1;
        jq.field_f.field_cb = 1;
        jq.field_f.field_F = UsernameSuggestionsPanel.field_N;
        IterableNodeHashTable.field_e.a(-116, jq.field_f);
        this.g(4);
        PoolGameModel.field_v = new vh(-1L, (vh) null, 290, IterableNodeHashTable.field_e.field_eb, 270, 60, (String) null);
        PoolGameModel.field_v.field_hb = dq.a(4, 0, ab.muOptionsPlayers);
        PoolGameModel.field_v.field_hb.field_G = 10;
        PoolGameModel.field_v.field_F = rm.field_g;
        dk.a(PoolGameModel.field_v, (byte) 93);
        PoolUiText.field_f = new vh(-1L, (vh) null, 130, 10, 100, 40, (String) null);
        PoolUiText.field_f.field_cb = 1;
        PoolUiText.field_f.field_Fb = 1;
        PoolUiText.field_f.field_F = UsernameSuggestionsPanel.field_N;
        PoolGameModel.field_v.a(-106, PoolUiText.field_f);
        MultiHandleSliderWidget.a(false, PoolGameModel.field_v, PoolUiText.field_f);
        vh dupTemp$2 = u.a((byte) 67, 100, 10, false, 64);
        tn.field_w = dupTemp$2;
        PoolGameModel.field_v.a(114, dupTemp$2);
        vh dupTemp$3 = u.a((byte) 112, 235, 10, true, 63);
        ih.field_e = dupTemp$3;
        PoolGameModel.field_v.a(33, dupTemp$3);
        MultiHandleSliderWidget.a(false, PoolGameModel.field_v, tn.field_w);
        MultiHandleSliderWidget.a(false, PoolGameModel.field_v, ih.field_e);
        KillerRules.c((byte) -45);
        nm.field_a.a(-111, PoolGameModel.field_v);
        hg.field_c = new vh(0L, (vh) null, PoolGameModel.field_v.field_qb, PoolGameModel.field_v.field_eb - (-PoolGameModel.field_v.field_Db - 10), PoolGameModel.field_v.field_gb, PoolGameModel.field_v.field_Db, (String) null);
        hg.field_c.field_Fb = 0;
        hg.field_c.field_F = rm.field_g;
        hg.field_c.field_hb = dq.a(4, 0, CushionSegment.timer);
        hg.field_c.field_hb.field_G = PoolGameModel.field_v.field_hb.field_G;
        dk.a(hg.field_c, (byte) 93);
        nm.field_a.a(-99, hg.field_c);
        db.field_Nb = new vh(-1L, (vh) null, PoolUiText.field_f.field_qb, PoolUiText.field_f.field_eb, PoolUiText.field_f.field_gb, PoolUiText.field_f.field_Db, (String) null);
        db.field_Nb.field_Fb = 1;
        db.field_Nb.field_F = UsernameSuggestionsPanel.field_N;
        db.field_Nb.field_cb = 1;
        hg.field_c.a(49, db.field_Nb);
        vh dupTemp$4 = u.a((byte) 102, tn.field_w.field_qb, tn.field_w.field_eb, false, 45);
        tk.field_f = dupTemp$4;
        hg.field_c.a(112, dupTemp$4);
        vh dupTemp$5 = u.a((byte) 124, ih.field_e.field_qb, tn.field_w.field_eb, true, 44);
        TickClock.field_i = dupTemp$5;
        hg.field_c.a(84, dupTemp$5);
        MultiHandleSliderWidget.a(false, hg.field_c, tk.field_f);
        MultiHandleSliderWidget.a(false, hg.field_c, TickClock.field_i);
        kn.c(13);
        CacheEntry.field_x = new vh(46L, (vh) null, PoolGameModel.field_v.field_qb, hg.field_c.field_eb + hg.field_c.field_Db + 10, PoolGameModel.field_v.field_gb, PoolGameModel.field_v.field_Db, (String) null);
        CacheEntry.field_x.field_F = rm.field_g;
        CacheEntry.field_x.field_Fb = 0;
        CacheEntry.field_x.field_Kb = ln.field_s;
        CacheEntry.field_x.field_hb = dq.a(4, 0, s.gameoptlabels[3]);
        CacheEntry.field_x.field_yb = dq.a(3, 0, s.gameoptlabels[3]);
        CacheEntry.field_x.field_hb.field_G = PoolGameModel.field_v.field_hb.field_G;
        CacheEntry.field_x.field_yb.field_G = PoolGameModel.field_v.field_hb.field_G;
        dk.a(CacheEntry.field_x, (byte) 93);
        dp.field_c = new vh(-1L, (vh) null, PoolUiText.field_f.field_qb, PoolUiText.field_f.field_eb, PoolUiText.field_f.field_gb, PoolUiText.field_f.field_Db, (String) null);
        dp.field_c.field_Fb = 1;
        dp.field_c.field_F = UsernameSuggestionsPanel.field_N;
        dp.field_c.field_cb = 1;
        mb.d(-113);
        CacheEntry.field_x.a(14, dp.field_c);
        nm.field_a.a(-118, CacheEntry.field_x);
    }

    final boolean a(int param0, boolean param1) {
        if (!param1) {
          return false;
        }
        vh var3 = nm.field_a.a((long)this.field_h[param0], (byte) 31);
        if (var3 != null) {
          return var3.field_pb;
        }
        if (65 != this.field_h[param0]) {
          return true;
        }
        return Pocket.a(0);
    }

    private final void g(int param0) {
        IterableNodeHashTable.field_e.field_hb = dq.a(param0, 0, im.rulesetNames[DialWidget.field_W]);
        jq.field_f.field_hb = sb.field_c[DialWidget.field_W];
        dp.a(IterableNodeHashTable.field_e, jq.field_f, -89);
    }

    final void c(int param0) {
        int var2 = 0;
        int var3;
        var3 = Pool.field_O;
        this.a(false);
        nm.field_a.a((byte) -79, false);
        if (param0 < 36) {
          return;
        }
        for (var2 = this.field_B.itemCount - 2; this.field_B.itemCount > var2; var2++) {
          if (this.e(var2, 48)) {
            this.b(true, var2);
          }
        }
    }

    public static void g(byte param0) {
        field_K = null;
        field_H = null;
        errorJs5io = null;
        field_J = null;
        if (param0 != 74) {
          field_J = (String) null;
        }
        field_L = null;
    }

    final void d(int param0) {
        nm.field_a.a(true, false);
        super.d(-1);
        int var2 = ~this.field_B.selectedIndex <= param0 ? this.field_h[this.field_B.selectedIndex] : -1;
        ek.a(nm.field_a, (byte) -111, var2);
    }

    cm(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(db.field_Wb, param0, param1, param2, param3, param4, param5);
        try {
          this.h(-108);
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "cm.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final int d(int param0, int param1) {
        if (param0 != 0) {
          this.a((byte) -23, 61);
        }
        vh var3 = nm.field_a.a((long)this.field_h[param1], (byte) 31);
        if (var3 != null) {
          return var3.field_sb;
        }
        return this.field_t + (-7 + param1) * 250;
    }

    final static byte[] a(String param0, byte param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 16) {
            stackIn_4_0 = MidiNoteMixer.field_u.a(false, param0, "");
            return stackIn_4_0;
          }
          stackIn_2_0 = (byte[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("cm.P(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0, param1, param2);
        mb.d(param0 ^ -107);
        KillerRules.c((byte) -45);
        this.g(4);
        kn.c(13);
    }

    final int a(boolean param0, int param1) {
        vh var3 = nm.field_a.a((long)this.field_h[param1], (byte) 31);
        if (param0) {
          this.a(16, -44, false);
        }
        if (var3 != null) {
          return var3.field_sb + var3.field_gb;
        }
        return this.field_C + (param1 - 7) * 280;
    }

    final static void f(int param0) {
        bj var1 = (bj) (BallSkin.field_i.c((byte) -105));
        int var2 = -46 / ((-18 - param0) / 38);
        if (var1 == null) {
          dn.c(-127);
          return;
        }
        oq var3 = kn.field_e;
        var3.readInt(true);
        var3.readInt(true);
        var3.readInt(true);
        var3.readInt(true);
        var1.unlink((byte) -117);
    }

    final boolean e(int param0, int param1) {
        vh var3 = nm.field_a.a((long)this.field_h[param0], (byte) 31);
        int var4 = 124 % ((param1 + 42) / 49);
        if (var3 != null) {
          return var3.field_pb;
        }
        return true;
    }

    static {
        errorJs5io = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_K = null;
        field_H = new java.awt.Color(10040319);
    }
}
