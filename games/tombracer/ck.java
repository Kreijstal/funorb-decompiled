/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    static byte[][] field_c;
    static String field_b;
    static ResourceArchive field_a;

    final static boolean containsCentredBox(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7, int param8) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        try {
          if (param6 <= 65) {
            ck.a(-121, (String[][]) null, -66, (Sprite[][]) null, (String[]) null, (String[]) null, (byte[]) null, (String[]) null, (String[][]) null, -31, (ResourceArchive) null, 29, (byte[]) null, (Sprite[][]) null, (int[]) null);
          }
          if ((-(param8 / 2) + param0) >= (-(param3 / 2) + param2) &&
            param0 + (param8 + 1) / 2 <= (param3 + 1) / 2 + param2 &&
            (-(param4 / 2) + param7) <= (-(param1 / 2) + param5) &&
            param5 + (param1 + 1) / 2 <= (param4 + 1) / 2 + param7) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw tba.wrapException((Throwable) ((Object) var9), "ck.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void a(int param0, String[][] param1, int param2, Sprite[][] param3, String[] param4, String[] param5, byte[] param6, String[] param7, String[][] param8, int param9, ResourceArchive param10, int param11, byte[] param12, Sprite[][] param13, int[] param14) {
        tv[] array$0 = null;
        tv[] array$1 = null;
        tv[] array$2 = null;
        UiComponent stackIn_8_0;
        UiComponent stackIn_8_1;
        long stackIn_8_2;
        UiComponent stackIn_8_3;
        UiComponent stackIn_9_0 = null;
        UiComponent stackIn_9_1 = null;
        String stackIn_9_4 = null;
        Sprite stackIn_61_0 = null;
        String stackIn_68_0 = null;
        int stackIn_71_0 = 0;
        Object stackIn_78_0 = null;
        tv stackIn_86_0 = null;
        Object stackIn_98_0 = null;
        RuntimeException stackIn_135_0 = null;
        StringBuilder stackIn_135_1 = null;
        String stackIn_136_2 = null;
        StringBuilder stackIn_139_1 = null;
        String stackIn_140_2 = null;
        StringBuilder stackIn_143_1 = null;
        String stackIn_144_2 = null;
        StringBuilder stackIn_147_1 = null;
        String stackIn_148_2 = null;
        StringBuilder stackIn_151_1 = null;
        String stackIn_152_2 = null;
        StringBuilder stackIn_155_1 = null;
        String stackIn_156_2 = null;
        StringBuilder stackIn_159_1 = null;
        String stackIn_160_2 = null;
        StringBuilder stackIn_163_1 = null;
        String stackIn_164_2 = null;
        StringBuilder stackIn_167_1 = null;
        String stackIn_168_2 = null;
        StringBuilder stackIn_171_1 = null;
        String stackIn_172_2 = null;
        StringBuilder stackIn_175_1 = null;
        String stackIn_176_2 = null;
        RuntimeException decompiledCaughtException = null;
        tv stackOut_85_0;
        UiComponent var15 = null;
        RuntimeException var15_ref = null;
        UiComponent var16 = null;
        int var17_int = 0;
        Object var17 = null;
        int var18 = 0;
        Sprite var19_ref_iu = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        Object stackIn_78_0Lifetime1;
        Object stackIn_98_0Lifetime1;
        int var18Lifetime1;
        int var18Lifetime2;
        var21 = TombRacer.field_G ? 1 : 0;
        try {
          DoorwayComponent.field_L = param7;
          eda.field_e = param9;
          pda.field_d = param3;
          SnakePitModel.field_n = param12;
          aca.field_i = param6;
          MirrorMoverLocomotor.field_r = param2;
          DebouncedValidationSource.field_e = param4;
          no.field_o = param8;
          eca.field_b = param1;
          efa.field_w = param13;
          SafeZoneBehaviour.field_u = param14;
          RasterizerOperator.field_m = param5;
          SoundEventPlayer.field_f = BoulderComponent.loadSpritesByName(param10, "lobby", 5, "gameprivacy");
          wt.field_c = BoulderComponent.loadSpritesByName(param10, "lobby", 5, "ratedgame");
          InvisibleTouchSwitchComponent.field_K = BoulderComponent.loadSpritesByName(param10, "lobby", 5, "opentome");
          TileGridCell.field_k = BoulderComponent.loadSpritesByName(param10, "lobby", 5, "allowspectators");
          SocketArchiveNetworkClient.field_w = new String[5];
          SocketArchiveNetworkClient.field_w[0] = HardwareOpenGlToolkit.field_cd;
          SocketArchiveNetworkClient.field_w[2] = EmbossOperator.field_q;
          SocketArchiveNetworkClient.field_w[3] = ObjectPool.field_d;
          SocketArchiveNetworkClient.field_w[4] = PacketBuffer.field_f;
          SocketArchiveNetworkClient.field_w[1] = RasterBuffer.field_b;
          RasterShape.field_e = new UiComponent(0L, (UiComponent) null);
          LightSource.field_h = new UiComponent(0L, ooa.field_f, CanvasImageBuffer.field_i);
          ShaderEffect.field_b = new UiComponent(0L, SecondaryNodeDeque.field_b, MessageOverlay.field_m);
          bsa.field_j = new ScrollPane(0L, new UiComponent(0L, (UiComponent) null), rfa.field_C, DateFieldsWidget.field_F);
          RasterShape.field_e.addChild(-126, LightSource.field_h);
          if (UnlockOverlay.field_p) {
            RasterShape.field_e.addChild(param11 - 25575, ShaderEffect.field_b);
          }
          RasterShape.field_e.addChild(-127, bsa.field_j);
          bsa.field_j.field_vb.applyStyle(false, Corpse.field_i);
          var15 = bsa.field_j.field_vb;
          bsa.field_j.field_vb.field_bb = 1;
          var15.field_z = 1;
          PerlinNoise2D.field_t = new UiComponent(0L, Corpse.field_i);
          PerlinNoise2D.field_t.field_z = 1;
          ImageProducerRasterBuffer.field_j = new UiComponent(0L, ssa.field_g, S2CActionPacket.field_g.toUpperCase());
          C2SChooseCharacterPacket.field_a = new UiComponent(0L, CharacterSelectPhase.field_s, tha.field_B.toUpperCase());
          Obstacle.field_s = new UiComponent(0L, CommonChooseReward.field_c);
          gta.field_b = new UiComponent(0L, ooa.field_f, SnakePitModel.field_m);
          RandomBrickOperator.field_r = new UiComponent(0L, cs.field_a, TestModel.field_r);
          RotateLocomotor.field_o = new UiComponent(0L, cs.field_a, du.field_a);
          MidiPcmStream.field_K = new UiComponent(0L, cs.field_a, qo.field_i);
          MirrorComponent.field_I = new UiComponent(0L, cs.field_a, MatchState.field_N);
          cq.field_e = new UiComponent(0L, SecondaryNodeDeque.field_b, PathMoverComponent.field_G);
          nsa.field_i = new ScrollPane(0L, new UiComponent(0L, (UiComponent) null), rfa.field_C, DateFieldsWidget.field_F);
          TileRenderable.field_c = new UiComponent(0L, hg.field_g, iw.field_b.toUpperCase());
          TileRenderable.field_c.field_X = UnlockOverlay.field_p;
          stackIn_8_0 = null;
          stackIn_8_1 = null;
          stackIn_8_2 = 0L;
          stackIn_8_3 = hg.field_g;
          if (UnlockOverlay.field_p) {
            stackIn_9_0 = null;
            stackIn_9_1 = null;
            stackIn_9_4 = SwitchState.field_h;
          } else {
            stackIn_9_0 = null;
            stackIn_9_1 = null;
            stackIn_9_4 = ModelAnimator.field_c;
          }
          CharacterChoiceFactory.field_c = new UiComponent(stackIn_8_2, stackIn_8_3, ((String) (Object) stackIn_9_4).toUpperCase());
          OpenGlToolkit.field_fd = new UiComponent(0L, (UiComponent) null);
          OpenGlToolkit.field_fd.addChild(-126, C2SChooseCharacterPacket.field_a);
          OpenGlToolkit.field_fd.addChild(param11 ^ -25371, Obstacle.field_s);
          Obstacle.field_s.addChild(-124, gta.field_b);
          Obstacle.field_s.addChild(-126, RandomBrickOperator.field_r);
          Obstacle.field_s.addChild(-127, RotateLocomotor.field_o);
          if (UnlockOverlay.field_p) {
            Obstacle.field_s.addChild(-128, MidiPcmStream.field_K);
          }
          Obstacle.field_s.addChild(-123, MirrorComponent.field_I);
          Obstacle.field_s.addChild(-128, cq.field_e);
          Obstacle.field_s.addChild(-122, nsa.field_i);
          if (UnlockOverlay.field_p) {
            OpenGlToolkit.field_fd.addChild(-124, TileRenderable.field_c);
          }
          OpenGlToolkit.field_fd.addChild(-124, CharacterChoiceFactory.field_c);
          rv.field_c = new UiComponent(0L, Corpse.field_i);
          rv.field_c.field_bb = 0;
          rv.field_c.field_z = 1;
          BrickOperator.field_v = new UiComponent(0L, OpenGlEnvironmentWaterEffect.field_i, nf.field_j.toUpperCase());
          VboVertexArray.field_k = new UiComponent(0L, WallModel.field_r);
          VboVertexArray.field_k.addChild(param11 - 25572, rv.field_c);
          VboVertexArray.field_k.addChild(-122, BrickOperator.field_v);
          HazardModel.field_t = new UiComponent(0L, rfa.field_C);
          HazardModel.field_t.applyStyle(false, Corpse.field_i);
          HazardModel.field_t.field_bb = 1;
          var16 = HazardModel.field_t;
          var16.field_z = 1;
          RoomRegion.field_l = new UiComponent(0L, (UiComponent) null);
          cea.field_a = new UiComponent(0L, Corpse.field_i);
          cea.field_a.field_z = 1;
          uaa.field_b = new UiComponent(0L, ooa.field_f, CanvasImageBuffer.field_i);
          RopeBridgeComponent.field_F = new UiComponent(0L, SecondaryNodeDeque.field_b, MessageOverlay.field_m);
          tn.field_n = new ScrollPane(0L, new UiComponent(0L, (UiComponent) null), rfa.field_C, DateFieldsWidget.field_F);
          RoomRegion.field_l.addChild(param11 ^ -25371, cea.field_a);
          RoomRegion.field_l.addChild(-124, uaa.field_b);
          if (UnlockOverlay.field_p) {
            RoomRegion.field_l.addChild(-122, RopeBridgeComponent.field_F);
          }
          RoomRegion.field_l.addChild(-124, tn.field_n);
          bc.field_b = new UiComponent(0L, ssa.field_g, OpenGlSprite.field_k.toUpperCase());
          StatusEffect.field_g = new UiComponent(0L, CharacterSelectPhase.field_s);
          C2SSubmitSettingsPacket.field_g = new UiComponent(0L, CommonChooseReward.field_c);
          qna.field_b = new UiComponent(0L, KeyLockBehaviour.field_r, DoorwayComponent.field_G.toUpperCase());
          SimpleConditionBehaviour.field_p = new UiComponent[param0 + 4];
          bf.field_b = new tv[4 + param0][];
          SimpleConditionBehaviour.field_p[0] = new UiComponent(0L, una.field_j, RoomViewRenderer.field_a);
          bf.field_b[0] = new tv[6];
          var17_int = 0;
          scanLoop1: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var17_int < 5) {
              bf.field_b[0][1 + var17_int] = new tv(0L, qja.field_j, (UiComponent) null, PressureSwitchBehaviour.field_p, SoundEventPlayer.field_f[var17_int], SocketArchiveNetworkClient.field_w[var17_int]);
              var17_int++;
              if (var21 == 0) {
                continue;
              }
            } else {
              decompiledFrameRemainder0 = !(2 > SafeZoneBehaviour.field_u.length);
              if (decompiledFrameRemainder0) {
                SimpleConditionBehaviour.field_p[1] = new UiComponent(0L, una.field_j, ConsoleToken.field_j);
                array$0 = new tv[1 + SafeZoneBehaviour.field_u.length];
                bf.field_b[1] = array$0;
                bf.field_b[1][0] = new tv(0L, qja.field_j, (UiComponent) null, PressureSwitchBehaviour.field_p, (Sprite) null, aa.field_b);
              }
            }
            if (decompiledFrameRemainder0) {
              var17_int = 0;
              while (!(var17_int >= SafeZoneBehaviour.field_u.length)) {
                bf.field_b[1][1 + var17_int] = new tv(0L, qja.field_j, (UiComponent) null, PressureSwitchBehaviour.field_p, (Sprite) null, Integer.toString(SafeZoneBehaviour.field_u[var17_int]));
                var17_int++;
                if (var21 != 0) {
                  break scanLoop1;
                }
              }
            }
            SimpleConditionBehaviour.field_p[2] = new UiComponent(0L, una.field_j, nb.field_a);
            bf.field_b[2] = new tv[]{new tv(0L, qja.field_j, (UiComponent) null, PressureSwitchBehaviour.field_p, (Sprite) null, aa.field_b), new tv(0L, qja.field_j, (UiComponent) null, PressureSwitchBehaviour.field_p, TileGridCell.field_k[0], WaveformOperator.field_s), new tv(0L, qja.field_j, (UiComponent) null, PressureSwitchBehaviour.field_p, TileGridCell.field_k[1], LegacyOpenGlEnvironmentWaterEffect.field_g)};
            break;
          }
          boolean decompiledFrameCompleted0 = true;
          if (MirrorMoverLocomotor.field_r > 1) {
            SimpleConditionBehaviour.field_p[3] = new UiComponent(0L, una.field_j, k.field_z);
            array$1 = new tv[1 + MirrorMoverLocomotor.field_r];
            bf.field_b[3] = array$1;
            bf.field_b[3][0] = new tv(0L, qja.field_j, (UiComponent) null, PressureSwitchBehaviour.field_p, (Sprite) null, aa.field_b);
            var17_int = 0;
            while (!(MirrorMoverLocomotor.field_r <= var17_int)) {
              bf.field_b[3][1 + var17_int] = new tv(0L, qja.field_j, (UiComponent) null, PressureSwitchBehaviour.field_p, (Sprite) null, RasterizerOperator.field_m[var17_int]);
              var17_int++;
              if (var21 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            var17_int = 0;
          }
          scanLoop2: while (true) {
            if (var17_int < param0) {
              SimpleConditionBehaviour.field_p[var17_int + 4] = new UiComponent(0L, una.field_j, DebouncedValidationSource.field_e[var17_int]);
              array$2 = new tv[1 + SnakePitBehaviour.bitwiseAnd((int) SnakePitModel.field_n[var17_int], 255)];
              bf.field_b[4 + var17_int] = array$2;
              bf.field_b[var17_int + 4][0] = new tv(0L, qja.field_j, (UiComponent) null, PressureSwitchBehaviour.field_p, (Sprite) null, aa.field_b);
              stackIn_71_0 = 0;
              if (var21 == 0) {
                var18 = stackIn_71_0;
                while (var18 < (SnakePitModel.field_n[var17_int] & 255)) {
                  stackIn_78_0 = null;
                  if (stackIn_78_0 == efa.field_w) {
                    stackIn_61_0 = null;
                  } else {
                    if (null == efa.field_w[var17_int]) {
                      stackIn_61_0 = null;
                    } else {
                      stackIn_61_0 = efa.field_w[var17_int][var18];
                    }
                  }
                  var19_ref_iu = stackIn_61_0;
                  if (null != no.field_o) {
                    if (no.field_o[var17_int] != null) {
                      stackIn_68_0 = no.field_o[var17_int][var18];
                    } else {
                      stackIn_68_0 = null;
                    }
                  } else {
                    stackIn_68_0 = null;
                  }
                  var20 = stackIn_68_0;
                  bf.field_b[var17_int + 4][var18 + 1] = new tv(0L, qja.field_j, (UiComponent) null, PressureSwitchBehaviour.field_p, var19_ref_iu, var20);
                  var18++;
                }
                var17_int++;
                continue;
              }
            } else {
              stackIn_71_0 = param11;
            }
            if (stackIn_71_0 != 25447) {
              return;
            }
            var17_int = 0;
            while (var17_int < (param0 + 4)) {
              if (var21 != 0) {
                break scanLoop2;
              }
              stackIn_78_0Lifetime1 = null;
              if (stackIn_78_0Lifetime1 != SimpleConditionBehaviour.field_p[var17_int]) {
                SimpleConditionBehaviour.field_p[var17_int].field_P = 11;
              }
              if (null != bf.field_b[var17_int]) {
                var18Lifetime2 = 0;
                while (!(bf.field_b[var17_int].length <= var18Lifetime2)) {
                  stackOut_85_0 = bf.field_b[var17_int][var18Lifetime2];
                  stackIn_98_0 = stackOut_85_0;
                  stackIn_86_0 = stackOut_85_0;
                  if (stackIn_86_0 != null &&
                    bf.field_b[var17_int][var18Lifetime2].field_vb != null) {
                    bf.field_b[var17_int][var18Lifetime2].field_vb.field_P = 11;
                  }
                  var18Lifetime2++;
                }
              }
              var17_int++;
            }
            pk.field_z = new UiComponent(0L, hg.field_g);
            hw.field_a = new UiComponent(0L, hg.field_g);
            MessageOverlay.field_t = new UiComponent(0L, tka.field_q);
            MessageOverlay.field_t.applyStyle(false, Corpse.field_i);
            MessageOverlay.field_t.field_bb = 1;
            break;
          }
          stackIn_98_0Lifetime1 = MessageOverlay.field_t;
          var17 = stackIn_98_0Lifetime1;
          ((UiComponent) (var17)).field_z = 1;
          dka.field_b = new UiComponent(0L, (UiComponent) null);
          dka.field_b.addChild(param11 ^ -25373, StatusEffect.field_g);
          dka.field_b.addChild(-128, C2SSubmitSettingsPacket.field_g);
          C2SSubmitSettingsPacket.field_g.addChild(-122, qna.field_b);
          var18Lifetime1 = 0;
          while (var18Lifetime1 < 4 + param0) {
            if (var21 != 0) {
              return;
            }
            if ((var18Lifetime1 != 1 ||
              !(SafeZoneBehaviour.field_u.length < 2) ||
              var21 != 0) && (var18Lifetime1 != 3 ||
              !(MirrorMoverLocomotor.field_r <= 1) ||
              var21 != 0)) {
              C2SSubmitSettingsPacket.field_g.addChild(-123, SimpleConditionBehaviour.field_p[var18Lifetime1]);
              var19 = 0;
              while (!(var19 >= bf.field_b[var18Lifetime1].length)) {
                if (null != bf.field_b[var18Lifetime1][var19]) {
                  C2SSubmitSettingsPacket.field_g.addChild(-124, bf.field_b[var18Lifetime1][var19]);
                }
                var19++;
              }
            }
            var18Lifetime1++;
          }
          dka.field_b.addChild(-128, pk.field_z);
          dka.field_b.addChild(-125, hw.field_a);
          dka.field_b.addChild(-123, MessageOverlay.field_t);
          S2CEventPacket.field_e = new UiComponent(0L, OpenGlTransform3D.field_f, eu.field_b.toUpperCase());
          Trap.field_q = new UiComponent(0L, OpenGlEnvironmentWaterEffect.field_i, ej.field_b.toUpperCase());
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15_ref = decompiledCaughtException;
          stackIn_135_0 = var15_ref;
          stackIn_135_1 = new StringBuilder().append("ck.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_136_2 = "null";
          } else {
            stackIn_136_2 = "{...}";
          }
          stackIn_139_1 = ((StringBuilder) (Object) stackIn_135_1).append(stackIn_136_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_140_2 = "null";
          } else {
            stackIn_140_2 = "{...}";
          }
          stackIn_143_1 = ((StringBuilder) (Object) stackIn_139_1).append(stackIn_140_2).append(',');
          if (param4 == null) {
            stackIn_144_2 = "null";
          } else {
            stackIn_144_2 = "{...}";
          }
          stackIn_147_1 = ((StringBuilder) (Object) stackIn_143_1).append(stackIn_144_2).append(',');
          if (param5 == null) {
            stackIn_148_2 = "null";
          } else {
            stackIn_148_2 = "{...}";
          }
          stackIn_151_1 = ((StringBuilder) (Object) stackIn_147_1).append(stackIn_148_2).append(',');
          if (param6 == null) {
            stackIn_152_2 = "null";
          } else {
            stackIn_152_2 = "{...}";
          }
          stackIn_155_1 = ((StringBuilder) (Object) stackIn_151_1).append(stackIn_152_2).append(',');
          if (param7 == null) {
            stackIn_156_2 = "null";
          } else {
            stackIn_156_2 = "{...}";
          }
          stackIn_159_1 = ((StringBuilder) (Object) stackIn_155_1).append(stackIn_156_2).append(',');
          if (param8 == null) {
            stackIn_160_2 = "null";
          } else {
            stackIn_160_2 = "{...}";
          }
          stackIn_163_1 = ((StringBuilder) (Object) stackIn_159_1).append(stackIn_160_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_164_2 = "null";
          } else {
            stackIn_164_2 = "{...}";
          }
          stackIn_167_1 = ((StringBuilder) (Object) stackIn_163_1).append(stackIn_164_2).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_168_2 = "null";
          } else {
            stackIn_168_2 = "{...}";
          }
          stackIn_171_1 = ((StringBuilder) (Object) stackIn_167_1).append(stackIn_168_2).append(',');
          if (param13 == null) {
            stackIn_172_2 = "null";
          } else {
            stackIn_172_2 = "{...}";
          }
          stackIn_175_1 = ((StringBuilder) (Object) stackIn_171_1).append(stackIn_172_2).append(',');
          if (param14 == null) {
            stackIn_176_2 = "null";
          } else {
            stackIn_176_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_135_0), ((StringBuilder) (Object) stackIn_175_1).append(stackIn_176_2).append(')').toString());
        }
    }

    final static void sortMeshFaces(int param0, boolean param1, TriangleMesh param2, int param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_22_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_62_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_33_0Lifetime1;
        int stackIn_33_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          var5_int = CauldronComponent.bitLength((byte) 93, 3 * (param4 - param0));
          var6 = 3 * param0;
          var7 = -10 + var5_int;
          td.clearFaceDepthBuckets((byte) -62);
          if (param2.field_K > 0 &&
            param2.field_q != null) {
            ssa.clearMeshDepthBucketCounts(0);
          }
          CharacterChoiceFactory.field_f = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var8 < param2.field_u)))) {
            var9 = param2.field_B[var8];
            var10 = param2.field_w[var8];
            var11 = param2.field_f[var8];
            stackOut_9_0 = param1;
            stackIn_42_0 = stackOut_9_0 ? 1 : 0;
            stackIn_10_0 = stackOut_9_0;
            if (var19 == 0) {
              if (stackIn_10_0) {
                var12 = MatchStatistics.field_f[var9];
                var13 = TimingPattern.field_e[var9];
                var14 = MatchStatistics.field_f[var10] - var12;
                var15 = MatchStatistics.field_f[var11] - var12;
                var16 = TimingPattern.field_e[var10] - var13;
                var17 = TimingPattern.field_e[var11] - var13;
              }
              if (!stackIn_10_0 ||
                var17 * var14 - var15 * var16 < 0) {
                var12Lifetime1 = wp.field_c[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = wp.field_c[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = wp.field_c[var11];
                    if (var14 != -2147483648) {
                      var15 = var14 + (var13Lifetime1 + var12Lifetime1 - var6);
                      if (var7 >= 0) {
                        stackIn_22_0 = var15 >> var7;
                      } else {
                        stackIn_22_0 = var15 << -var7;
                      }
                      var16 = -stackIn_22_0 + PooledObject.field_g.length - 1;
                      var17 = PooledObject.field_g[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_33_0 = -1;
                          stackIn_33_1 = ~var16;
                          if (stackIn_33_0 < stackIn_33_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = PooledObject.field_g[var16];
                          continue;
                        }
                        stackIn_33_0Lifetime1 = var16 << 4;
                        stackIn_33_1Lifetime1 = var17;
                        var18 = stackIn_33_0Lifetime1 + stackIn_33_1Lifetime1;
                        PitSnake.field_t[var18] = var8;
                        PooledObject.field_g[var16] = 1 + var17;
                        if (param2.field_K > 0 &&
                          null != param2.field_q) {
                          dupTemp$0 = param2.field_q[var8];
                          DrawOfferMenu.field_q[dupTemp$0] = DrawOfferMenu.field_q[dupTemp$0] + 1;
                        }
                        CharacterChoiceFactory.field_f = CharacterChoiceFactory.field_f + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_42_0 = -1;
          }
          if (stackIn_42_0 > ~param2.field_K &&
            null != param2.field_q) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(var9Lifetime1 >= DrawOfferMenu.field_q.length)) {
              var10Lifetime1 = DrawOfferMenu.field_q[var9Lifetime1];
              DrawOfferMenu.field_q[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          if (param3 != -8234) {
            ck.containsCentredBox(-21, -102, 54, 120, -98, -42, (byte) -6, -39, 90);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_61_0 = var5;
          stackIn_61_1 = new StringBuilder().append("ck.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_62_2 = "null";
          } else {
            stackIn_62_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_61_0), ((StringBuilder) (Object) stackIn_61_1).append(stackIn_62_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_b = null;
          field_a = null;
          if (param0) {
            field_c = (byte[][]) null;
          }
          field_c = (byte[][]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.wrapException((Throwable) ((Object) var1), "ck.C(" + param0 + ')');
        }
    }

    static {
        field_b = "Please log in as a subscribing member to access this feature.";
    }
}
