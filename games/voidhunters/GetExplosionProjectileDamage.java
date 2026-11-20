/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GetExplosionProjectileDamage extends ConsoleCommand {
    static boolean field_o;

    final static SoftwareIndexedSprite2D[] a(int param0, String param1, String param2, ResourceArchive param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        SoftwareIndexedSprite2D[] stackIn_1_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 3 % ((param0 + 36) / 49);
          var5 = param3.getGroupId(param1, -80);
          var6 = param3.getFileId(true, var5, param2);
          stackIn_1_0 = SpecialOrderSubmessageFactory.a(var5, (byte) 104, var6, param3);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("qu.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    GetExplosionProjectileDamage(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -119) {
            GetExplosionProjectileDamage.a((ShipComponent) null, -69);
          }
          stackIn_4_0 = new ConsoleValue(GetLaserFireForce.a(149, 122));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("qu.A(");
          if (arguments == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(ShipComponent param0, int param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        ShipComponent var3 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          var2_int = 0;
          while (4 > var2_int) {
            var3 = new ShipComponent(32);
            var3.attachToHardpoint(1, 1, new ShipComponent(15));
            var3.attachToHardpoint(1, 2, new ShipComponent(15));
            var3.attachToHardpoint(1, 3, new ShipComponent(15));
            var3.attachToHardpoint(1, 4, new ShipComponent(15));
            var3.attachToHardpoint(1, 5, new ShipComponent(15));
            param0.attachToHardpoint(1, var2_int, var3);
            var2_int++;
            if (var4 != 0) {
              return;
            }
          }
          if (param1 >= -12) {
            GetExplosionProjectileDamage.a((Widget) null, -42, (Widget) null, (BitmapFont) null, (Widget) null, (Widget) null, (Widget) null, true, (Widget) null, (Widget) null, (Widget) null, (ScrollBarWidget) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("qu.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(Widget param0, int param1, Widget param2, BitmapFont param3, Widget param4, Widget param5, Widget param6, boolean param7, Widget param8, Widget param9, Widget param10, ScrollBarWidget param11) {
        String stackIn_24_0 = null;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_55_2 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        Sprite var12 = null;
        RuntimeException var12_ref = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        Sprite[] var16 = null;
        Widget var17 = null;
        int var18 = 0;
        String var19 = null;
        int var20 = 0;
        var20 = VoidHunters.field_G;
        try {
          DebrisFactory.field_c = param3;
          ConsoleCommand.field_m[4] = 16711935;
          ConsoleCommand.field_m[3] = 16736511;
          ConsoleCommand.field_m[0] = 16764000;
          ConsoleCommand.field_m[2] = 9474303;
          ConsoleCommand.field_m[1] = 6356832;
          VariableCondition.field_e = param7;
          TargetLock.field_b = param6;
          SetLaserEnergyUsed.field_p[1] = 6356832;
          kmb.field_a = 8421504;
          SetLaserEnergyUsed.field_p[0] = 16764000;
          SetLaserEnergyUsed.field_p[3] = 16736511;
          SetLaserEnergyUsed.field_p[2] = 16736352;
          ConsoleCommand.field_m[4] = 16711935;
          var12 = new Sprite(4, 4);
          var13 = var12.pixels;
          var14 = var12.pixels;
          var12.pixels[15] = 7368816;
          var15 = var12.pixels;
          var15[8] = 7368816;
          var13[2] = 7368816;
          var14[5] = 7368816;
          var16 = new Sprite[9];
          var16[4] = var12;
          SetToggledScoreboard.field_o = new Widget(0L, param2);
          NativeLibraryLoader.field_a = new Widget((long)param1, param10);
          SetToggledScoreboard.field_o.addChild(param1 ^ -561, NativeLibraryLoader.field_a);
          var17 = new Widget(0L, (Widget) null);
          var17.children = new IntrusiveDeque();
          GetUseLines.field_p = new ScrollPaneWidget(0L, var17, param9, param11);
          NativeLibraryLoader.field_a.addChild(-561, GetUseLines.field_p);
          UiValueTrackRenderer.field_b = new Widget(0L, param4);
          NativeLibraryLoader.field_a.addChild(-561, UiValueTrackRenderer.field_b);
          UiComboBoxRenderer.field_c = new Widget(0L, param0);
          UiComboBoxRenderer.field_c.font = DebrisFactory.field_c;
          UiValueTrackRenderer.field_b.addChild(-561, UiComboBoxRenderer.field_c);
          UiValueTrackRenderer.field_b.inheritInteractionStateInDescendants(119);
          WidgetNode.field_l = new Widget(0L, (Widget) null);
          WidgetNode.field_l.field_gb = var16;
          UiValueTrackRenderer.field_b.addChild(-561, WidgetNode.field_l);
          ul.field_b = new Widget[5];
          NebulaFieldFactory.field_c = new Widget[5];
          SetMissionVariablesHudX.field_o = new Widget[5];
          SecondaryNodeDeque.field_c = new Widget[5];
          var18 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var18 >= 5))) {
            stackIn_28_0 = var18;
            if (var20 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_28_0 != 0) {
                if (var18 != 1 ||
                  !VariableCondition.field_e) {
                  decompiledFrameRemainder0 = (var18 == 2);
                  if (decompiledFrameRemainder0) {
                    var19 = GetAiRepairTime.field_o;
                  }
                } else {
                  var19 = bd.field_a;
                }
              } else {
                if (VariableCondition.field_e) {
                  stackIn_24_0 = UnsupportedGpuMaterialEffect.field_e;
                } else {
                  stackIn_24_0 = SetTabForScores.field_o;
                }
                var19 = stackIn_24_0;
              }
              if (decompiledFrameRemainder0) {
                ul.field_b[var18] = new Widget(0L, param8);
                SetMissionVariablesHudX.field_o[var18] = new Widget(0L, TargetLock.field_b, var19);
                SecondaryNodeDeque.field_c[var18] = new Widget(0L, (Widget) null);
                SecondaryNodeDeque.field_c[var18].field_B = 1;
                NebulaFieldFactory.field_c[var18] = new Widget(0L, TargetLock.field_b);
                NebulaFieldFactory.field_c[var18].field_B = 1;
                ul.field_b[var18].addChild(-561, SetMissionVariablesHudX.field_o[var18]);
                ul.field_b[var18].addChild(-561, SecondaryNodeDeque.field_c[var18]);
                ul.field_b[var18].addChild(-561, NebulaFieldFactory.field_c[var18]);
                ul.field_b[var18].inheritInteractionStateInDescendants(112);
                SetToggledScoreboard.field_o.addChild(param1 ^ -561, ul.field_b[var18]);
                SetSniperCannonRandomness.field_o = SetSniperCannonRandomness.field_o + 1;
              }
              var18++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            SetBombletSprayAimarc.field_o = new Widget(0L, param5);
            SetBombletSprayAimarc.field_o.text = SetShieldsDirectionalArcParticleSpeedDownshift.field_r;
            SetToggledScoreboard.field_o.addChild(-561, SetBombletSprayAimarc.field_o);
            stackIn_28_0 = SocketNetworkArchiveClient.g(-126) ? 1 : 0;
          }
          if (stackIn_28_0 != 0 &&
            !GetBloomThresholdPercentage.field_p) {
            return;
          }
          PartitionZoneListFactory.field_b = new pia(0, 0, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12_ref = decompiledCaughtException;
          stackIn_38_0 = var12_ref;
          stackIn_38_1 = new StringBuilder().append("qu.B(");
          if (param0 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_46_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (param3 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          stackIn_50_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',');
          if (param4 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          stackIn_54_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',');
          if (param5 == null) {
            stackIn_55_2 = "null";
          } else {
            stackIn_55_2 = "{...}";
          }
          stackIn_58_1 = ((StringBuilder) (Object) stackIn_54_1).append(stackIn_55_2).append(',');
          if (param6 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          stackIn_66_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',');
          if (param9 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',');
          if (param10 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (param11 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(')').toString());
        }
    }

    static {
        MatchResultsFactory discarded$0 = new MatchResultsFactory();
    }
}
