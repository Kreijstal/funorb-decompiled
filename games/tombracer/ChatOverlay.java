/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ChatOverlay {
    private IntrusiveDeque visibleMessages;
    private boolean enabled;
    private boolean panelOpen;
    private IntrusiveDeque field_b;
    private gqa lastShownMessage;

    final void drawMessages(boolean param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (!this.enabled) {
          return;
        }
        if (!param0) {
          this.lastShownMessage = (gqa) null;
        }
        FloatingMessage var4 = (FloatingMessage) (this.visibleMessages.first(-80));
        while (var4 != null) {
          var4.draw((byte) -111);
          var4 = (FloatingMessage) (this.visibleMessages.next(107));
        }
    }

    final boolean isEnabled(int param0) {
        if (param0 != 4782) {
          this.visibleMessages = (IntrusiveDeque) null;
        }
        return this.enabled;
    }

    private final gqa getNewestChatMessage(int param0) {
        if (param0 != 1366884705) {
          this.disableWithPanel(-116);
        }
        if (ara.field_xb == 0) {
          return null;
        }
        return CourseLayout.field_d[-1 + ara.field_xb];
    }

    final void update(byte param0, boolean param1, boolean param2) {
        int var8 = 0;
        int stackIn_52_0 = 0;
        boolean stackIn_52_1 = false;
        gqa var4;
        int var5;
        int var6;
        String[] var7;
        FloatingMessage var7_ref;
        gqa var8_ref_gqa;
        int var9;
        String[] var10;
        gqa var11;
        int var6Lifetime1;
        FloatingMessage var7_refLifetime1;
        String[] var10Lifetime1;
        var9 = TombRacer.field_G ? 1 : 0;
        if (param1) {
          this.enable(0);
        } else {
          this.setEnabled(false);
        }
        if (!param1) {
          return;
        }
        if (null == this.lastShownMessage) {
          this.lastShownMessage = this.getNewestChatMessage(1366884705);
        }
        var11 = this.getNewestChatMessage(1366884705);
        var4 = var11;
        var5 = -127 % ((param0 + 34) / 44);
        if (var11 != null &&
          this.lastShownMessage != var11) {
          var6 = 0;
          var10 = new String[10];
          var7 = var10;
          while (var6 < 10) {
            if (0 <= -var6 + (ara.field_xb - 1)) {
              var8_ref_gqa = CourseLayout.field_d[-1 + ara.field_xb - var6];
              if (var8_ref_gqa != this.lastShownMessage) {
                if (var8_ref_gqa.field_f != null &&
                  var8_ref_gqa.field_m) {
                  var10[var6] = var8_ref_gqa.field_f;
                }
                var6++;
                continue;
              }
            }
            break;
          }
          var10Lifetime1 = var7;
          for (var8 = 9; var8 >= 0; var8--) {
            if (null != var10Lifetime1[var8] &&
              "" != var10Lifetime1[var8]) {
              this.addMessageNow(0, BannerCommand.a(var10Lifetime1[var8], (byte) -62));
            }
          }
          this.lastShownMessage = var11;
        }
        var6Lifetime1 = 120;
        if (this.enabled) {
          var7_ref = (FloatingMessage) (this.field_b.first(-80));
          while (var7_ref != null) {
            var7_ref.d((byte) 80);
            if (var7_ref.a((byte) -100) <= 0) {
              this.visibleMessages.addLast((byte) -77, var7_ref);
            }
            var7_ref = (FloatingMessage) (this.field_b.next(111));
          }
          var7_refLifetime1 = (FloatingMessage) (this.visibleMessages.first(-80));
          while (var7_refLifetime1 != null) {
            var7_refLifetime1.a(var6Lifetime1, 4, aaa.a(false) - var7_refLifetime1.c((byte) -96));
            var7_refLifetime1.tick(-43);
            if (var7_refLifetime1.c(-1)) {
              var6Lifetime1 = var6Lifetime1 + var7_refLifetime1.a(true);
            }
            if (var7_refLifetime1.isExpired((byte) -39)) {
              var7_refLifetime1.unlink(3);
            }
            var7_refLifetime1 = (FloatingMessage) (this.visibleMessages.next(121));
          }
        }
        if (this.panelOpen) {
          stackIn_52_0 = 108;
          stackIn_52_1 = param1;
          ProgressBarWidget.b(stackIn_52_0, stackIn_52_1, aaa.a(false) >> 1, SwitchLinkList.b(0) >> 1);
          fa.a((byte) -127);
        }
    }

    final void addMessage(int param0, int param1, FloatingMessage param2) {
        if (param2 == null ||
          param2.getText(29161) == null) {
          return;
        }
        if (!this.enabled) {
          return;
        }
        try {
          if (param0 <= 0) {
            this.visibleMessages.addLast((byte) -67, param2);
          } else {
            this.field_b.addLast((byte) -80, param2);
            param2.a(false, param0);
          }
          if (param1 != 0) {
            this.enabled = true;
          }
          param2.setTiming(false, 25, 12, 150);
          param2.a(1, aaa.a(false) / 3);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "ila.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void openPanel(boolean param0) {
        if (this.panelOpen) {
          return;
        }
        MonsterModel.j(28191);
        int var2 = 4;
        int var3 = 16;
        MazeSolver.a(SwitchLinkList.b(0) >> 1, 20, var2, -5327, "", var2, var3, var3, aaa.a(param0) >> 1);
        this.panelOpen = true;
    }

    final static int a(boolean param0, String param1, int param2, int param3, String param4, boolean param5) {
        try {
          int stackIn_4_0 = 0;
          int stackIn_7_0 = 0;
          int stackIn_31_0 = 0;
          boolean stackIn_43_0 = false;
          boolean stackIn_46_0 = false;
          boolean stackIn_49_0 = false;
          boolean stackIn_54_0 = false;
          int stackIn_81_0 = 0;
          int stackIn_88_0 = 0;
          int stackIn_93_0 = 0;
          int stackIn_102_0 = 0;
          int stackIn_104_0 = 0;
          RuntimeException stackIn_107_0 = null;
          StringBuilder stackIn_107_1 = null;
          String stackIn_108_2 = null;
          StringBuilder stackIn_110_1 = null;
          String stackIn_111_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          String var6 = null;
          RuntimeException var6_ref = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          CharSequence var11 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = TombRacer.field_G ? 1 : 0;
          try {
            if (OpenGlTransform3D.field_e == null &&
              !joa.pollGameSocketConnection(param5, (byte) 121)) {
              stackIn_4_0 = -1;
              return stackIn_4_0;
            }
            if (param2 != 50) {
              stackIn_7_0 = -82;
              return stackIn_7_0;
            }
            if (RotaterMountComponent.field_G == ProceduralTexture.field_p) {
              if (!param5) {
                fd.field_d = via.a(param1, 64, false, param4);
              } else {
                var10 = (String) null;
                fd.field_d = WidgetContainer.a(param1, 0, (String) null, false, tr.field_g);
              }
              ql.field_k.position = 0;
              ql.field_k.writeByte(14, 0);
              ql.field_k.writeByte(fd.field_d.a((byte) 113).field_d, 0);
              bl.flushPacketBuffer(-1, -1);
              ProceduralTexture.field_p = bva.field_b;
            }
            if (ProceduralTexture.field_p == bva.field_b &&
              LegacyRidgedWaterNoise.ensureGamePacketBytes(1, -1)) {
              var6_int = WeaveOperator.field_q.readUnsignedByte(255);
              if (var6_int == 0) {
                ProceduralTexture.field_p = ContextMenu.field_yb;
              } else {
                ProceduralTexture.field_p = bi.field_a;
                MembersUpsellMenu.field_z = var6_int;
                uca.field_d = -1;
              }
              WeaveOperator.field_q.position = 0;
            }
            if (ContextMenu.field_yb == ProceduralTexture.field_p &&
              LegacyRidgedWaterNoise.ensureGamePacketBytes(8, -1)) {
              PathMoverComponent.field_L = WeaveOperator.field_q.readLong(290646880);
              WeaveOperator.field_q.position = 0;
              RoomCompletedScreen.writeLoginPacket((byte) 121, param5, param3, fd.field_d, param0);
              ProceduralTexture.field_p = TestModel.field_o;
            }
            boolean decompiledFrameRemainder0 = true;
            if (ProceduralTexture.field_p == TestModel.field_o &&
              LegacyRidgedWaterNoise.ensureGamePacketBytes(1, param2 - 51)) {
              var6_intLifetime1 = WeaveOperator.field_q.readUnsignedByte(param2 + 205);
              WeaveOperator.field_q.position = 0;
              MembersUpsellMenu.field_z = var6_intLifetime1;
              NodeHashTable.field_d = null;
              if (var6_intLifetime1 != 0 &&
                var6_intLifetime1 != 1) {
                if (8 != var6_intLifetime1) {
                  ProceduralTexture.field_p = bi.field_a;
                  uca.field_d = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  dea.a(60);
                  PushableBlockMazeComponent.field_L = false;
                  stackIn_31_0 = var6_intLifetime1;
                  return stackIn_31_0;
                }
              }
              if (decompiledFrameRemainder0) {
                ProceduralTexture.field_p = HardwareGraphicsToolkit.field_w;
                uca.field_d = -1;
              }
            }
            if (HardwareGraphicsToolkit.field_w == ProceduralTexture.field_p &&
              cla.g(0)) {
              tr.field_g = WeaveOperator.field_q.readLong(param2 + 290646830);
              gj.field_q = param1;
              ld.field_e = WeaveOperator.field_q.readUnsignedByte(param2 ^ 205);
              PrimMazeGenerator.field_e = WeaveOperator.field_q.readUnsignedByte(255);
              ReportAbuseDialog.field_ub = WeaveOperator.field_q.readUnsignedShort(124);
              var6 = WeaveOperator.field_q.readNullableString(param2 - 28740);
              var7 = WeaveOperator.field_q.readUnsignedByte(255);
              if ((var7 & 1) != 0) {
                RasterShape.persistSessionSeedBytes(84);
              }
              if (!param5) {
                stackIn_43_0 = (0 != (var7 & 4));
                ai.field_a = stackIn_43_0;
                stackIn_46_0 = ((2 & var7) != 0);
                PowerDownItemBehaviour.field_s = stackIn_46_0;
                stackIn_49_0 = ((8 & var7) != 0);
                fua.field_g = stackIn_49_0;
                if (fua.field_g) {
                  PowerDownItemBehaviour.field_s = true;
                }
              }
              stackIn_54_0 = (0 != (var7 & 16));
              GraphicsToolkit.field_b = stackIn_54_0;
              if (q.field_r) {
                WeaveOperator.field_q.readUnsignedByte(255);
                WeaveOperator.field_q.readUnsignedByte(255);
                WeaveOperator.field_q.readInt(-104);
                LegacyOpenGlTexture.field_k = WeaveOperator.field_q.readUnsignedShort(121);
                np.field_J = new byte[LegacyOpenGlTexture.field_k];
                for (var8 = 0; var8 < LegacyOpenGlTexture.field_k; var8++) {
                  np.field_J[var8] = WeaveOperator.field_q.readByte((byte) 103);
                }
              }
              MenuEntry.field_k = WeaveOperator.field_q.readString((byte) -76);
              var11 = (CharSequence) ((Object) MenuEntry.field_k);
              tia.field_b = jd.normalizeDisplayName(1, var11);
              lsa.field_a = WeaveOperator.field_q.readUnsignedByte(255);
              ProceduralTexture.field_p = LegacyOpenGlTexture1D.field_n;
              if (fd.field_d.a((byte) 113) == BlockModel.field_s) {
                ShaderEffect.field_a.a(di.a(120), param2 ^ 55);
              } else {
                if (fd.field_d.a((byte) 113) == ViewportManager.field_f) {
                  ObjectList.field_d.a(di.a(109), 5);
                }
              }
              PushableBlockMazeComponent.field_L = false;
              if (var6 != null) {
                mp.writeSettingsCookie(var6, di.a(41), -21407);
              }
              if (0 >= ReportAbuseDialog.field_ub &&
                !ai.field_a) {
                try {
                  JavaScriptBridge.callWindowFunction(di.a(26), 2864, "unzap");
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  JavaScriptBridge.callWithArguments(param2 ^ -114, "zap", di.a(param2 + 43), new Object[]{sv.decodeBase37Name((byte) -38, tr.field_g)});
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (0 < ReportAbuseDialog.field_ub) {
                ft.field_a = true;
              }
              ql.field_k.initializeCipher(-26185, AllPlatformsMazeComponent.field_K);
              for (var8Lifetime1 = 0; 4 > var8Lifetime1; var8Lifetime1++) {
                AllPlatformsMazeComponent.field_K[var8Lifetime1] = AllPlatformsMazeComponent.field_K[var8Lifetime1] + 50;
              }
              WeaveOperator.field_q.initializeCipher(param2 ^ -26235, AllPlatformsMazeComponent.field_K);
              stackIn_81_0 = MembersUpsellMenu.field_z;
              return stackIn_81_0;
            }
            if (bi.field_a == ProceduralTexture.field_p &&
              cla.g(0)) {
              dea.a(60);
              if (MembersUpsellMenu.field_z == 7 &&
                !PushableBlockMazeComponent.field_L) {
                PushableBlockMazeComponent.field_L = true;
                stackIn_88_0 = -1;
                return stackIn_88_0;
              }
              if (7 == MembersUpsellMenu.field_z) {
                MembersUpsellMenu.field_z = 3;
              }
              io.field_b = WeaveOperator.field_q.readString((byte) -76);
              PushableBlockMazeComponent.field_L = false;
              stackIn_93_0 = MembersUpsellMenu.field_z;
              return stackIn_93_0;
            }
            if (null == OpenGlTransform3D.field_e) {
              if (PushableBlockMazeComponent.field_L) {
                if (rf.b((byte) -121) > 30000L) {
                  io.field_b = SpriteTileOperator.field_u;
                } else {
                  io.field_b = sq.field_x;
                }
                PushableBlockMazeComponent.field_L = false;
                stackIn_102_0 = 3;
                return stackIn_102_0;
              }
              var6_intLifetime2 = nn.field_b;
              nn.field_b = TileRenderable.field_a;
              TileRenderable.field_a = var6_intLifetime2;
              PushableBlockMazeComponent.field_L = true;
            }
            stackIn_104_0 = -1;
            return stackIn_104_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_107_0 = var6_ref;
            stackIn_107_1 = new StringBuilder().append("ila.I(").append(param0).append(',');
            if (param1 == null) {
              stackIn_108_2 = "null";
            } else {
              stackIn_108_2 = "{...}";
            }
            stackIn_110_1 = ((StringBuilder) (Object) stackIn_107_1).append(stackIn_108_2).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_111_2 = "null";
            } else {
              stackIn_111_2 = "{...}";
            }
            throw tba.wrapException((Throwable) ((Object) stackIn_107_0), ((StringBuilder) (Object) stackIn_110_1).append(stackIn_111_2).append(',').append(param5).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(int param0, int param1, char param2) {
        if (param1 != -1) {
          ChatOverlay.a(false);
        }
        if (!this.panelOpen) {
          return false;
        }
        int var4 = 0;
        var4 = dha.a(13, 12, (byte) -107, 15) ? 1 : 0;
        return var4 != 0;
    }

    final void enable(int param0) {
        if (this.enabled) {
          return;
        }
        this.enabled = true;
        this.visibleMessages.clear(8);
        if (param0 != 0) {
          this.lastShownMessage = (gqa) null;
        }
    }

    final static void a(boolean param0) {
        if (!param0) {
          String var2 = (String) null;
          ChatOverlay.a(false, (String) null, 15, -14, (String) null, true);
        }
        PenaltyNotice.a(256);
    }

    final static gqa readChatMessage(int param0, boolean param1) {
        boolean stackIn_3_0 = false;
        int stackIn_9_0 = 0;
        int[] stackIn_21_0 = null;
        Throwable decompiledCaughtException = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        BitPacketBuffer var8 = null;
        QuickChatPhraseDefinition var9 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        var8 = WeaveOperator.field_q;
        var3 = var8.readUnsignedByte(param0 + 19042);
        gja.field_x = 127 & var3;
        stackIn_3_0 = ((128 & var3) != 0);
        sb.field_b = stackIn_3_0;
        GreyscaleOperator.field_m = var8.readUnsignedByte(255);
        ScrollContainer.field_z = var8.readLong(param0 ^ -290628099);
        if (gja.field_x == 2) {
          gb.field_a = var8.readUnsignedShort(127);
          ega.field_b = var8.readUnsignedMedium(-32768);
        } else {
          gb.field_a = 0;
          ega.field_b = 0;
        }
        stackIn_9_0 = (var8.readUnsignedByte(param0 + 19042) != 1) ? 0 : 1;
        var4 = stackIn_9_0;
        esa.field_c = var8.readString((byte) -76);
        if (var4 != 0) {
          TextureSampleOperator.field_q = var8.readString((byte) -76);
        } else {
          TextureSampleOperator.field_q = esa.field_c;
        }
        if (gja.field_x != 1 &&
          gja.field_x != 4) {
          era.field_a = 0;
          dga.field_a = null;
        } else {
          era.field_a = var8.readUnsignedShort(122);
          dga.field_a = var8.readString((byte) -76);
        }
        if (!param1) {
          ConveyorBehaviour.field_p = MessageOverlay.readHuffmanString(var8, 80, -117);
          MatchPhase.field_e = null;
        } else {
          var5 = var8.readUnsignedShort(121);
          try {
            var9 = ByteStorage.field_a.a(false, var5);
            ConveyorBehaviour.field_p = var9.getPreview((byte) -5);
            if (!TextureSampleOperator.field_q.equals(MenuEntry.field_k)) {
              stackIn_21_0 = var9.field_m;
            } else {
              stackIn_21_0 = null;
            }
            MatchPhase.field_e = stackIn_21_0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            ssa.reportClientError("CC1", (byte) 115, (Throwable) ((Object) var6));
            ConveyorBehaviour.field_p = null;
            MatchPhase.field_e = null;
          }
        }
        if (param0 != -18787) {
          ChatOverlay.a(true);
        }
        return new gqa(param1);
    }

    final void addMessageNow(int param0, FloatingMessage param1) {
        try {
          this.addMessage(param0, 0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "ila.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void enableWithPanel(int param0) {
        this.enable(0);
        this.openPanel(false);
        if (param0 >= -57) {
          this.field_b = (IntrusiveDeque) null;
        }
    }

    private final void setEnabled(boolean param0) {
        if (!this.enabled) {
          return;
        }
        this.enabled = param0 ? true : false;
        this.visibleMessages.clear(8);
    }

    final boolean isPanelActive(int param0) {
        gqa discarded$1 = null;
        boolean stackIn_6_0 = false;
        if (param0 != -8832) {
          discarded$1 = this.getNewestChatMessage(-98);
        }
        stackIn_6_0 = (this.panelOpen) && (ni.field_c);
        return stackIn_6_0;
    }

    final void disableWithPanel(int param0) {
        this.setEnabled(false);
        this.closePanel(-59);
        int var2 = -75 / ((31 - param0) / 57);
    }

    final void closePanel(int param0) {
        int var2 = -48 % ((2 - param0) / 41);
        if (!this.panelOpen) {
          return;
        }
        ResourceArchive.e(19470);
        this.panelOpen = false;
    }

    ChatOverlay() {
        this.enabled = false;
        this.panelOpen = false;
        this.visibleMessages = new IntrusiveDeque();
        this.field_b = new IntrusiveDeque();
    }

    static {
    }
}
