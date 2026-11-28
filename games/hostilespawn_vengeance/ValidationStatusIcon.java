/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ValidationStatusIcon extends InteractiveWidget {
    static String field_K;
    private FieldValidator field_I;
    private int field_M;
    static int field_O;
    static String field_G;
    static ub field_N;
    static pf[] field_J;
    static RgbSprite field_L;
    static AccountServiceResult field_H;

    final String getTooltipText(int param0) {
        if (this.field_u) {
          return this.field_I.getValidationMessage(-41);
        }
        if (param0 == 34) {
          return null;
        }
        ValidationStatusIcon.a((byte) 60);
        return null;
    }

    final static void b(String param0, int param1) {
        try {
          if (param1 != -10603) {
            ValidationStatusIcon.e((byte) -71);
          }
        } catch (RuntimeException runtimeException) {
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "wj.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void drawWidget(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        bm var8;
        int var9;
        int var10;
        int var11;
        RgbSprite var12;
        RgbSprite var13;
        RgbSprite var14;
        var11 = HostileSpawn.field_I ? 1 : 0;
        super.drawWidget(param0, param1, (byte) 69, param3);
        if (param3 != 0) {
          return;
        }
        var5 = this.field_v + (param1 + (this.field_s >> 1));
        if (param2 <= 42) {
          field_K = (String) null;
        }
        var6 = (this.field_x >> 1) + (this.field_m + param0);
        var8 = this.field_I.getValidationStatus(-95);
        if (var8 != wl.field_c &&
          m.field_n != var8) {
          if (var8 == bi.field_d) {
            var12 = cf.field_u[2];
            var12.drawAdditive(var5 - (var12.field_z >> 1), -(var12.field_A >> 1) + var6, 256);
            return;
          }
          if (var8 != nd.field_d) {
            return;
          }
          var13 = cf.field_u[1];
          var13.drawAdditive(-(var13.field_z >> 1) + var5, -(var13.field_A >> 1) + var6, 256);
          return;
        }
        var14 = cf.field_u[0];
        var9 = var14.field_u << 1;
        var10 = var14.field_r << 1;
        if (null != ng.field_s &&
          var9 <= ng.field_s.field_z &&
          var10 <= ng.field_s.field_A) {
          sb.a(ng.field_s, -127);
          SoftwareRasterizer.clearRaster();
        } else {
          ng.field_s = new RgbSprite(var9, var10);
          sb.a(ng.field_s, -121);
        }
        var14.drawRotatedAboutBilinear(112, 144, var14.field_u << 4, var14.field_r << 4, -this.field_M << 10, 4096);
        eh.b(false);
        ng.field_s.drawAdditive(-var14.field_u + var5, var6 - var14.field_r, 256);
        return;
    }

    final static PcmStreamMixer e(byte param0) {
        if (param0 >= -59) {
          ValidationStatusIcon.e((byte) 105);
        }
        return oa.field_b;
    }

    final boolean takeFocus(byte param0, UiWidget param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("wj.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static String a(int param0, int param1, char param2) {
        int var4 = 0;
        int var5 = HostileSpawn.field_I ? 1 : 0;
        char[] var6 = new char[param0];
        char[] var3 = var6;
        if (param1 != 512) {
          ValidationStatusIcon.a((byte) -69);
        }
        for (var4 = 0; var4 < param0; var4++) {
          var6[var4] = param2;
        }
        return new String(var6);
    }

    public static void j(int param0) {
        field_L = null;
        field_G = null;
        field_N = null;
        field_K = null;
        if (param0 != 11460) {
          String var2 = (String) null;
          ValidationStatusIcon.b((String) null, -4);
        }
        field_J = null;
        field_H = null;
    }

    final void updatePointer(UiWidget param0, int param1, int param2, int param3) {
        try {
          this.field_M = this.field_M + 1;
          super.updatePointer(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "wj.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(byte param0) {
        GridPoint dupTemp$0 = null;
        GridPoint dupTemp$1 = null;
        ql stackIn_63_0 = null;
        CrossfadingMidiPcmStream stackIn_69_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_100_0 = 0;
        boolean stackIn_104_0 = false;
        PcmStreamMixer stackIn_133_0 = null;
        PcmSample[] stackIn_133_1 = null;
        int stackIn_134_2 = 0;
        int stackIn_162_0 = 0;
        int stackIn_185_0 = 0;
        int stackIn_186_1 = 0;
        int stackIn_201_0 = 0;
        boolean stackIn_202_1 = false;
        int stackIn_205_0 = 0;
        int stackIn_205_1 = 0;
        int[][] stackIn_246_0 = null;
        int stackIn_246_1 = 0;
        int[] stackIn_247_2 = null;
        boolean stackIn_251_2 = false;
        boolean stackIn_254_3 = false;
        re stackIn_255_0 = null;
        re stackIn_255_1 = null;
        re stackIn_257_0 = null;
        re stackIn_257_1 = null;
        int stackIn_257_2 = 0;
        int[][] stackIn_285_0 = null;
        int stackIn_285_1 = 0;
        int[] stackIn_286_2 = null;
        boolean stackIn_290_2 = false;
        boolean stackIn_293_3 = false;
        re stackIn_295_0 = null;
        re stackIn_295_1 = null;
        re stackIn_296_0 = null;
        re stackIn_296_1 = null;
        int stackIn_296_2 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_103_0;
        float var1_float = 0.0f;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        oj var5 = null;
        GridPoint var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        og var10 = null;
        int var11_int = 0;
        boolean[] var11 = null;
        int var12_int = 0;
        int[] var12 = null;
        int var13_int = 0;
        GridPoint var13_ref_oc = null;
        double var13 = 0.0;
        int var14 = 0;
        int var15_int = 0;
        double var15 = 0.0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int[] var21 = null;
        boolean[] var22 = null;
        int[] var23 = null;
        boolean[] var24 = null;
        re stackIn_255_0Lifetime1;
        re stackIn_255_1Lifetime1;
        re stackIn_257_0Lifetime1;
        re stackIn_257_1Lifetime1;
        re stackIn_295_0Lifetime1;
        re stackIn_295_1Lifetime1;
        re stackIn_296_0Lifetime1;
        re stackIn_296_1Lifetime1;
        re stackIn_255_0Lifetime1Lifetime1;
        re stackIn_255_1Lifetime1Lifetime1;
        re stackIn_295_0Lifetime1Lifetime1;
        re stackIn_295_0Lifetime1Lifetime2;
        re stackIn_295_1Lifetime1Lifetime1;
        re stackIn_295_1Lifetime1Lifetime2;
        int stackIn_162_0Lifetime1;
        int stackIn_205_0Lifetime1;
        int stackIn_205_1Lifetime1;
        float var1_floatLifetime1;
        float var1_floatLifetime2;
        float var1_floatLifetime3;
        float var1_floatLifetime4;
        float var1_floatLifetime5;
        int var13_intLifetime1;
        int var14Lifetime1;
        int var15_intLifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var19Lifetime1;
        int var13_intLifetime1Lifetime1;
        int var14Lifetime1Lifetime1;
        var20 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (e.field_z > 0) {
            e.field_z = e.field_z - 1;
          }
          if (0 < ClientLookupTables.field_a) {
            ClientLookupTables.field_a = ClientLookupTables.field_a - 1;
          }
          if (0 < ValidationStatusWidget.field_Q) {
            ValidationStatusWidget.field_Q = ValidationStatusWidget.field_Q - 1;
          }
          if (0 < qh.field_u) {
            qh.field_u = qh.field_u - 1;
          }
          if (NanoFrameTimer.field_f > 0) {
            NanoFrameTimer.field_f = NanoFrameTimer.field_f - 1;
          }
          if (le.field_gb > 0) {
            le.field_gb = le.field_gb - 1;
          }
          if (0 < RegistrationAgreementPane.field_K) {
            RegistrationAgreementPane.field_K = RegistrationAgreementPane.field_K - 1;
          }
          var1_float = CrossfadingMidiPcmStream.field_v.j();
          if (var1_float != GameCanvas.field_a) {
            CrossfadingMidiPcmStream.field_v.setStereoWidth(PcmOutputWorker.moveFloatTowardTarget((byte) -10, GameCanvas.field_a, var1_float, 0.07000000029802322f));
          }
          var1_floatLifetime1 = CrossfadingMidiPcmStream.field_v.h();
          if (var1_floatLifetime1 != qm.field_O) {
            CrossfadingMidiPcmStream.field_v.f(PcmOutputWorker.moveFloatTowardTarget((byte) -96, qm.field_O, var1_floatLifetime1, 0.07000000029802322f));
          }
          var1_floatLifetime2 = CrossfadingMidiPcmStream.field_v.f();
          if (var1_floatLifetime2 != ea.field_d) {
            CrossfadingMidiPcmStream.field_v.b(PcmOutputWorker.moveFloatTowardTarget((byte) -73, ea.field_d, var1_floatLifetime2, 0.009999999776482582f));
          }
          var1_floatLifetime3 = CrossfadingMidiPcmStream.field_v.g();
          if (var1_floatLifetime3 != UiWidget.field_w) {
            CrossfadingMidiPcmStream.field_v.e(PcmOutputWorker.moveFloatTowardTarget((byte) -46, UiWidget.field_w, var1_floatLifetime3, 1.0f));
          }
          var1_floatLifetime4 = CrossfadingMidiPcmStream.field_v.k();
          if (an.field_n != var1_floatLifetime4) {
            CrossfadingMidiPcmStream.field_v.setWetGain(PcmOutputWorker.moveFloatTowardTarget((byte) -112, an.field_n, var1_floatLifetime4, 0.009999999776482582f));
          }
          var1_floatLifetime5 = CrossfadingMidiPcmStream.field_v.e();
          if (var1_floatLifetime5 != vb.field_Jb) {
            CrossfadingMidiPcmStream.field_v.a(PcmOutputWorker.moveFloatTowardTarget((byte) -56, vb.field_Jb, var1_floatLifetime5, 0.009999999776482582f));
          }
          eb.field_e.setRootStream(CrossfadingMidiPcmStream.field_v);
          ik.field_b = false;
          var2 = ln.field_a.field_d;
          var3 = ln.field_a.field_a;
          var4 = ln.field_a.field_n;
          if (cm.field_c == null ||
            cm.field_c.length != var4) {
            cm.field_c = new int[var4];
          }
          if (ImageProducerRasterBuffer.a(false)) {
            ResizableModalDialog.field_R = ResizableModalDialog.field_R - 1;
          }
          if (0 < nl.field_d) {
            nl.field_d = nl.field_d - 1;
          }
          if (0 <= pj.field_v) {
            ik.field_c = ik.field_c + 1;
            if (ik.field_c > 2) {
              ik.field_c = 0;
              pj.field_v = pj.field_v + 1;
              if (pj.field_v == 4) {
                pj.field_v = -1;
              }
              if (pj.field_v == 8) {
                pj.field_v = -1;
              }
            }
          }
          if (0 < bh.field_d) {
            bh.field_d = bh.field_d - 1;
          }
          if (rf.field_f > 0) {
            rf.field_f = rf.field_f - 1;
          }
          if (param0 >= -22) {
            return;
          }
          var5 = TextHotspotBounds.field_m[0];
          var6 = var5.field_j;
          var7 = var6.field_e;
          var8 = var6.field_g;
          var9 = var6.getClampedTileIndex(-4);
          if ((15 & ng.field_u) == 0) {
            if (null != q.field_g) {
              stackIn_63_0 = q.field_g;
            } else {
              stackIn_63_0 = FullscreenFocusCanvas.field_a;
            }
            var10_int = ((ql) (Object) stackIn_63_0).a(var6, ni.field_e, (byte) 109) ? 1 : 0;
            if ((ni.field_e ? 1 : 0) != var10_int) {
              ni.field_e = (var10_int != 0);
              stackIn_69_0 = ha.field_w;
              if (ni.field_e) {
                stackIn_70_1 = -4;
              } else {
                stackIn_70_1 = 4;
              }
              stackIn_69_0.field_w = stackIn_70_1;
            }
            if (!ni.field_e &&
              ii.b((byte) 30)) {
              qm.field_O = 0.5f;
              GameCanvas.field_a = 1.0f;
              ea.field_d = 0.6000000238418579f;
              vb.field_Jb = 0.800000011920929f;
              UiWidget.field_w = 10.0f;
              an.field_n = 0.30000001192092896f;
            } else {
              ea.field_d = 0.5f;
              UiWidget.field_w = 30.0f;
              vb.field_Jb = 0.8999999761581421f;
              an.field_n = 0.20000000298023224f;
              GameCanvas.field_a = 0.30000001192092896f;
              qm.field_O = 0.5f;
            }
          }
          var10 = var5.field_l;
          if (5 == ha.field_t) {
            var11_int = -var7 + LabeledWidgetContainer.field_E.field_e;
            if (var11_int < 0) {
              var11_int = -var11_int;
            }
            var12_int = LabeledWidgetContainer.field_E.field_g - var8;
            if (var12_int < 0) {
              var12_int = -var12_int;
            }
            var13_int = var11_int + var12_int;
            if (var13_int < 10) {
              CrossfadingMidiPcmStream.a(6, 1);
            }
          }
          var24 = ln.field_a.field_e;
          var22 = var24;
          var11 = var22;
          var23 = ln.field_a.field_i;
          var21 = var23;
          var12 = var21;
          if (0 == FullscreenNoticeType.field_c &&
            hg.field_e != 0) {
            if (FullscreenNoticeType.field_d < 50) {
              pc.a(2);
              var13_intLifetime1 = -25 + var8;
              var14 = var8 + 25;
              var15_int = -30 + var7;
              if (var15_int < 0) {
                var15_int = 0;
              }
              if (var3 <= var14) {
                var14 = -1 + var3;
              }
              if (var13_intLifetime1 < 0) {
                var13_intLifetime1 = 0;
              }
              var16 = var7 + 30;
              if (var16 >= var2) {
                var16 = var2 - 1;
              }
              var18 = var13_intLifetime1;
              scanLoop1: while (true) {
                stackIn_100_0 = var14;
                if (stackIn_100_0 > var18) {
                  var17 = var15_int + var18 * var2;
                  for (var19 = var15_int; var19 < var16; var19++) {
                    stackOut_103_0 = var11[var17];
                    stackIn_100_0 = stackOut_103_0 ? 1 : 0;
                    stackIn_104_0 = stackOut_103_0;
                    if (stackIn_104_0) {
                      if (var23[var17] < 26) {
                        var12[var17] = var12[var17] + 1;
                      }
                    } else {
                      if (10 < var23[var17]) {
                        var12[var17] = var12[var17] - 1;
                      }
                    }
                    var17++;
                  }
                  var18++;
                  continue scanLoop1;
                }
                break;
              }
              FullscreenNoticeType.field_d = FullscreenNoticeType.field_d + 1;
              if (FullscreenNoticeType.field_d == 1) {
                var18Lifetime1 = 0;
                var19Lifetime1 = 1;
                if (bm.field_c != 0) {
                  if (4 >= rl.field_c) {
                    var18Lifetime1 = 1;
                  }
                  if (rl.field_c == 0) {
                    var19Lifetime1 = 0;
                  }
                  if (rl.field_c == 8) {
                    var19Lifetime1 = 0;
                  }
                  if (rl.field_c == 9) {
                    var19Lifetime1 = 0;
                  }
                } else {
                  if (1 == rl.field_c) {
                    var18Lifetime1 = 1;
                  }
                  if (rl.field_c == 0) {
                    var19Lifetime1 = 0;
                  }
                }
                if (var19Lifetime1 != 0 &&
                  uj.field_l == 1) {
                  stackIn_133_0 = eh.field_c;
                  stackIn_133_1 = NetworkArchiveRequest.field_A;
                  if (var18Lifetime1 != 0) {
                    stackIn_134_2 = 21;
                  } else {
                    stackIn_134_2 = 22;
                  }
                  ((PcmStreamMixer) (Object) stackIn_133_0).playSample(stackIn_133_1[stackIn_134_2], 90, uh.field_i);
                }
              }
              return;
            }
            if (le.field_D > 0 &&
              j.field_c != -1) {
              le.field_D = le.field_D - 1;
              if (512.0 * Math.random() > (double)le.field_D) {
                var13_ref_oc = new GridPoint(var6);
                var13_ref_oc.field_e = var13_ref_oc.field_e + (int)(-25.0 + 50.0 * Math.random());
                var13_ref_oc.field_g = var13_ref_oc.field_g + (int)(-25.0 + Math.random() * 50.0);
                for (var14Lifetime1 = 0; 10 > var14Lifetime1; var14Lifetime1++) {
                  AlphaWidgetContainer.field_F[ib.field_c].field_c = Math.random() * 255.0;
                  AlphaWidgetContainer.field_F[ib.field_c].field_j.copyCoordinatesFrom((byte) 46, var13_ref_oc);
                  AlphaWidgetContainer.field_F[ib.field_c].field_l.a(var10, -28860);
                  AlphaWidgetContainer.field_F[ib.field_c].field_e = 0;
                  AlphaWidgetContainer.field_F[ib.field_c].field_h = 0;
                  AlphaWidgetContainer.field_F[ib.field_c].field_i = 8;
                  ib.field_c = ib.field_c + 1;
                }
                var14Lifetime1Lifetime1 = -1;
                var15_intLifetime1 = (int)(3.0 * Math.random());
                if (var15_intLifetime1 == 0) {
                  var14Lifetime1Lifetime1 = 0;
                } else {
                  if (var15_intLifetime1 == 1) {
                    var14Lifetime1Lifetime1 = 1;
                  } else {
                    if (2 == var15_intLifetime1) {
                      var14Lifetime1Lifetime1 = 10;
                    }
                  }
                }
                if (uj.field_l == 1 &&
                  ArchiveNetworkClient.d((byte) 116)) {
                  eh.field_c.playSample(em.field_a[var14Lifetime1Lifetime1], 100, uh.field_i * (128 - le.field_D / 4) / 128);
                }
              }
              for (var13_intLifetime1Lifetime1 = 0; var13_intLifetime1Lifetime1 < 5; var13_intLifetime1Lifetime1++) {
                stackIn_162_0 = compareDoublesNaNResultNegative(Math.random() * 512.0, (double)le.field_D);
                if (stackIn_162_0 > 0) {
                  AlphaWidgetContainer.field_F[ib.field_c].field_c = Math.random() * 255.0;
                  AlphaWidgetContainer.field_F[ib.field_c].field_j.copyCoordinatesFrom((byte) 46, var6);
                  dupTemp$0 = AlphaWidgetContainer.field_F[ib.field_c].field_j;
                  dupTemp$0.field_e = dupTemp$0.field_e + (int)(50.0 * Math.random() - 25.0);
                  dupTemp$1 = AlphaWidgetContainer.field_F[ib.field_c].field_j;
                  dupTemp$1.field_g = dupTemp$1.field_g + (int)(-25.0 + Math.random() * 50.0);
                  AlphaWidgetContainer.field_F[ib.field_c].field_l.a(var10, -28860);
                  AlphaWidgetContainer.field_F[ib.field_c].field_e = 0;
                  AlphaWidgetContainer.field_F[ib.field_c].field_h = 0;
                  AlphaWidgetContainer.field_F[ib.field_c].field_i = 8;
                  ib.field_c = ib.field_c + 1;
                }
              }
            }
            stackIn_162_0Lifetime1 = ~le.field_D;
            if (stackIn_162_0Lifetime1 == -2) {
              if (uj.field_l == 1 &&
                ArchiveNetworkClient.d((byte) 57)) {
                eh.field_c.playSample(NetworkArchiveRequest.field_A[8], 100, uh.field_i);
              }
              mf.a(false, 5);
            }
          }
          if (le.field_D == 1 &&
            1 == uj.field_l &&
            ArchiveNetworkClient.d((byte) 102)) {
            eh.field_c.playSample(em.field_a[0], 100, uh.field_i * 3 / 2);
          }
          var13 = var10.field_f;
          var15 = var10.field_a;
          while (AlphaWidgetContainer.e((byte) -105)) {
            var17Lifetime1 = pj.field_e - 16;
            stackIn_205_0 = -1;
            stackIn_205_1 = ~var17Lifetime1;
            if (stackIn_205_0 >= stackIn_205_1 &&
              8 > var17Lifetime1) {
              stackIn_185_0 = -127;
              if (qh.field_m[82]) {
                stackIn_186_1 = 1;
              } else {
                stackIn_186_1 = 0;
              }
              AchievementNotification.selectWeaponForSlot(stackIn_185_0, stackIn_186_1, var17Lifetime1);
            } else {
              var17Lifetime1 = -1 + pj.field_e;
              if (var17Lifetime1 >= 0 &&
                var17Lifetime1 < 8) {
                AchievementNotification.selectWeaponForSlot(38, 1, var17Lifetime1);
              }
            }
            if (pj.field_e == 13 &&
              hg.field_e == 1 &&
              0 == FullscreenNoticeType.field_c) {
              ClientLookupTables.field_h = new re(true);
              return;
            }
            if (pj.field_e == 84 &&
              qh.field_m[86] &&
              !StandardContentDialog.p(3) &&
              ResizableModalDialog.field_S > 0) {
              LabeledWidgetContainer.a(false, (byte) -107);
            }
            if (pj.field_e == 80) {
              stackIn_201_0 = -123;
              stackIn_202_1 = !(hk.field_q);
              ec.setAlternateMovementKeysWithIntGuard(stackIn_201_0, stackIn_202_1);
            }
          }
          stackIn_205_0Lifetime1 = ~FullscreenNoticeType.field_c;
          stackIn_205_1Lifetime1 = -1;
          if (stackIn_205_0Lifetime1 == stackIn_205_1Lifetime1 ||
            !(NameSuggestionsPanel.field_I < 4)) {
            if (MidiPcmStream.field_r > cf.field_s) {
              cf.field_s = cf.field_s + 1;
            }
            if (-10 + MidiPcmStream.field_r > cf.field_s) {
              cf.field_s = cf.field_s + 1;
            }
            if (cf.field_s < (-50 + MidiPcmStream.field_r)) {
              cf.field_s = cf.field_s + 1;
            }
            if (hg.field_e == 1) {
              var17Lifetime2 = 0;
              if ((j.field_c != -1 ||
                rb.field_m != -1 ||
                rc.field_e == 0) && var17Lifetime2 == 0) {
                MidiNoteMask.a(var5, var2, var4, var7, (byte) 15, var9, var8, var24, var15, var13, var23, var3);
              }
            } else {
              if (0 == hg.field_e) {
                rl.field_c = -1;
              }
              if (pf.field_o == 1 &&
                -1 != rl.field_c) {
                NameSuggestionsPanel.field_I = 1;
                FullscreenNoticeType.field_c = 1;
              }
            }
          }
          if (FullscreenNoticeType.field_c != 0) {
            FullscreenNoticeType.field_c = FullscreenNoticeType.field_c + 1;
            if (4 > NameSuggestionsPanel.field_I) {
              FullscreenNoticeType.field_c = FullscreenNoticeType.field_c + 6;
            }
            if (le.field_D == 1) {
              FullscreenNoticeType.field_c = FullscreenNoticeType.field_c + 6;
            }
            if (FullscreenNoticeType.field_c == 128) {
              if (NameSuggestionsPanel.field_I == 1) {
                if (hg.field_e < 0) {
                  hg.field_e = -1;
                }
                hg.field_e = hg.field_e + 1;
                if (hg.field_e == 0) {
                  stackIn_246_0 = dd.field_o;
                  stackIn_246_1 = 10;
                  if (om.field_b) {
                    stackIn_247_2 = PcmResampler.field_c;
                  } else {
                    stackIn_247_2 = ja.field_h;
                  }
                  boolean decompiledFrameRemainder1 = true;
                  stackIn_246_0[stackIn_246_1] = stackIn_247_2;
                  stackIn_255_0 = null;
                  stackIn_255_1 = null;
                  if (StandardContentDialog.p(3)) {
                    if (MidiPcmStream.field_r == 0) {
                      stackIn_255_0Lifetime1 = null;
                      stackIn_255_1Lifetime1 = null;
                      stackIn_251_2 = false;
                    } else {
                      stackIn_255_0Lifetime1 = null;
                      stackIn_255_1Lifetime1 = null;
                      stackIn_251_2 = true;
                    }
                    if (DelayedPacket.field_q.isEmpty(-20049)) {
                      stackIn_255_0Lifetime1Lifetime1 = null;
                      stackIn_255_1Lifetime1Lifetime1 = null;
                      stackIn_254_3 = false;
                    } else {
                      stackIn_255_0Lifetime1Lifetime1 = null;
                      stackIn_255_1Lifetime1Lifetime1 = null;
                      stackIn_254_3 = true;
                    }
                    if (ResizableModalDialog.a(stackIn_251_2, stackIn_254_3, false, rg.a((byte) -54)) != null) {
                      stackIn_257_0 = null;
                      stackIn_257_1 = null;
                      stackIn_257_2 = 9;
                      decompiledFrameRemainder1 = false;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_257_0Lifetime1 = null;
                    stackIn_257_1Lifetime1 = null;
                    stackIn_257_2 = 10;
                  }
                  ClientLookupTables.field_h = new re(stackIn_257_2);
                  u.field_f[26] = FullscreenStatusDialog.field_bb;
                  return;
                }
                if (hg.field_e == 1) {
                  le.field_D = 0;
                  StandardContentDialog.a((byte) -95, rl.field_c);
                  ClientLookupTables.field_h = new re(8);
                  return;
                }
              }
              if (NameSuggestionsPanel.field_I == 2) {
                cm.a(bm.field_c, 0, rl.field_c);
                le.field_D = 0;
                StandardContentDialog.a((byte) 127, rl.field_c + 1);
                AccountNameAvailabilityValidator.b(false, (byte) -97);
                ClientLookupTables.field_h = new re(11);
                return;
              }
              if (NameSuggestionsPanel.field_I == 3) {
                cm.a(bm.field_c, 0, 9);
                u.field_f[26] = FullscreenNoticeType.field_e;
                if (1 == bm.field_c &&
                  rl.field_c > 9) {
                  rl.field_c = 0;
                  FullscreenNoticeType.field_d = 50;
                  le.field_D = 0;
                  AccountNameAvailabilityValidator.b(true, (byte) -89);
                  ClientLookupTables.field_h = new re(13);
                  ArchiveProvider.field_e = 0;
                  return;
                }
                if (bm.field_c == 0 &&
                  rl.field_c <= 2) {
                  FullscreenNoticeType.field_d = 50;
                  le.field_D = 0;
                  StandardContentDialog.a((byte) -100, 3);
                  ClientLookupTables.field_h = new re(12);
                  ArchiveProvider.field_e = 0;
                  AccountNameAvailabilityValidator.b(false, (byte) -114);
                  return;
                }
                FullscreenNoticeType.field_d = 50;
                le.field_D = 0;
                rl.field_c = 0;
                AccountNameAvailabilityValidator.b(true, (byte) -93);
                ArchiveProvider.field_e = 0;
                ClientLookupTables.field_h = new re(13);
                return;
              }
              if (NameSuggestionsPanel.field_I >= 4) {
                le.field_D = 0;
                hg.field_e = 0;
                if (FullscreenStatusDialog.field_ab == 1) {
                  ja.a((byte) -127, ProgressDialog.field_ab, true);
                }
                stackIn_285_0 = dd.field_o;
                stackIn_285_1 = 10;
                if (om.field_b) {
                  stackIn_286_2 = PcmResampler.field_c;
                } else {
                  stackIn_286_2 = ja.field_h;
                }
                boolean decompiledFrameRemainder0 = true;
                stackIn_285_0[stackIn_285_1] = stackIn_286_2;
                stackIn_295_0 = null;
                stackIn_295_1 = null;
                if (StandardContentDialog.p(3)) {
                  if (MidiPcmStream.field_r == 0) {
                    stackIn_295_0Lifetime1 = null;
                    stackIn_295_1Lifetime1 = null;
                    stackIn_290_2 = false;
                  } else {
                    stackIn_295_0Lifetime1 = null;
                    stackIn_295_1Lifetime1 = null;
                    stackIn_290_2 = true;
                  }
                  if (DelayedPacket.field_q.isEmpty(-20049)) {
                    stackIn_295_0Lifetime1Lifetime1 = null;
                    stackIn_295_1Lifetime1Lifetime1 = null;
                    stackIn_293_3 = false;
                  } else {
                    stackIn_295_0Lifetime1Lifetime1 = null;
                    stackIn_295_1Lifetime1Lifetime1 = null;
                    stackIn_293_3 = true;
                  }
                  stackIn_295_0Lifetime1Lifetime2 = null;
                  stackIn_295_1Lifetime1Lifetime2 = null;
                  if (ResizableModalDialog.a(stackIn_290_2, stackIn_293_3, false, rg.a((byte) 124)) != null) {
                    stackIn_296_0 = null;
                    stackIn_296_1 = null;
                    stackIn_296_2 = 9;
                    decompiledFrameRemainder0 = false;
                  }
                }
                if (decompiledFrameRemainder0) {
                  stackIn_296_0Lifetime1 = null;
                  stackIn_296_1Lifetime1 = null;
                  stackIn_296_2 = 10;
                }
                ClientLookupTables.field_h = new re(stackIn_296_2);
                return;
              }
            }
            FullscreenNoticeType.field_c = FullscreenNoticeType.field_c + 1;
            if (256 < FullscreenNoticeType.field_c) {
              FullscreenNoticeType.field_c = 0;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) var1), "wj.G(" + param0 + ')');
        }
    }

    ValidationStatusIcon(FieldValidator param0) {
        try {
          this.field_I = param0;
        } catch (RuntimeException runtimeException) {
          throw AccountCreationResultPanel.wrapClientException((Throwable) ((Object) runtimeException), "wj.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_K = "Confirm Email:";
        field_O = 256;
        field_G = "These doors cannot be opened. Find a different route.";
        field_N = new ub();
    }

    private static int compareDoublesNaNResultNegative(double left, double right) {
        return left > right ? 1 : (left == right ? 0 : -1);
    }
}
