/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TurnEffectEvent extends GameEvent {
    static java.awt.Color field_F;
    int effectType;
    private boolean applied;
    static String field_B;
    static String field_y;
    static boolean field_C;
    static String field_A;
    static hc field_z;

    final void applyToBattlefield(Battlefield battlefield, int obfuscationGuard) {
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_87_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (this.applied) {
            return;
          }
          this.applied = true;
          if (obfuscationGuard != -26661) {
            field_B = (String) null;
          }
          regionExit1: {
            regionExit2: {
              regionExit3: {
                regionExit4: {
                  boolean decompiledFrameRemainder1 = true;
                  boolean decompiledFrameRemainder0 = true;
                  var3_int = this.effectType;
                  if ((1 != var3_int ||
                    var4 != 0) &&
                    (decompiledFrameRemainder0 = (var3_int != 2 ||
                    var4 != 0)) &&
                    (decompiledFrameRemainder1 = (var3_int != 3 ||
                    var4 != 0))) {
                    switch (var3_int) {
                      case 4:
                        break regionExit4;
                      case 6:
                        break regionExit3;
                      default:
                        break regionExit1;
                      case 5:
                        if (var4 == 0) {
                          break regionExit2;
                        }
                        break;
                    }
                  }
                  if ((decompiledFrameRemainder1) &&
                    (decompiledFrameRemainder0)) {
                    if (this.unit.maximumStrength <= this.unit.strength) {
                      break regionExit1;
                    }
                    if (this.unit.removedFromActivePlay) {
                      break regionExit1;
                    }
                    this.unit.strength = this.unit.strength + 1;
                    if (!battlefield.field_b) {
                      break regionExit1;
                    }
                    battlefield.field_ob[this.unit.ownerPlayer] = battlefield.field_ob[this.unit.ownerPlayer] + 1;
                    if (var4 == 0) {
                      break regionExit1;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    this.unit.applyStrengthDamage(1, true);
                    if (var4 == 0) {
                      break regionExit1;
                    }
                  }
                  this.unit.applyStrengthDamage(1, true);
                  if (var4 == 0) {
                    break regionExit1;
                  }
                }
                this.unit.maximumStrength = this.unit.maximumStrength + 1;
                this.unit.strength = this.unit.strength + 1;
                if (this.unit.maximumStrength > 99) {
                  this.unit.maximumStrength = 99;
                }
                if (this.unit.strength > this.unit.maximumStrength) {
                  this.unit.strength = this.unit.maximumStrength;
                }
                if (!battlefield.field_b) {
                  break regionExit1;
                }
                battlefield.d(this.unit.ownerPlayer, -bw.unitDefinitions[this.unit.unitType][4] + this.unit.strength, obfuscationGuard ^ -26714, 8);
                if (var4 == 0) {
                  break regionExit1;
                }
              }
              this.unit.strength = this.unit.strength - 1;
              this.unit.maximumStrength = this.unit.maximumStrength - 1;
              if (this.unit.maximumStrength < 1) {
                this.unit.maximumStrength = 1;
              }
              if (this.unit.strength < 0) {
                this.unit.strength = 0;
              }
              this.unit.queueDeathOrRevival(obfuscationGuard + 48992);
              if (!battlefield.field_b) {
                break regionExit1;
              }
              battlefield.d(this.unit.ownerPlayer, this.unit.strength - bw.unitDefinitions[this.unit.unitType][4], 95, 8);
              if (var4 == 0) {
                break regionExit1;
              }
            }
            this.unit.bonusStrength = this.unit.bonusStrength - 1;
            this.unit.queueDeathOrRevival(22331);
          }
          fl.recomputeClientStateChecksum(battlefield, -112);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_86_0 = var3;
          stackIn_86_1 = new StringBuilder().append("st.G(");
          if (battlefield == null) {
            stackIn_87_2 = "null";
          } else {
            stackIn_87_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_86_0), ((StringBuilder) (Object) stackIn_86_1).append(stackIn_87_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final boolean a(NodeDeque param0, byte param1, GameplayController param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -84) {
            field_F = (java.awt.Color) null;
          }
          var4_int = this.a((byte) -39, param2, param0, true) ? 1 : 0;
          this.applyToBattlefield(param2.battlefield, -26661);
          stackIn_4_0 = var4_int;
          return stackIn_4_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("st.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final String describeEvent(byte obfuscationGuard, boolean verbose) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.unit != null) {
            var3 = "EventTurnEffect: pos: (" + this.unit.tileX + "," + this.unit.tileY + "), type: " + this.effectType;
            if (ArmiesOfGielinor.obfuscationControl) {
              var3 = "EventTurnEffect: unit: null, type: " + this.effectType;
            }
          } else {
            var3 = "EventTurnEffect: unit: null, type: " + this.effectType;
          }
          var4 = 109 / ((53 - obfuscationGuard) / 51);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var3_ref), "st.C(" + obfuscationGuard + ',' + verbose + ')');
        }
    }

    public static void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_y = null;
          field_B = null;
          field_A = null;
          if (!param0) {
            field_B = (String) null;
          }
          field_F = null;
          field_z = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var1), "st.E(" + param0 + ')');
        }
    }

    final static void a(int param0, ClientUiComponent param1, ClientUiComponent param2, ClientUiComponent param3, ClientUiComponent param4) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (jl.field_b != null) {
            return;
          }
          if (param0 != 8) {
            TurnEffectEvent.a(-95, (ClientUiComponent) null, (ClientUiComponent) null, (ClientUiComponent) null, (ClientUiComponent) null);
          }
          hf.textChatActive = false;
          if (!NodeIterator.field_a) {
            if (vi.field_d) {
              var5 = TabbedPanel.field_Lb;
              if (var6 != 0) {
                var5 = VerticalScrollbar.field_Tb;
                var5 = dc.field_l;
              }
            } else {
              var5 = VerticalScrollbar.field_Tb;
              if (var6 != 0) {
                var5 = dc.field_l;
              }
            }
          } else {
            var5 = dc.field_l;
          }
          fs.a(MeshObject.field_d, (String) null, var5, 112, 0);
          UpkeepEvent.field_z.matchedButtonTextColour = (8355711 & SpellConfirmationDialog.field_i.matchedButtonTextColour >> 1) - (MeshObject.field_d >> 1 & 8355711) + MeshObject.field_d;
          jl.field_b = UpkeepEvent.field_z;
          UpkeepEvent.field_z.heldPressTextColour = (8355711 & SpellConfirmationDialog.field_i.heldPressTextColour >> 1) + (MeshObject.field_d - ((MeshObject.field_d & 16711422) >> 1));
          UpkeepEvent.field_z.selectedTextColour = -((16711423 & MeshObject.field_d) >> 1) + MeshObject.field_d + ((SpellConfirmationDialog.field_i.selectedTextColour & 16711423) >> 1);
          ArchiveProvider.field_d = DebouncedValidator.field_b;
          UnitCycler.field_g = new ClientUiComponent(0L, param2);
          DateOfBirthValidator.field_i = new ClientUiComponent(0L, param4);
          StrongCacheEntry.field_C = new ClientUiComponent(0L, (ClientUiComponent) null);
          SummonEvent.field_F = new ClientUiComponent(0L, param3);
          UpkeepEvent.field_z = new ClientUiComponent(0L, param1);
          UpkeepEvent.field_z.font = IntrusiveNode.field_e;
          SummonEvent.field_F.addChild(UpkeepEvent.field_z, 102);
          DebouncedValidator.field_b = new ClientUiComponent(0L, ArchiveProvider.field_d);
          SummonEvent.field_F.addChild(DebouncedValidator.field_b, 66);
          qf.field_e = new ClientUiComponent(0L, SpellConfirmationDialog.field_i, nk.field_t);
          ed.field_e = new ClientUiComponent(0L, SpellConfirmationDialog.field_i);
          UnitCycler.field_g.addChild(DateOfBirthValidator.field_i, 103);
          UnitCycler.field_g.addChild(StrongCacheEntry.field_C, 79);
          StrongCacheEntry.field_C.addChild(SummonEvent.field_F, 64);
          StrongCacheEntry.field_C.addChild(qf.field_e, 80);
          StrongCacheEntry.field_C.addChild(ed.field_e, 123);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_19_0 = var5_ref;
          stackIn_19_1 = new StringBuilder().append("st.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param4 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    TurnEffectEvent(Unit param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.eventKind = 19;
          this.effectType = param1;
          this.unit = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("st.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static PalettedBitmapFont a(String param0, ResourceArchive param1, ResourceArchive param2, String param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        PalettedBitmapFont stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 != -2088) {
            TurnEffectEvent.a(false);
          }
          var5_int = param2.getGroupId(param3, param4 ^ -2139);
          var6 = param2.getFileId((byte) 120, var5_int, param0);
          stackIn_4_0 = DualNodeIterator.a(param2, var6, 0, var5_int, param1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("st.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_B = "Passwords must be between 5 and 20 letters and numbers";
        field_F = new java.awt.Color(10040319);
        field_y = "Empty";
        field_A = "Spells to affect the balance of power.";
    }
}
