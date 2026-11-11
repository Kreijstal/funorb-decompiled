/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NameEntryPopup extends UiComponent {
    private UiComponent field_tb;
    private StringBuilder field_vb;
    private int field_ub;
    private UiComponent field_zb;
    static ValidationOutcome field_wb;
    static LruNodeCache field_xb;
    static float field_Ab;
    static UiComponent field_yb;

    public static void releaseStatics(int param0) {
        if (param0 == 2) {
          field_xb = null;
          field_wb = null;
          field_yb = null;
          return;
        }
        field_wb = (ValidationOutcome) null;
        field_xb = null;
        field_wb = null;
        field_yb = null;
    }

    final boolean a(boolean param0) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var2;
        int var2Lifetime1;
        if (this.field_ub != 0) {
          return false;
        }
        if (MenuEntry.field_h != 85) {
          if (this.field_vb.length() < 12) {
            var2 = Character.toLowerCase(HardwareOpenGlToolkit.field_td);
            if (var2 == 32) {
              var2 = 95;
            }
            if (95 == var2 &&
              this.field_vb.length() > 0) {
              discarded$3 = this.field_vb.append((char) var2);
            }
            if (PressureSwitchBehaviour.isAsciiLetter((byte) -17, (char) var2)) {
              discarded$4 = this.field_vb.append((char) var2);
              if (MenuEntry.field_h == 84) {
                if (this.field_vb.length() <= 0) {
                  this.field_ub = 1;
                } else {
                  this.field_r = this.field_vb.toString();
                  this.field_ub = 2;
                }
              }
              if (MenuEntry.field_h == 13) {
                this.field_ub = 1;
              }
              if (!param0) {
                return true;
              }
              field_Ab = -0.0745474174618721f;
              return true;
            }
            if (OpenGlEnvironmentWaterEffect.isAsciiDigit(125, (char) var2)) {
              discarded$5 = this.field_vb.append((char) var2);
              if (MenuEntry.field_h == 84) {
                if (this.field_vb.length() <= 0) {
                  this.field_ub = 1;
                } else {
                  this.field_r = this.field_vb.toString();
                  this.field_ub = 2;
                }
              }
              if (MenuEntry.field_h == 13) {
                this.field_ub = 1;
              }
              if (param0) {
                field_Ab = -0.0745474174618721f;
              }
              return true;
            }
          }
          if (MenuEntry.field_h == 84) {
            if (this.field_vb.length() <= 0) {
              this.field_ub = 1;
            } else {
              this.field_r = this.field_vb.toString();
              this.field_ub = 2;
            }
          }
          if (MenuEntry.field_h == 13) {
            this.field_ub = 1;
          }
          if (param0) {
            field_Ab = -0.0745474174618721f;
          }
          return true;
        }
        if (0 < this.field_vb.length()) {
          DarknessBehaviour.padTo(-1 + this.field_vb.length(), ' ', -11, this.field_vb);
        }
        if (this.field_vb.length() >= 12) {
          if (MenuEntry.field_h == 84) {
            if (this.field_vb.length() <= 0) {
              this.field_ub = 1;
            } else {
              this.field_r = this.field_vb.toString();
              this.field_ub = 2;
            }
          }
          if (MenuEntry.field_h == 13) {
            this.field_ub = 1;
          }
          if (param0) {
            field_Ab = -0.0745474174618721f;
          }
          return true;
        }
        var2Lifetime1 = Character.toLowerCase(HardwareOpenGlToolkit.field_td);
        if (var2Lifetime1 == 32) {
          var2Lifetime1 = 95;
        }
        if (95 == var2Lifetime1 &&
          this.field_vb.length() > 0) {
          discarded$0 = this.field_vb.append((char) var2Lifetime1);
        }
        if (PressureSwitchBehaviour.isAsciiLetter((byte) -17, (char) var2Lifetime1)) {
          discarded$1 = this.field_vb.append((char) var2Lifetime1);
          if (MenuEntry.field_h == 84) {
            if (this.field_vb.length() <= 0) {
              this.field_ub = 1;
            } else {
              this.field_r = this.field_vb.toString();
              this.field_ub = 2;
            }
          }
          if (MenuEntry.field_h == 13) {
            this.field_ub = 1;
          }
          if (!param0) {
            return true;
          }
          field_Ab = -0.0745474174618721f;
          return true;
        }
        if (!OpenGlEnvironmentWaterEffect.isAsciiDigit(125, (char) var2Lifetime1)) {
          if (MenuEntry.field_h == 84) {
            if (this.field_vb.length() <= 0) {
              this.field_ub = 1;
            } else {
              this.field_r = this.field_vb.toString();
              this.field_ub = 2;
            }
          }
          if (MenuEntry.field_h == 13) {
            this.field_ub = 1;
          }
          if (!param0) {
            return true;
          }
          field_Ab = -0.0745474174618721f;
          return true;
        }
        discarded$2 = this.field_vb.append((char) var2Lifetime1);
        if (MenuEntry.field_h == 84) {
          if (this.field_vb.length() <= 0) {
            this.field_ub = 1;
            if (MenuEntry.field_h == 13) {
              this.field_ub = 1;
            }
            if (param0) {
              field_Ab = -0.0745474174618721f;
            }
            return true;
          }
          this.field_r = this.field_vb.toString();
          this.field_ub = 2;
        }
        if (MenuEntry.field_h == 13) {
          this.field_ub = 1;
        }
        if (!param0) {
          return true;
        }
        field_Ab = -0.0745474174618721f;
        return true;
    }

    final int a(boolean param0, int param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var4;
        var4 = TombRacer.field_G ? 1 : 0;
        if (param1 != 1513) {
          field_wb = (ValidationOutcome) null;
        }
        this.layoutFullScreen(-57, param0);
        if (!param0) {
          this.field_tb.field_r = this.field_vb.toString();
          if (param0 &&
            PlayerModel.field_b != 0 &&
            0 == this.field_y) {
            this.field_ub = 1;
          }
          return this.field_ub;
        }
        while (true) {
          if (!NanoTickClock.pollKeyEvent(true)) {
            this.field_tb.field_r = this.field_vb.toString();
            if (!param0) {
              return this.field_ub;
            }
            if (PlayerModel.field_b == 0) {
              return this.field_ub;
            }
            if (0 != this.field_y) {
              return this.field_ub;
            }
            this.field_ub = 1;
            return this.field_ub;
          }
          if (MenuEntry.field_h == 85 &&
            this.field_vb.length() > 0) {
            DarknessBehaviour.padTo(-1 + this.field_vb.length(), ' ', -11, this.field_vb);
          }
          if (LaserShooterComponent.canAppendNameChar((CharSequence) ((Object) this.field_vb), true, HardwareOpenGlToolkit.field_td)) {
            discarded$0 = this.field_vb.append(HardwareOpenGlToolkit.field_td);
          } else {
            if (this.field_vb.length() == 0 &&
              91 == HardwareOpenGlToolkit.field_td) {
              discarded$1 = this.field_vb.append(HardwareOpenGlToolkit.field_td);
            } else {
              if (1 == this.field_vb.length() &&
                HardwareOpenGlToolkit.field_td == 35) {
                discarded$2 = this.field_vb.append(HardwareOpenGlToolkit.field_td);
              } else {
                if (HardwareOpenGlToolkit.field_td == 93) {
                  discarded$3 = this.field_vb.append(HardwareOpenGlToolkit.field_td);
                }
              }
            }
          }
          if (MenuEntry.field_h != 84) {
            if (13 == MenuEntry.field_h) {
              return 1;
            }
            continue;
          }
          break;
        }
        if (this.field_vb.length() <= 0) {
          return 1;
        }
        this.field_r = this.field_vb.toString();
        return 2;
    }

    NameEntryPopup(int param0, int param1, int param2, int param3, String param4, UiComponent param5, UiComponent param6, UiComponent param7) {
        super(0L, param5);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        this.field_ub = 0;
        try {
          this.field_zb = new UiComponent(0L, param6, param4);
          this.addChild(-125, this.field_zb);
          this.field_tb = new UiComponent(0L, param7);
          this.field_tb.field_ib = 16764006;
          this.addChild(-128, this.field_tb);
          this.field_tb.field_sb = "|";
          this.field_vb = new StringBuilder(12);
          var9_int = this.field_zb.measureNaturalWidth((byte) 69);
          this.field_zb.setBounds(var9_int, ToolkitSelector.field_a, -23776, 3, 5);
          this.field_tb.setBounds(var9_int, ToolkitSelector.field_a, -23776, 3 + ToolkitSelector.field_a, 5);
          var10 = 5 + (var9_int + 5);
          var11 = ToolkitSelector.field_a * 2 + 6;
          var12 = PitSnakeModel.clampToScreenX((byte) -8, var10, param2, param0);
          var13 = LegacyTextureCache.clampToScreenY(param3, var11, param1, (byte) 69);
          this.setBounds(var10, var11, -23776, var13, var12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_5_0 = var9;
          stackIn_5_1 = new StringBuilder().append("is.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param5 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param6 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param7 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_wb = new ValidationOutcome();
        field_xb = new LruNodeCache(16);
    }
}
