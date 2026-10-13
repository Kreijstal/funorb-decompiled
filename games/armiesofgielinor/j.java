/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class j {
    private FixedQuaternion field_i;
    static int[] field_j;
    static int field_b;
    private BattleCamera field_h;
    private int[] field_c;
    private FixedQuaternion field_f;
    private int field_g;
    private FixedQuaternion field_a;
    static int[] decodedSpriteOffsetXs;
    private int field_k;
    static String field_d;

    private final void a(int param0) {
        this.field_a.setAxisAngle((byte) 47, 65536, 0, 0, 1194);
        this.field_a.normalize(126);
        this.field_f.setAxisAngle((byte) 47, 0, 0, 65536, 256);
        this.field_f.normalize(91);
        this.field_a.copyInto(this.field_i, true);
        int var2 = -49 % ((-8 - param0) / 62);
        this.field_i.prependRotation(1, this.field_f);
    }

    private final void a(int param0, int param1, int param2) {
        this.a((byte) 92, param1, this.field_c, param2, this.field_g);
        this.field_c[param0] = this.field_c[param0] - this.field_k;
    }

    public static void b(byte param0) {
        int var1 = 92 % ((param0 - 88) / 37);
        field_j = null;
        field_d = null;
        decodedSpriteOffsetXs = null;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var2 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (null != DisplacedUnitMarker.field_t) {
            return;
          }
          DisplacedUnitMarker.field_t = new String[60];
          DisplacedUnitMarker.field_t[24] = ValidatedTextWidget.field_Y;
          DisplacedUnitMarker.field_t[11] = tf.field_p;
          DisplacedUnitMarker.field_t[0] = od.field_g;
          DisplacedUnitMarker.field_t[1] = la.field_e;
          DisplacedUnitMarker.field_t[13] = DeployAction.field_v;
          DisplacedUnitMarker.field_t[7] = gp.field_c;
          DisplacedUnitMarker.field_t[3] = lb.field_d;
          DisplacedUnitMarker.field_t[53] = ModalDialogHost.field_P;
          DisplacedUnitMarker.field_t[6] = AiInfluenceMap.field_k;
          DisplacedUnitMarker.field_t[9] = PreparedAction.field_k;
          DisplacedUnitMarker.field_t[8] = null;
          DisplacedUnitMarker.field_t[4] = el.field_a;
          DisplacedUnitMarker.field_t[54] = mh.field_d;
          DisplacedUnitMarker.field_t[2] = ClientConnectionState.field_b;
          DisplacedUnitMarker.field_t[5] = PointerInputHandler.field_d;
          DisplacedUnitMarker.field_t[25] = AnimationSkeleton.field_m;
          DisplacedUnitMarker.field_t[22] = hq.field_d;
          DisplacedUnitMarker.field_t[16] = InstructionsPanel.field_y;
          DisplacedUnitMarker.field_t[28] = wf.field_s;
          DisplacedUnitMarker.field_t[19] = s.field_b;
          DisplacedUnitMarker.field_t[21] = ConsolePanel.field_r;
          DisplacedUnitMarker.field_t[26] = bj.field_l;
          DisplacedUnitMarker.field_t[46] = hc.field_d;
          DisplacedUnitMarker.field_t[17] = su.field_c;
          DisplacedUnitMarker.field_t[23] = ClientConnectionState.field_e;
          DisplacedUnitMarker.field_t[27] = NodeHashTable.field_b;
          DisplacedUnitMarker.field_t[30] = LoginMethod.field_e;
          DisplacedUnitMarker.field_t[20] = NodeHashIterator.field_h;
          DisplacedUnitMarker.field_t[18] = InstructionsPanel.field_c;
          DisplacedUnitMarker.field_t[14] = DelayedPacket.field_s[0];
          DisplacedUnitMarker.field_t[15] = DelayedPacket.field_s[1];
          for (var1_int = 55; 59 > var1_int; var1_int++) {
            DisplacedUnitMarker.field_t[var1_int] = null;
          }
          DisplacedUnitMarker.field_t[42] = nt.field_p;
          DisplacedUnitMarker.field_t[40] = vg.field_l;
          DisplacedUnitMarker.field_t[32] = ActionRequest.field_r;
          DisplacedUnitMarker.field_t[36] = StripedProgressWidget.field_G;
          DisplacedUnitMarker.field_t[31] = DebugConsole.field_C;
          DisplacedUnitMarker.field_t[35] = AccountRequestResult.field_j;
          DisplacedUnitMarker.field_t[47] = qk.field_f;
          DisplacedUnitMarker.field_t[51] = nt.field_p;
          DisplacedUnitMarker.field_t[48] = StandardContentDialog.field_lb;
          DisplacedUnitMarker.field_t[44] = dd.field_g;
          DisplacedUnitMarker.field_t[37] = lg.field_c;
          CampaignDefinition.field_m = new String[3];
          DisplacedUnitMarker.field_t[52] = ToggleTurnSkipConsoleCommand.field_G;
          DisplacedUnitMarker.field_t[38] = PortalLossCondition.field_f;
          ParasiteEvent.field_A = new String[]{VertexNormal.field_a, QuickChatPhraseRepository.field_e, ClientUiComponent.field_lb, GridWidgetContainer.field_P};
          DisplacedUnitMarker.field_t[43] = FaceNormal.field_c;
          DisplacedUnitMarker.field_t[33] = gv.field_b;
          DisplacedUnitMarker.field_t[59] = TickCounter.field_e;
          DisplacedUnitMarker.field_t[41] = CorpseConditionMarker.field_x;
          DisplacedUnitMarker.field_t[45] = ToggleTurnSkipConsoleCommand.field_G;
          DisplacedUnitMarker.field_t[50] = GameEvent.field_u;
          DisplacedUnitMarker.field_t[34] = LoginMethod.field_e;
          DisplacedUnitMarker.field_t[29] = ClippedWidgetContainer.field_I;
          DisplacedUnitMarker.field_t[39] = StateChangeEvent.field_y;
          wb.field_b = new String[29];
          CampaignDefinition.field_m[0] = on.field_o;
          CampaignDefinition.field_m[2] = CacheEntry.field_v;
          CampaignDefinition.field_m[1] = uh.field_b;
          wb.field_b[0] = null;
          wb.field_b[10] = DamageEvent.field_z;
          if (param0 < 81) {
            return;
          }
          wb.field_b[6] = el.field_a;
          wb.field_b[13] = QuickChatPhrase.field_y;
          du.field_g = new String[]{ClientContextMenu.field_l, ModalDialogHost.field_N, tv.field_c, tv.field_b, CombatSandbox.field_g, ScrollContainer.field_Kb, DelayedPacket.field_r, r.field_I, we.field_h, AccountRegistrationForm.field_Q, ConsoleExpression.field_t, ByteStorage.field_c, RasterState.field_l, pi.field_P, StateChangeEvent.field_H, ut.field_ib};
          wb.field_b[18] = dd.field_g;
          wb.field_b[4] = PrintVictoryConditionsConsoleCommand.field_H;
          wb.field_b[14] = ov.field_d;
          wb.field_b[17] = ke.field_f;
          wb.field_b[12] = bk.field_b;
          wb.field_b[27] = ModalDialogHost.field_P;
          wb.field_b[28] = mh.field_d;
          wb.field_b[23] = StandardContentDialog.field_lb;
          wb.field_b[1] = ConsoleEvaluationException.field_d;
          wb.field_b[22] = MeshObject.field_b;
          wb.field_b[2] = cw.field_b;
          wb.field_b[5] = SingleChildWidgetContainer.field_F;
          wb.field_b[24] = ConsoleEvaluationException.field_d;
          wb.field_b[15] = hc.field_w;
          wb.field_b[26] = lb.field_d;
          wb.field_b[21] = ConsoleExpression.field_u;
          wb.field_b[7] = kw.field_N;
          wb.field_b[8] = pu.field_h;
          wb.field_b[3] = l.field_g;
          wb.field_b[11] = DiskCacheRequest.field_J;
          wb.field_b[19] = PlayerProfile.field_e;
          wb.field_b[9] = jn.field_e;
          wb.field_b[20] = CorpseConditionMarker.field_x;
          oi.field_a[10] = EmailCheckResult.a(4800, oi.field_a[10], new String[]{Integer.toString(20)});
          EmailValidator.battleHintMessages = new String[6];
          EmailValidator.battleHintMessages[3] = jj.field_f;
          EmailValidator.battleHintMessages[0] = DeployAction.field_C;
          EmailValidator.battleHintMessages[4] = DropdownOptionList.field_Y;
          EmailValidator.battleHintMessages[2] = qt.field_a;
          EmailValidator.battleHintMessages[1] = bk.field_c;
          EmailValidator.battleHintMessages[5] = fa.field_g;
          var3 = 0;
          var1_intLifetime1 = var3;
          while (jj.field_a.length > var3) {
            if (dj.field_d[var3] == null) {
              dj.field_d[var3] = jj.field_a[var3];
            }
            var3++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "j.C(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1, int[] param2, int param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_h.targetPosition[0] = param1;
          this.field_h.targetPosition[1] = param3;
          this.field_h.transformTarget((byte) -49);
          var6_int = this.field_h.transformedPosition[0];
          var7 = param4;
          param2[0] = var6_int;
          if (param0 <= 49) {
            decodedSpriteOffsetXs = (int[]) null;
          }
          var8 = this.field_h.transformedPosition[1];
          param2[1] = var7;
          param2[2] = var8;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = var6;
          stackIn_6_1 = new StringBuilder().append("j.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, boolean param2, int param3) {
        int stackIn_10_0 = 0;
        String stackIn_23_0 = null;
        ClientUiComponent stackIn_32_0 = null;
        String stackIn_33_1 = null;
        ClientUiComponent stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        String stackIn_36_2 = null;
        ClientUiComponent stackIn_66_0 = null;
        boolean stackIn_66_1 = false;
        boolean stackIn_67_2 = false;
        ClientUiComponent stackIn_71_0 = null;
        boolean stackIn_71_1 = false;
        boolean stackIn_72_2 = false;
        ClientUiComponent stackIn_76_0 = null;
        boolean stackIn_76_1 = false;
        boolean stackIn_77_2 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        ClientUiComponent var5 = null;
        ClientUiComponent var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        Object var9 = null;
        int var10 = 0;
        int var11_int = 0;
        Object var11 = null;
        String var11_ref = null;
        int var12 = 0;
        int var13 = 0;
        ClientUiComponent var15 = null;
        String var16 = null;
        ClientUiComponent var17 = null;
        Object var11Lifetime1;
        int var9_intLifetime1;
        int var10Lifetime1;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          AnimationSequence.a(PreparedAction.field_r, param0 + 114);
          if (NumericDateInputWidget.roomSetup != null) {
            var15 = lm.field_b;
            var17 = var15;
            lm.field_b.height = 0;
            var17.width = 0;
            var5 = so.field_d;
            so.field_d.height = 0;
            var5.width = 0;
            pi.field_N.height = 0;
            var6 = pi.field_N;
            var6.width = 0;
            AccountRegistrationForm.field_F.text = uu.field_a.toUpperCase();
            var7 = (2 + pd.field_c.width) / 2;
            pi.field_N.setBounds(40, param0 - 20501, var7 - 2, -40 + pd.field_c.height, 0);
            so.field_d.setBounds(40, param0 ^ -20499, -var7 + pd.field_c.width, -40 + pd.field_c.height, var7);
            if (lm.field_e.length == 1 &&
              lm.field_e[0] == 2) {
              var8 = 0;
            } else {
              var8 = 0;
              var9_int = 0;
              var10 = 0;
              while (true) {
                if (lm.field_e.length > var10) {
                  stackIn_10_0 = ((CoatOfArms.field_d[var10 / 8] & 1 << (var10 & 7)) == 0) ? 0 : 1;
                  var11_int = stackIn_10_0;
                  if (var11_int != 0) {
                    var9_int++;
                  }
                  if (var11_int != 0 &&
                    lm.field_e[var10] != 2) {
                    var8 = 1;
                  } else {
                    var10++;
                    continue;
                  }
                }
                if (var9_int != 0) {
                  break;
                }
                var8 = 1;
                break;
              }
            }
            so.field_d.inputEnabled = true;
            if (!SpellCastAction.field_s) {
              stackIn_32_0 = so.field_d;
              if (var8 != 0) {
                stackIn_33_1 = DefeatPlayerWithMetricsConsoleCommand.field_E;
              } else {
                stackIn_33_1 = fk.field_e;
              }
              stackIn_32_0.text = ((String) (Object) stackIn_33_1).toUpperCase();
              stackIn_35_0 = AccountNameAvailabilityValidator.field_l;
              stackIn_35_1 = 4800;
              if (var8 == 0) {
                stackIn_36_2 = ov.field_k;
              } else {
                stackIn_36_2 = ConsoleCommand.field_x;
              }
              stackIn_35_0.text = EmailCheckResult.a(stackIn_35_1, stackIn_36_2, new String[]{so.field_d.text});
              SocialListPanel.field_Lb.inputEnabled = true;
              fc.field_a = true;
              pi.field_N.text = cg.field_i;
              if (fs.field_d != null) {
                jp.field_a = false;
                fc.field_a = false;
                if (null == TeleportAction.field_B) {
                  dt.field_d = new boolean[tq.gameOptionCount];
                  TeleportAction.field_B = new byte[tq.gameOptionCount];
                }
                var13 = 0;
                var9_intLifetime1 = var13;
                while (var13 < tq.gameOptionCount) {
                  dt.field_d[var13] = false;
                  var13++;
                }
                ConsoleTokenCursor.a(0, tq.gameOptionCount, NumericDateInputWidget.roomSetup, -1, true, -1, (byte) 89, -1);
                if (!(BufferedSocket.field_j < 2) &&
                  br.heldKeys[12]) {
                  fc.field_a = true;
                }
              }
              if (!fc.field_a) {
                so.field_d.inputEnabled = false;
                if (so.field_d.hovered) {
                  var9 = null;
                  if (jp.field_a) {
                    var9 = "<col=A00000>" + ep.field_h + "</col>";
                    var11 = var9;
                    var9 = var11;
                    var11Lifetime1 = var9;
                    var9 = var11Lifetime1;
                  }
                  for (var10Lifetime1 = 0; var10Lifetime1 < tq.gameOptionCount; var10Lifetime1++) {
                    if (dt.field_d[var10Lifetime1]) {
                      var11_ref = "<col=A00000>" + GridWidgetContainer.field_M[var10Lifetime1] + "</col>";
                      var9 = var11_ref;
                      var9 = var11_ref;
                      if (var9 != null) {
                        var9 = (String) (var9) + ", " + var11_ref;
                      } else {
                        var9 = var11_ref;
                      }
                    }
                  }
                  DialogMessagePane.field_I = "<col=A00000>" + kp.field_e + "<br>" + ov.field_j + (String) (var9);
                }
              }
            } else {
              AccountNameAvailabilityValidator.field_l.text = AiActionCandidate.field_v;
              SocialListPanel.field_Lb.inputEnabled = false;
              if (var8 != 0) {
                stackIn_23_0 = SoundCache.field_f;
              } else {
                stackIn_23_0 = PreparedAction.field_l;
              }
              var16 = stackIn_23_0;
              var9 = var16;
              var9 = var16;
              var9 = var16;
              var10Lifetime1 = pi.field_N.font.textWidth(var16) + 3 * pi.field_N.font.characterWidth('.');
              pi.field_N.textHorizontalPadding = (-var10Lifetime1 + pi.field_N.width) / 2;
              if ((KeyboardInputListener.field_b & 48) == 16) {
                var9 = var16 + ".";
              }
              pi.field_N.horizontalAlignment = 0;
              if (32 == (48 & KeyboardInputListener.field_b)) {
                var9 = (String) (var9) + "..";
              }
              if (48 == (48 & KeyboardInputListener.field_b)) {
                var9 = (String) (var9) + "...";
              }
              pi.field_N.text = (String) (var9);
              so.field_d.text = ac.field_s.toUpperCase();
            }
          }
          if (param0 != 1) {
            j.b((byte) 20);
          }
          stackIn_66_0 = BitmapTextWidgetPainter.field_a;
          stackIn_66_1 = true;
          stackIn_67_2 = (param2) && (!param1) && (!ChannelGainProfile.field_f);
          ((ClientUiComponent) (Object) stackIn_66_0).updateInput(stackIn_66_1, stackIn_67_2);
          stackIn_71_0 = pd.field_c;
          stackIn_71_1 = true;
          stackIn_72_2 = (param2) && (!param1) && (!ChannelGainProfile.field_f);
          ((ClientUiComponent) (Object) stackIn_71_0).updateInput(stackIn_71_1, stackIn_72_2);
          stackIn_76_0 = LabeledWidgetContainer.field_R;
          stackIn_76_1 = true;
          stackIn_77_2 = (param2) && (!param1) && (ChannelGainProfile.field_f);
          ((ClientUiComponent) (Object) stackIn_76_0).updateInput(stackIn_76_1, stackIn_77_2);
          DebugConsole.field_w.tabs.advanceTabSelection(10000);
          if (null != NumericDateInputWidget.roomSetup) {
            if (0 != SocialListPanel.field_Lb.pressedButton) {
              TextEntryWidgetPainter.a(-127, param3);
            }
            if (so.field_d.pressedButton != 0) {
              if (SpellCastAction.field_s) {
                ManaEvent.a((byte) 69, param3);
              } else {
                DropdownArrowPainter.a(param3, -8006);
              }
            }
            vf.a(1, true, param3, NumericDateInputWidget.roomSetup);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var4), "j.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    j(int param0, BattleCamera param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_c = new int[3];
          this.field_h = param1;
          this.field_a = new FixedQuaternion();
          this.field_f = new FixedQuaternion();
          this.field_i = new FixedQuaternion();
          this.a(105);
          this.field_g = param0 << 16;
          this.field_k = ev.b(-55, this.field_g, so.sqrtFixed16(196608, -129));
          this.a(2, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("j.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    static {
        field_j = new int[]{128, 129, 131, 130, 132};
        field_d = "Already moved this turn";
    }
}
