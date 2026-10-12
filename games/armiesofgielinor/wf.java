/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wf extends iv {
    static RgbSprite[] field_B;
    static String field_u;
    static int[] field_y;
    static String field_A;
    static String field_s;
    private boolean field_r;
    private int field_C;
    private boolean field_o;
    static String[] field_F;
    private long field_x;
    String field_p;
    private boolean field_w;
    static int field_D;
    private int field_G;
    private int field_n;
    private int field_t;
    private int field_z;
    static int field_v;
    private int field_E;
    static String[] field_q;

    private final void a(int param0, int param1, boolean param2, byte param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        if (param3 <= 73) {
          field_v = 91;
        }
        og.field_m = this.field_z;
        qa.b(og.field_m, 1);
        hq.a(param6, 5000, this.field_E, 5000, param2, og.field_m, this.field_C, 0, this.field_t, this.field_o, this.field_p, IntPair.field_m, this.field_x, this.field_G);
        qf.a(og.field_m, this.field_p, this.field_G, (byte) 103, this.field_C, param6, this.field_E, this.field_t, IntPair.field_m);
        rf.b((byte) 112);
        CampaignMission.field_I = jk.b(68);
        lk.a(101, IndexedSpriteBase.field_b);
        mo.field_c = param7;
        on.field_n = param5;
        lk.field_p = param0;
        wl.field_E = param1;
        DualLinkedNode.field_t = param4;
        this.f((byte) -51);
        df.l(0);
    }

    final static void g(int param0) {
        dp.field_Lb = vi.monotonicMillis(-83);
        mu.field_d = 0;
        if (param0 != -20873) {
          wf.h(-23);
        }
    }

    private final void k(int param0) {
        tk.field_f[12] = true;
        tk.field_f[13] = true;
        tk.field_f[11] = true;
        if (param0 != -13) {
          this.b(true);
        }
    }

    public static void h(int param0) {
        field_u = null;
        field_s = null;
        field_A = null;
        int var1 = -43 / ((-1 - param0) / 41);
        field_q = null;
        field_F = null;
        field_y = null;
        field_B = null;
    }

    private final void a(boolean param0, boolean param1) {
        tk.field_f[8] = param1;
        tk.field_f[7] = param0;
        tk.field_f[0] = true;
        tk.field_f[18] = true;
        tk.field_f[16] = true;
        tk.field_f[3] = true;
        tk.field_f[17] = true;
    }

    final int h(byte param0) {
        int var2;
        if (this.field_i) {
          return -1;
        }
        if (!MovementPresentation.j(-11)) {
          return -1;
        }
        if (ol.field_C) {
          return -1;
        }
        if (param0 >= -15) {
          this.field_o = true;
        }
        var2 = InstructionsPanel.a((byte) -53, this.field_n, this.field_w, RadialSummonItem.a(-1), CombatPresentation.i(-4938), true);
        if (var2 == -1) {
          return -1;
        }
        if (var2 == 0) {
          if (p.field_b != 11) {
            return var2;
          }
          if (gk.field_K != 0) {
            return var2;
          }
          DualLinkedNode.e(116);
          return var2;
        }
        if (var2 != 1) {
          if (!TurnEffectEvent.field_C) {
            this.a("reconnect", (byte) -81);
          }
          er.b(-11);
          wv.a(lk.field_r, 10, var2);
          ol.field_C = true;
          jl.field_a = vi.monotonicMillis(-111) + 15000L;
        } else {
          if (p.field_b == 11 &&
            gk.field_K == 0) {
            DualLinkedNode.e(116);
          }
        }
        return var2;
    }

    private final void l(int param0) {
        tk.field_f[param0] = true;
    }

    private final void e(byte param0) {
        if (param0 <= 119) {
          return;
        }
        String var2 = UnitModelPreview.b((byte) 61);
        dj.a(CombatEvent.d((byte) 47), 0, var2);
    }

    private final void m(int param0) {
        if (param0 != -7532) {
          field_u = (String) null;
        }
        tk.field_f[4] = true;
    }

    private final void i(int param0) {
        if (param0 <= 77) {
          field_s = (String) null;
        }
        tk.field_f[5] = true;
    }

    private final void b(boolean param0) {
        if (param0) {
          return;
        }
        tk.field_f[2] = true;
    }

    private final void f(int param0) {
        tk.field_f[6] = true;
        if (param0 != 9) {
          this.field_t = -103;
        }
    }

    final int a(byte param0, boolean param1) {
        int var3 = 14 % ((-26 - param0) / 53);
        return this.a(param1, true, (byte) -109);
    }

    final void a(byte param0, int param1, String param2) {
        try {
          this.a(param1, -26261, 480, 640, param2);
          int var4_int = -77 % ((param0 + 5) / 34);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "wf.I(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void n(int param0) {
        int var2 = ByteStorage.incomingPacket.readUnsignedByte(0);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = fk.packetPayloadLength - 1;
        byte[] var5 = new byte[var4];
        ByteStorage.incomingPacket.a(var4, var5, false, 0);
        SpellCastAction.a(CombatEvent.d((byte) -125), 87, uu.a(var5, (byte) 127), var3 != 0);
        if (param0 != 16433) {
          this.j(-76);
        }
    }

    private final int a(boolean param0, boolean param1, byte param2) {
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
          var8 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          if (param2 >= -68) {
            this.field_r = true;
          }
          var4 = IntrusiveNode.a(el.field_d, param0, true, og.field_m);
          if (var4 == 0) {
            throw new IllegalStateException();
          }
          if (1 == var4) {
            var5_int = ClientConnectionState.a(false, CampaignMission.c((byte) -27), fp.l(-117));
            if (var5_int != -1) {
              AiPlanningStrategy.a(103, br.field_b, lk.field_r, var5_int);
              lk.field_r = null;
              br.field_b = null;
            }
            var11 = r.l(-11506);
            if (var11 != null) {
              UiSelectionState.a((byte) 32, var11.booleanValue());
            }
          }
          if (2 == var4) {
            var5_intLifetime1 = DiskCacheWorker.a((byte) -46, CombatPresentation.i(-4938), cn.e(488997228), lb.b(0), this.field_n, qp.e((byte) -127), RadialSummonItem.a(-1));
            if (var5_intLifetime1 != -1) {
              CampaignMenuEntry.a(lk.field_r, -14, br.field_b, var5_intLifetime1);
              lk.field_r = null;
              br.field_b = null;
            }
          }
          if (3 == var4) {
            if (gk.field_K != -1 &&
              gk.field_K != 0) {
              gk.field_K = -1;
              lb.a((byte) -8);
            }
            if (param1) {
              ol.field_C = false;
            } else {
              var5_intLifetime2 = InstructionsPanel.a((byte) -53, this.field_n, this.field_w, RadialSummonItem.a(-1), CombatPresentation.i(-4938), false);
              if (var5_intLifetime2 != -1) {
                if (var5_intLifetime2 != 0) {
                  wv.a(lk.field_r, 10, var5_intLifetime2);
                  lk.field_r = null;
                } else {
                  ck.field_b = dc.field_o;
                  DualLinkedNode.e(112);
                  bl.field_b = false;
                  p.field_b = 10;
                }
              }
            }
          }
          if (var4 == 4) {
            if (BestScoreStrategy.field_l) {
              bl.a(CombatEvent.d((byte) -116), true);
            } else {
              bl.field_b = true;
              p.field_b = 10;
            }
          }
          if (5 == var4) {
            CampaignResult.a(CombatEvent.d((byte) -115), (byte) -3);
          }
          if (6 == var4 &&
            it.field_b) {
            p.field_b = 10;
          }
          if (var4 == 7) {
            ws.a(CombatEvent.d((byte) 53), -126);
          }
          if (var4 == 8) {
            bl.a(CombatEvent.d((byte) -120), true);
          }
          if (9 == var4) {
            ov.a(CombatEvent.d((byte) 48), 11982);
          }
          if (10 == var4) {
            vl.outgoingPacket.writeCipheredOpcode(32161, 17);
          }
          if (11 == var4) {
            t.a((byte) -118, CombatEvent.d((byte) 7));
          }
          if (var4 == 12) {
            ActionSpell.a(CombatEvent.d((byte) -123), -69, ob.j(-129));
          }
          if (var4 == 13) {
            try {
              if (fq.field_h == null) {
                fq.field_h = new fa(IntPair.field_m, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
              }
              if (fq.field_h.b(0)) {
                var12 = fq.field_h.a(3);
                if (var12 != null) {
                  var7 = co.a(0, var12.position, -127, var12.payload);
                  df.a(var7, -73);
                } else {
                  var9 = (String) null;
                  df.a((String) null, -108);
                }
                fq.field_h = null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              af.a((Throwable) ((Object) var5), -99, "S1");
              var10 = (String) null;
              df.a((String) null, -119);
              fq.field_h = null;
            }
          }
          if (15 == var4) {
            p.field_b = 10;
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

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 >= -60) {
          this.a(85, -61, 12, -69, -2, -25, 37);
        }
        this.a(param0, param3, false, (byte) 126, param2, param5, param1, param6);
    }

    private final void f(byte param0) {
        sh.opcodePayloadLengths[9] = -1;
        sh.opcodePayloadLengths[7] = -1;
        sh.opcodePayloadLengths[1] = 16;
        sh.opcodePayloadLengths[18] = 1;
        if (param0 == -51) {
          sh.opcodePayloadLengths[13] = -1;
          sh.opcodePayloadLengths[4] = -1;
          sh.opcodePayloadLengths[12] = -1;
          sh.opcodePayloadLengths[6] = -2;
          sh.opcodePayloadLengths[5] = -1;
          sh.opcodePayloadLengths[3] = -1;
          sh.opcodePayloadLengths[11] = -1;
          sh.opcodePayloadLengths[16] = -1;
          sh.opcodePayloadLengths[8] = -2;
          sh.opcodePayloadLengths[17] = -1;
          sh.opcodePayloadLengths[10] = -1;
          sh.opcodePayloadLengths[2] = -2;
          return;
        }
    }

    final void g(byte param0) {
        int discarded$6 = 0;
        int discarded$7 = 0;
        int var3;
        boolean stackIn_6_1 = false;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param0 != 4) {
          this.a((byte) 113, true);
        }
        if (!wd.a((byte) 60)) {
          if (f.field_E >= 10) {
            if (!lk.b(true)) {
              StateChangeEvent.e((byte) -84);
            } else {
              if (p.field_b == 0) {
                discarded$6 = this.a(false, false, (byte) -92);
              } else {
                ii.a(el.field_d, (byte) -89);
              }
            }
          }
        } else {
          stackIn_6_1 = (null != FixedQuaternion.field_a);
          discarded$7 = this.a(stackIn_6_1, false, (byte) -97);
        }
    }

    final void j(int param0) {
        int stackIn_30_0 = 0;
        boolean stackIn_31_1 = false;
        int var2;
        mo var3;
        int var4;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = nm.deliveredOpcode;
        if (var2 < 64 &&
          tk.field_f[var2]) {
          if (0 == var2) {
            return;
          }
          regionExit1: {
            switch (var2) {
              case 2:
                LeaderEscortCondition.d(9);
                break;
              case 4:
                da.a((byte) -101);
                break;
              case 6:
                AiInfluenceMap.a(true);
                break;
              case 16:
                da.a(67);
                break;
              default:
                if (var2 != 11 &&
                  var2 != 12) {
                  switch (var2) {
                    case 13:
                      MatchConditionEntry.a(param0 - 11);
                      break regionExit1;
                    case 17:
                      this.n(16433);
                      break regionExit1;
                    case 18:
                      fq.b((byte) 119);
                      break regionExit1;
                    default:
                      af.a((Throwable) null, param0 ^ -100, "MGS1: " + CampaignProgress.b(false));
                      dj.a((byte) -124);
                      break regionExit1;
                  }
                }
                stackIn_30_0 = -34;
                stackIn_31_1 = (var2 == 12);
                var3 = ea.$cfr$intArgs$a$72f70aa7c69d(stackIn_30_0, stackIn_31_1);
                MapLayout.a(var3, -1);
                break;
              case 8:
                jh.a(ByteStorage.incomingPacket, IntPair.field_m, fk.packetPayloadLength, param0 - 13);
                break;
              case 7:
                this.e((byte) 127);
                break;
              case 5:
                cd.b(param0 - 48);
                break;
              case 3:
                jg.e(0);
                break;
              case 1:
                InstructionsPanel.e(param0 - 135);
                break;
            }
          }
          if (param0 != 12) {
            field_B = (RgbSprite[]) null;
          }
          return;
        }
        af.a((Throwable) null, -115, "MGS2: " + CampaignProgress.b(false));
        dj.a((byte) -126);
    }

    protected wf() {
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, int param4, boolean param5, boolean param6) {
        this.a(true, true);
        if (param5) {
          this.l(1);
        }
        if (param6) {
          this.b(false);
        }
        if (param1) {
          this.m(-7532);
        }
        if (param2) {
          this.i(125);
        }
        if (param0) {
          this.f(9);
        }
        if (param3) {
          this.k(-13);
        }
        if (param4 <= 6) {
          field_B = (RgbSprite[]) null;
        }
    }

    final void a(int param0, boolean param1) {
        int stackIn_25_0 = 0;
        int stackIn_96_0 = 0;
        String stackIn_96_1 = null;
        boolean stackIn_97_2 = false;
        boolean stackIn_100_3;
        int stackIn_127_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
        int var3Lifetime1;
        int var3Lifetime2;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (null != ActionSpell.field_e) {
          if (null == FixedQuaternion.field_a) {
            var6 = DualNodeIterator.a(0);
            var4 = var6.getSize();
            ActionSpell.field_e.b(var4.height, var4.width, -30514);
          }
          ActionSpell.field_e.a(0);
        }
        r.c(true);
        ds.capturePointerInput((byte) 118);
        if (param0 <= 124) {
          return;
        }
        if (!PopupPresentation.h(31337) &&
          p.field_b != 11) {
          pf.a((byte) 73);
        }
        if (CampaignMission.field_I != null) {
          el.field_d = CampaignMission.field_I.a(9);
        }
        if (TeamRoster.a(99)) {
          var3 = tp.getNominalTickRate(-113) * 1200;
          if (this.field_r ||
            !(var3 >= bs.a((byte) 99)) &&
            !(os.g(4) <= var3)) {
            this.field_r = false;
            dj.a((byte) -126);
            er.b(-11);
            wv.a(of.field_bc, 10, 2);
            qf.b(56);
            ol.field_C = true;
            jl.field_a = 15000L + vi.monotonicMillis(-49);
          }
        }
        if (gk.field_K == -1 ||
          0 == gk.field_K) {
          stackIn_25_0 = (gk.field_K != -1) ? 0 : 1;
          var3Lifetime1 = stackIn_25_0;
          gk.field_K = IntrusiveNode.b(86);
          if (var3Lifetime1 != 0 &&
            gk.field_K == 0 &&
            11 == p.field_b &&
            !MovementPresentation.j(-11)) {
            DualLinkedNode.e(112);
          }
          if (gk.field_K != -1 &&
            gk.field_K != 0) {
            jl.field_a = vi.monotonicMillis(98) + 15000L;
          }
        }
        if (gk.field_K != -1 &&
          gk.field_K != 0) {
          if (f.field_E < 10) {
            if (3 == gk.field_K) {
              this.a("js5crc", (byte) -107);
            } else {
              if (gk.field_K != 4) {
                if (gk.field_K == 2) {
                  this.a("js5connect_full", (byte) -37);
                } else {
                  if (gk.field_K == 5) {
                    this.a("outofdate", (byte) -67);
                  } else {
                    this.a("js5connect", (byte) -41);
                  }
                }
              } else {
                this.a("js5io", (byte) -113);
              }
            }
          } else {
            if (p.field_b >= 10) {
              er.b(-11);
              if (3 != gk.field_K) {
                if (gk.field_K != 4) {
                  if (gk.field_K != 2) {
                    if (gk.field_K == 5) {
                      wv.a(fk.field_f, 10, 5);
                    } else {
                      wv.a(wm.field_a, 10, 256);
                    }
                  } else {
                    wv.a(ResourceArchive.field_d, 10, 256);
                  }
                } else {
                  wv.a(CampaignMenu.field_k, 10, 256);
                }
              } else {
                wv.a(oq.field_k, 10, 256);
              }
              ol.field_C = true;
            }
          }
        }
        if ((gk.field_K != -1 &&
          gk.field_K != 0 ||
          MovementPresentation.j(-11)) &&
          jl.field_a <= vi.monotonicMillis(74)) {
          ol.field_C = false;
          if (gk.field_K != -1 &&
            gk.field_K != 0) {
            gk.field_K = -1;
            lb.a((byte) -8);
          }
        }
        if (gk.field_K == 0 &&
          !MovementPresentation.j(-11)) {
          dd.field_a = false;
        }
        if (f.field_E == 0 &&
          us.b(94)) {
          f.field_E = 1;
        }
        if (f.field_E == 1) {
          if (og.field_m != 0) {
            nf.field_Nb = nu.a(on.field_n, true);
          }
          ps.field_u = DamageEvent.a(1, mo.field_c, (byte) 119, false, true);
          CombatPresentation.field_M = DamageEvent.a(1, wl.field_E, (byte) 122, false, true);
          h.field_g = DamageEvent.a(1, DualLinkedNode.field_t, (byte) 127, false, true);
          gg.field_K = ps.field_u;
          f.field_E = 2;
          ResourceRequest.field_A = CombatPresentation.field_M;
        }
        if (f.field_E == 2) {
          if (null != nf.field_Nb &&
            nf.field_Nb.ensureIndex((byte) 82)) {
            if (!nf.field_Nb.containsGroupName((byte) -128, "")) {
              nf.field_Nb = null;
            } else {
              if (nf.field_Nb.ensureGroupAvailableByName(28979, "")) {
                CampaignUnitOverride.a((byte) -82, nf.field_Nb);
                nf.field_Nb = null;
                wl.a(0);
              }
            }
          }
          if (nf.field_Nb == null) {
            f.field_E = 3;
          }
        }
        if (f.field_E == 3 &&
          wh.a(ps.field_u, (byte) 127, h.field_g, CombatPresentation.field_M) &&
          wh.a(h.field_g, -27701)) {
          cd.a(12);
          vl.c((byte) 91);
          it.field_b = false;
          UnitSpell.field_e = ef.field_a;
          StateChangeEvent.a(CombatPresentation.field_M, ps.field_u, h.field_g, 0, BestScoreStrategy.field_l);
          if (mo.field_r ||
            pd.field_b != null) {
            stackIn_96_0 = 3;
            stackIn_96_1 = pd.field_b;
            stackIn_97_2 = !(mo.field_r);
            stackIn_100_3 = !(mo.field_r);
            rn.a(stackIn_96_0, stackIn_96_1, stackIn_97_2, stackIn_100_3);
          }
          if (hc.field_i) {
            di.c((byte) -128);
          }
          if (null == pt.field_eb) {
            pt.field_eb = fq.a(18757);
            ko.field_e = nb.c((byte) 111);
          }
          qd.a(h.field_g, (byte) 76, pt.field_eb, ko.field_e);
          ps.field_u = null;
          CombatPresentation.field_M = null;
          h.field_g = null;
          p.a(-24602, (java.applet.Applet) (this));
          wl.a(0);
          f.field_E = 10;
        }
        if (f.field_E == 10) {
          if (0 != og.field_m) {
            RegionAnchor.field_o = nu.a(lk.field_p, true);
          }
          f.field_E = 11;
        }
        boolean decompiledFrameRemainder0 = true;
        if (f.field_E == 11) {
          if (RegionAnchor.field_o != null && (!RegionAnchor.field_o.ensureIndex((byte) 82) ||
            !RegionAnchor.field_o.ensureAllGroupsAvailable(-27927))) {
            bn.a((byte) -24, 0.0f, ao.a(db.field_b, true, of.field_Jb, RegionAnchor.field_o));
            decompiledFrameRemainder0 = false;
          }
          else {
            ts.field_l = true;
            f.field_E = 12;
          }
        }
        if (f.field_E == 12 &&
          !ts.field_l) {
          f.field_E = 13;
        }
        if (13 == f.field_E) {
          var3Lifetime2 = 1;
          if (null != CombatPresentation.field_G) {
            stackIn_127_0 = (!CombatPresentation.field_G.a(2189)) ? 0 : 1;
            var3Lifetime2 = stackIn_127_0;
            bn.a((byte) -24, CombatPresentation.field_G.field_d, CombatPresentation.field_G.field_b);
          }
          if (var3Lifetime2 != 0) {
            f.field_E = 20;
          }
        }
        if (!param1 &&
          tq.field_a) {
          dt.a(IndexedSpriteBase.field_b, 23678);
          this.c((byte) 87);
          lk.a(123, IndexedSpriteBase.field_b);
        }
        if (tk.field_f[8]) {
          pu.b(28704);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, String param4) {
        int discarded$0 = 0;
        boolean stackIn_7_1 = false;
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
          try {
            if (!this.e(param1 + 26203)) {
              return;
            }
            this.field_p = this.getCodeBase().getHost();
            var6 = this.field_p.toLowerCase();
            stackIn_7_1 = (var6.equals("jagex.com")) || (var6.endsWith(".jagex.com"));
            this.field_w = stackIn_7_1;
            this.field_t = Integer.parseInt(this.getParameter("gameport1"));
            this.field_E = Integer.parseInt(this.getParameter("gameport2"));
            var7 = this.getParameter("servernum");
            if (var7 != null) {
              this.field_C = Integer.parseInt(var7);
            }
            this.field_G = Integer.parseInt(this.getParameter("gamecrc"));
            if (param1 != -26261) {
              discarded$0 = this.a(true, true, (byte) -74);
            }
            this.field_x = Long.parseLong(this.getParameter("instanceid"));
            this.field_o = this.getParameter("member").equals("yes");
            var8 = this.getParameter("lang");
            if (var8 != null) {
              this.field_z = Integer.parseInt(var8);
            }
            if (this.field_z >= 5) {
              this.field_z = 0;
            }
            var9 = this.getParameter("affid");
            if (var9 != null) {
              this.field_n = Integer.parseInt(var9);
            }
            hc.field_i = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
            this.a(param3, 32, param4, 10, this.field_G, param0, param2);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            var10 = (String) null;
            af.a((Throwable) ((Object) var6_ref), 98, (String) null);
            this.a("crash", (byte) -40);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_24_0 = var6_ref2;
          stackIn_24_1 = new StringBuilder().append("wf.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static String a(String param0, int param1) {
        int var5 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int stackIn_6_0 = 0;
        String stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        og[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        StringBuilder var4 = null;
        og var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        og[] var11 = null;
        var10 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var3 = 107 % ((param1 + 11) / 61);
          var11 = vv.a(param0, 119);
          var2 = var11;
          var4 = new StringBuilder();
          for (var5 = 0; var11.length > var5; var5++) {
            var6 = var11[var5];
            var7 = var6.field_s;
            if (var5 == -1 + var11.length) {
              stackIn_6_0 = param0.length();
            } else {
              stackIn_6_0 = var2[1 + var5].field_s;
            }
            var8 = stackIn_6_0;
            var9 = param0.substring(var7, var8);
            if (var6.field_q == BattleTutorial.field_x) {
              discarded$0 = var4.append("<col=66ffff>").append(var9).append("</col>");
            } else {
              if (hf.field_h != var6.field_q) {
                if (var6.field_q != rn.field_c) {
                  if (var6.field_q != gg.field_G) {
                    if (var6.field_q != EquipmentBattleTutorial.field_z) {
                      discarded$1 = var4.append(var9);
                    } else {
                      discarded$2 = var4.append("<col=33ffaa>").append(var9).append("</col>");
                    }
                  } else {
                    discarded$3 = var4.append("<col=ffaaff>").append(var9).append("</col>");
                  }
                } else {
                  discarded$4 = var4.append("<col=ffff99>").append(var9).append("</col>");
                }
              } else {
                discarded$5 = var4.append("<col=33bbff>").append(var9).append("</col>");
              }
            }
          }
          stackIn_19_0 = var4.toString();
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_22_0 = var2_ref;
          stackIn_22_1 = new StringBuilder().append("wf.C(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_s = "Players: ";
        field_A = "Attack";
        field_y = new int[]{14, 15, 8};
        field_F = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_v = 3000;
        field_D = 0;
        field_u = "Public";
        field_q = new String[]{"Neutral", "Saradomin", "Zamorak", "Guthix", "Seren", "Bandos", "Menaphite pantheon"};
    }
}
