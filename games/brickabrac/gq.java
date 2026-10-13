/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq extends UiComponent {
    static RgbSprite field_Sb;
    static String field_Wb;
    private UiComponent field_Qb;
    static mi field_Xb;
    private StringBuilder field_Vb;
    private UiComponent field_Pb;
    private int field_Tb;
    static int field_Yb;
    static RgbSprite[] chocLeverSprites;
    static ResourceArchive field_Rb;

    final int a(boolean param0, byte param1) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var4;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (param1 < 88) {
          return 77;
        }
        this.updateRoot(param0, -15211);
        if (!param0) {
          this.field_Qb.text = this.field_Vb.toString();
          if (param0 &&
            BackgroundScene.pressedButton != 0 &&
            this.pressedButton == 0) {
            this.field_Tb = 1;
          }
          return this.field_Tb;
        }
        while (true) {
          if (!jl.pollKeyEvent((byte) 5)) {
            this.field_Qb.text = this.field_Vb.toString();
            if (!param0) {
              return this.field_Tb;
            }
            if (BackgroundScene.pressedButton == 0) {
              return this.field_Tb;
            }
            if (this.pressedButton != 0) {
              return this.field_Tb;
            }
            this.field_Tb = 1;
            return this.field_Tb;
          }
          if (MeshAttributeRecord.currentKeyCode == 85 &&
            this.field_Vb.length() > 0) {
            MessageScreen.a(' ', this.field_Vb, -1 + this.field_Vb.length(), false);
          }
          if (nk.a(go.currentKeyCharacter, (CharSequence) ((Object) this.field_Vb), false)) {
            discarded$0 = this.field_Vb.append(go.currentKeyCharacter);
          } else {
            if (this.field_Vb.length() == 0 &&
              go.currentKeyCharacter == 91) {
              discarded$1 = this.field_Vb.append(go.currentKeyCharacter);
            } else {
              if (this.field_Vb.length() == 1 &&
                go.currentKeyCharacter == 35) {
                discarded$2 = this.field_Vb.append(go.currentKeyCharacter);
              } else {
                if (go.currentKeyCharacter == 93) {
                  discarded$3 = this.field_Vb.append(go.currentKeyCharacter);
                }
              }
            }
          }
          if (MeshAttributeRecord.currentKeyCode != 84) {
            if (MeshAttributeRecord.currentKeyCode == 13) {
              return 1;
            }
            continue;
          }
          break;
        }
        if (0 >= this.field_Vb.length()) {
          return 1;
        }
        this.text = this.field_Vb.toString();
        return 2;
    }

    final boolean h(int param0) {
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$1 = null;
        int var2;
        int var2Lifetime1;
        int var2Lifetime2;
        if (this.field_Tb != 0) {
          return false;
        }
        if (MeshAttributeRecord.currentKeyCode != 85) {
          if (12 > this.field_Vb.length()) {
            var2 = Character.toLowerCase(go.currentKeyCharacter);
            if (var2 == 32) {
              var2 = 95;
            }
            if (95 == var2 &&
              0 < this.field_Vb.length()) {
              discarded$6 = this.field_Vb.append((char) var2);
            }
            if (StateIconLabel.b(true, (char) var2)) {
              discarded$7 = this.field_Vb.append((char) var2);
              if (MeshAttributeRecord.currentKeyCode == 84) {
                if (this.field_Vb.length() > 0) {
                  this.text = this.field_Vb.toString();
                  this.field_Tb = 2;
                } else {
                  this.field_Tb = 1;
                }
              }
              if (MeshAttributeRecord.currentKeyCode != param0) {
                return true;
              }
              this.field_Tb = 1;
              return true;
            }
            if (eh.a((char) var2, (byte) 83)) {
              discarded$8 = this.field_Vb.append((char) var2);
              if (MeshAttributeRecord.currentKeyCode == 84) {
                if (this.field_Vb.length() > 0) {
                  this.text = this.field_Vb.toString();
                  this.field_Tb = 2;
                } else {
                  this.field_Tb = 1;
                }
              }
              if (MeshAttributeRecord.currentKeyCode == param0) {
                this.field_Tb = 1;
              }
              return true;
            }
          }
          if (MeshAttributeRecord.currentKeyCode == 84) {
            if (this.field_Vb.length() <= 0) {
              this.field_Tb = 1;
            } else {
              this.text = this.field_Vb.toString();
              this.field_Tb = 2;
            }
          }
          if (MeshAttributeRecord.currentKeyCode == param0) {
            this.field_Tb = 1;
          }
          return true;
        }
        if (this.field_Vb.length() <= 0) {
          if (12 > this.field_Vb.length()) {
            var2Lifetime1 = Character.toLowerCase(go.currentKeyCharacter);
            if (var2Lifetime1 == 32) {
              var2Lifetime1 = 95;
            }
            if (95 == var2Lifetime1 &&
              0 < this.field_Vb.length()) {
              discarded$3 = this.field_Vb.append((char) var2Lifetime1);
            }
            if (StateIconLabel.b(true, (char) var2Lifetime1)) {
              discarded$4 = this.field_Vb.append((char) var2Lifetime1);
              if (MeshAttributeRecord.currentKeyCode == 84) {
                if (this.field_Vb.length() > 0) {
                  this.text = this.field_Vb.toString();
                  this.field_Tb = 2;
                } else {
                  this.field_Tb = 1;
                }
              }
              if (MeshAttributeRecord.currentKeyCode != param0) {
                return true;
              }
              this.field_Tb = 1;
              return true;
            }
            if (eh.a((char) var2Lifetime1, (byte) 83)) {
              discarded$5 = this.field_Vb.append((char) var2Lifetime1);
              if (MeshAttributeRecord.currentKeyCode == 84) {
                if (this.field_Vb.length() > 0) {
                  this.text = this.field_Vb.toString();
                  this.field_Tb = 2;
                } else {
                  this.field_Tb = 1;
                }
              }
              if (MeshAttributeRecord.currentKeyCode == param0) {
                this.field_Tb = 1;
              }
              return true;
            }
          }
          if (MeshAttributeRecord.currentKeyCode == 84) {
            if (this.field_Vb.length() <= 0) {
              this.field_Tb = 1;
            } else {
              this.text = this.field_Vb.toString();
              this.field_Tb = 2;
            }
          }
          if (MeshAttributeRecord.currentKeyCode == param0) {
            this.field_Tb = 1;
          }
          return true;
        }
        MessageScreen.a(' ', this.field_Vb, -1 + this.field_Vb.length(), false);
        if (12 <= this.field_Vb.length()) {
          if (MeshAttributeRecord.currentKeyCode == 84) {
            if (this.field_Vb.length() <= 0) {
              this.field_Tb = 1;
            } else {
              this.text = this.field_Vb.toString();
              this.field_Tb = 2;
            }
          }
          if (MeshAttributeRecord.currentKeyCode != param0) {
            return true;
          }
          this.field_Tb = 1;
          return true;
        }
        var2Lifetime2 = Character.toLowerCase(go.currentKeyCharacter);
        if (var2Lifetime2 == 32) {
          var2Lifetime2 = 95;
        }
        if (95 == var2Lifetime2 &&
          0 < this.field_Vb.length()) {
          discarded$0 = this.field_Vb.append((char) var2Lifetime2);
        }
        if (StateIconLabel.b(true, (char) var2Lifetime2)) {
          discarded$2 = this.field_Vb.append((char) var2Lifetime2);
          if (MeshAttributeRecord.currentKeyCode == 84) {
            if (this.field_Vb.length() > 0) {
              this.text = this.field_Vb.toString();
              this.field_Tb = 2;
            } else {
              this.field_Tb = 1;
            }
          }
          if (MeshAttributeRecord.currentKeyCode == param0) {
            this.field_Tb = 1;
          }
          return true;
        }
        if (eh.a((char) var2Lifetime2, (byte) 83)) {
          discarded$1 = this.field_Vb.append((char) var2Lifetime2);
          if (MeshAttributeRecord.currentKeyCode == 84) {
            if (this.field_Vb.length() <= 0) {
              this.field_Tb = 1;
              if (MeshAttributeRecord.currentKeyCode == param0) {
                this.field_Tb = 1;
              }
              return true;
            }
            this.text = this.field_Vb.toString();
            this.field_Tb = 2;
          }
          if (MeshAttributeRecord.currentKeyCode != param0) {
            return true;
          }
          this.field_Tb = 1;
          return true;
        }
        if (MeshAttributeRecord.currentKeyCode == 84) {
          if (this.field_Vb.length() <= 0) {
            this.field_Tb = 1;
          } else {
            this.text = this.field_Vb.toString();
            this.field_Tb = 2;
          }
        }
        if (MeshAttributeRecord.currentKeyCode != param0) {
          return true;
        }
        this.field_Tb = 1;
        return true;
    }

    public static void d(boolean param0) {
        if (!param0) {
          field_Rb = null;
          field_Sb = null;
          field_Wb = null;
          field_Xb = null;
          chocLeverSprites = null;
          return;
        }
        gq.d((byte) -20);
        field_Rb = null;
        field_Sb = null;
        field_Wb = null;
        field_Xb = null;
        chocLeverSprites = null;
    }

    final static boolean d(byte param0) {
        int[] var1 = null;
        int var1_int = 0;
        RuntimeException var1_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var7 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var16 = null;
        int[] var17 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var1Lifetime1;
        int var3Lifetime1;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          if (bd.field_b == null) {
            bd.field_b = LevelPackLoader.requestAchievementMask((byte) 107, 4);
          }
          if (!bd.field_b.complete) {
            var1_int = -62 / ((param0 + 18) / 47);
            return false;
          }
          var12 = SecondaryHashTable.earnedAchievementMask;
          var10 = var12;
          var5 = var10;
          var1 = var5;
          var16 = bd.field_b.achievementMask;
          for (var3 = 0; 8 > var3; var3++) {
            var5[var3] = LevelSelectScreen.d(var12[var3], var16[var3]);
          }
          var13 = pl.pendingAchievementMask;
          var11 = var13;
          var7 = var11;
          var1Lifetime1 = var7;
          var17 = bd.field_b.achievementMask;
          var9 = 0;
          var3Lifetime1 = var9;
          while (var9 < 8) {
            var7[var9] = ik.a(var13[var9], ~var17[var9]);
            var9++;
          }
          bd.field_b = null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1_ref), "gq.B(" + param0 + ')');
        }
    }

    final static boolean b(int param0, int param1) {
        if (~param0 > param1) {
          return (1 + param0) % 4 == 0 ? true : false;
        }
        if (param0 < 1582) {
          return param0 % 4 == 0 ? true : false;
        }
        if (param0 % 4 != 0) {
          return false;
        }
        if (0 != param0 % 100) {
          return true;
        }
        if (param0 % 400 == 0) {
          return true;
        }
        return false;
    }

    gq(int param0, int param1, int param2, int param3, String param4, UiComponent param5, UiComponent param6, UiComponent param7) {
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
        this.field_Tb = 0;
        try {
          this.field_Pb = new UiComponent(0L, param6, param4);
          this.addChild(this.field_Pb, 0);
          this.field_Qb = new UiComponent(0L, param7);
          this.field_Qb.textColor = 16764006;
          this.addChild(this.field_Qb, 0);
          this.field_Qb.textSuffix = "|";
          this.field_Vb = new StringBuilder(12);
          var9_int = this.field_Pb.getContentWidth(81);
          this.field_Pb.setBounds(np.field_a, 3, 5, var9_int, (byte) 64);
          this.field_Qb.setBounds(np.field_a, np.field_a + 3, 5, var9_int, (byte) 64);
          var10 = 10 + var9_int;
          var11 = 3 + np.field_a * 2 + 3;
          var12 = OptionsScreen.a(-1, var10, param0, param2);
          var13 = br.a(var11, param1, param3, 121);
          this.setBounds(var11, var13, var12, var10, (byte) 64);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_5_0 = var9;
          stackIn_5_1 = new StringBuilder().append("gq.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_Wb = "Reject";
        field_Xb = new mi();
    }
}
