/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SocialNamePrompt extends UiLayoutNode {
    private UiLayoutNode field_Cb;
    private UiLayoutNode field_Db;
    private int field_Fb;
    static boolean field_Eb;
    private StringBuilder field_yb;
    static String field_zb;
    static String field_Ab;
    static String field_Bb;

    SocialNamePrompt(int param0, int param1, int param2, int param3, String param4, UiLayoutNode param5, UiLayoutNode param6, UiLayoutNode param7) {
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
        this.field_Fb = 0;
        try {
          this.field_Cb = new UiLayoutNode(0L, param6, param4);
          this.addChild((byte) -124, this.field_Cb);
          this.field_Db = new UiLayoutNode(0L, param7);
          this.field_Db.field_y = 16764006;
          this.addChild((byte) -116, this.field_Db);
          this.field_Db.field_V = "|";
          this.field_yb = new StringBuilder(12);
          var9_int = this.field_Cb.getPreferredWidth((byte) 116);
          this.field_Cb.setBounds(true, var9_int, 5, 3, LineupPositionSupport.field_c);
          this.field_Db.setBounds(true, var9_int, 5, LineupPositionSupport.field_c + 3, LineupPositionSupport.field_c);
          var10 = 5 + var9_int + 5;
          var11 = 3 + (LineupPositionSupport.field_c * 2 + 3);
          var12 = StripedProgressBar.choosePopupX(var10, param0, param2, 127);
          var13 = MonotonicClock.placePopupVertically(param1, param3, var11, 29079);
          this.setBounds(true, var10, var12, var13, var11);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_5_0 = var9;
          stackIn_5_1 = new StringBuilder().append("sl.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
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
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final int updateAndGetResult(byte param0, boolean param1) {
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        int var4;
        var4 = Kickabout.field_G;
        this.updateInput(0, param1);
        if (!param1) {
          if (param0 != 84) {
            this.field_Fb = 41;
          }
          this.field_Db.field_E = this.field_yb.toString();
          if (param1 &&
            WidgetContainer.field_A != 0) {
            if (this.field_sb != 0) {
              return this.field_Fb;
            }
            this.field_Fb = 1;
          }
          return this.field_Fb;
        }
        while (true) {
          if (!TexturedPanelPainter.pollKeyEvent(-59)) {
            if (param0 == 84) {
              this.field_Db.field_E = this.field_yb.toString();
              if (!param1) {
                return this.field_Fb;
              }
              if (WidgetContainer.field_A == 0) {
                return this.field_Fb;
              }
              if (this.field_sb != 0) {
                return this.field_Fb;
              }
              this.field_Fb = 1;
              return this.field_Fb;
            }
            this.field_Fb = 41;
            this.field_Db.field_E = this.field_yb.toString();
            if (!param1) {
              return this.field_Fb;
            }
            if (WidgetContainer.field_A == 0) {
              return this.field_Fb;
            }
            if (this.field_sb != 0) {
              return this.field_Fb;
            }
            this.field_Fb = 1;
            return this.field_Fb;
          }
          if (FixedQuaternion.field_e == 85 &&
            0 < this.field_yb.length()) {
            PagedHelpScreen.a(-1 + this.field_yb.length(), ' ', -11407, this.field_yb);
          }
          if (StatefulTextPainter.a(false, (CharSequence) ((Object) this.field_yb), ClassDescriptorSupport.field_c)) {
            discarded$1 = this.field_yb.append(ClassDescriptorSupport.field_c);
          } else {
            if (this.field_yb.length() == 0 &&
              91 == ClassDescriptorSupport.field_c) {
              discarded$2 = this.field_yb.append(ClassDescriptorSupport.field_c);
            } else {
              if (this.field_yb.length() == 1 &&
                35 == ClassDescriptorSupport.field_c) {
                discarded$3 = this.field_yb.append(ClassDescriptorSupport.field_c);
              } else {
                if (93 == ClassDescriptorSupport.field_c) {
                  discarded$4 = this.field_yb.append(ClassDescriptorSupport.field_c);
                }
              }
            }
          }
          if (FixedQuaternion.field_e != 84) {
            if (FixedQuaternion.field_e != 13) {
              continue;
            }
            return 1;
          }
          break;
        }
        if (0 >= this.field_yb.length()) {
          return 1;
        }
        this.field_E = this.field_yb.toString();
        return 2;
    }

    public static void releaseStatics(byte param0) {
        field_Bb = null;
        field_zb = null;
        field_Ab = null;
        if (param0 == 39) {
          return;
        }
        SocialNamePrompt.releaseStatics((byte) 36);
    }

    final boolean handleNameInputKey(byte param0) {
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$2 = null;
        int var2;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var2Lifetime1Lifetime1;
        if (this.field_Fb != 0) {
          return false;
        }
        if (FixedQuaternion.field_e != 85) {
          if (this.field_yb.length() < 12) {
            var2 = Character.toLowerCase(ClassDescriptorSupport.field_c);
            if (32 == var2) {
              var2 = 95;
              if (var2 == 95 &&
                this.field_yb.length() > 0) {
                discarded$8 = this.field_yb.append((char) var2);
              }
            } else {
              if (var2 == 95 &&
                this.field_yb.length() > 0) {
                discarded$9 = this.field_yb.append((char) var2);
              }
            }
            if (ModalStack.isAsciiLetter((byte) -118, (char) var2)) {
              discarded$10 = this.field_yb.append((char) var2);
              var2 = -60 % ((-76 - param0) / 48);
              if (FixedQuaternion.field_e == 84) {
                if (0 >= this.field_yb.length()) {
                  this.field_Fb = 1;
                } else {
                  this.field_E = this.field_yb.toString();
                  this.field_Fb = 2;
                }
              }
              if (FixedQuaternion.field_e != 13) {
                return true;
              }
              this.field_Fb = 1;
              return true;
            }
            if (IntrusiveNode.isAsciiDigit(12105, (char) var2)) {
              discarded$11 = this.field_yb.append((char) var2);
              var2 = -60 % ((-76 - param0) / 48);
              if (FixedQuaternion.field_e == 84) {
                if (0 >= this.field_yb.length()) {
                  this.field_Fb = 1;
                } else {
                  this.field_E = this.field_yb.toString();
                  this.field_Fb = 2;
                }
              }
              if (FixedQuaternion.field_e == 13) {
                this.field_Fb = 1;
              }
              return true;
            }
          }
          var2Lifetime5 = -60 % ((-76 - param0) / 48);
          if (FixedQuaternion.field_e == 84) {
            if (0 >= this.field_yb.length()) {
              this.field_Fb = 1;
            } else {
              this.field_E = this.field_yb.toString();
              this.field_Fb = 2;
            }
          }
          if (FixedQuaternion.field_e == 13) {
            this.field_Fb = 1;
          }
          return true;
        }
        if (this.field_yb.length() <= 0) {
          if (this.field_yb.length() < 12) {
            var2Lifetime1 = Character.toLowerCase(ClassDescriptorSupport.field_c);
            if (32 == var2Lifetime1) {
              var2Lifetime1 = 95;
              if (var2Lifetime1 == 95 &&
                this.field_yb.length() > 0) {
                discarded$4 = this.field_yb.append((char) var2Lifetime1);
              }
            } else {
              if (var2Lifetime1 == 95 &&
                this.field_yb.length() > 0) {
                discarded$5 = this.field_yb.append((char) var2Lifetime1);
              }
            }
            if (ModalStack.isAsciiLetter((byte) -118, (char) var2Lifetime1)) {
              discarded$7 = this.field_yb.append((char) var2Lifetime1);
              var2Lifetime1 = -60 % ((-76 - param0) / 48);
              if (FixedQuaternion.field_e == 84) {
                if (0 >= this.field_yb.length()) {
                  this.field_Fb = 1;
                } else {
                  this.field_E = this.field_yb.toString();
                  this.field_Fb = 2;
                }
              }
              if (FixedQuaternion.field_e == 13) {
                this.field_Fb = 1;
              }
              return true;
            }
            if (IntrusiveNode.isAsciiDigit(12105, (char) var2Lifetime1)) {
              discarded$6 = this.field_yb.append((char) var2Lifetime1);
              var2Lifetime1 = -60 % ((-76 - param0) / 48);
              if (FixedQuaternion.field_e == 84) {
                if (0 >= this.field_yb.length()) {
                  this.field_Fb = 1;
                } else {
                  this.field_E = this.field_yb.toString();
                  this.field_Fb = 2;
                }
              }
              if (FixedQuaternion.field_e != 13) {
                return true;
              }
              this.field_Fb = 1;
              return true;
            }
          }
          var2Lifetime1Lifetime1 = -60 % ((-76 - param0) / 48);
          if (FixedQuaternion.field_e == 84) {
            if (0 >= this.field_yb.length()) {
              this.field_Fb = 1;
            } else {
              this.field_E = this.field_yb.toString();
              this.field_Fb = 2;
            }
          }
          if (FixedQuaternion.field_e == 13) {
            this.field_Fb = 1;
          }
          return true;
        }
        PagedHelpScreen.a(this.field_yb.length() - 1, ' ', -11407, this.field_yb);
        if (this.field_yb.length() >= 12) {
          var2Lifetime2 = -60 % ((-76 - param0) / 48);
          if (FixedQuaternion.field_e == 84) {
            if (0 >= this.field_yb.length()) {
              this.field_Fb = 1;
            } else {
              this.field_E = this.field_yb.toString();
              this.field_Fb = 2;
            }
          }
          if (FixedQuaternion.field_e != 13) {
            return true;
          }
          this.field_Fb = 1;
          return true;
        }
        var2Lifetime3 = Character.toLowerCase(ClassDescriptorSupport.field_c);
        if (32 == var2Lifetime3) {
          var2Lifetime3 = 95;
          if (var2Lifetime3 == 95 &&
            this.field_yb.length() > 0) {
            discarded$0 = this.field_yb.append((char) var2Lifetime3);
          }
        } else {
          if (var2Lifetime3 == 95 &&
            this.field_yb.length() > 0) {
            discarded$1 = this.field_yb.append((char) var2Lifetime3);
          }
        }
        if (ModalStack.isAsciiLetter((byte) -118, (char) var2Lifetime3)) {
          discarded$3 = this.field_yb.append((char) var2Lifetime3);
          var2Lifetime3 = -60 % ((-76 - param0) / 48);
          if (FixedQuaternion.field_e == 84) {
            if (0 >= this.field_yb.length()) {
              this.field_Fb = 1;
            } else {
              this.field_E = this.field_yb.toString();
              this.field_Fb = 2;
            }
          }
          if (FixedQuaternion.field_e == 13) {
            this.field_Fb = 1;
          }
          return true;
        }
        if (IntrusiveNode.isAsciiDigit(12105, (char) var2Lifetime3)) {
          discarded$2 = this.field_yb.append((char) var2Lifetime3);
          var2Lifetime3 = -60 % ((-76 - param0) / 48);
          if (FixedQuaternion.field_e != 84) {
            if (FixedQuaternion.field_e != 13) {
              return true;
            }
            this.field_Fb = 1;
            return true;
          }
          if (0 >= this.field_yb.length()) {
            this.field_Fb = 1;
            if (FixedQuaternion.field_e != 13) {
              return true;
            }
            this.field_Fb = 1;
            return true;
          }
          this.field_E = this.field_yb.toString();
          this.field_Fb = 2;
          if (FixedQuaternion.field_e == 13) {
            this.field_Fb = 1;
          }
          return true;
        }
        var2Lifetime4 = -60 % ((-76 - param0) / 48);
        if (FixedQuaternion.field_e == 84) {
          if (0 >= this.field_yb.length()) {
            this.field_Fb = 1;
          } else {
            this.field_E = this.field_yb.toString();
            this.field_Fb = 2;
          }
        }
        if (FixedQuaternion.field_e != 13) {
          return true;
        }
        this.field_Fb = 1;
        return true;
    }

    static {
        field_Eb = true;
        field_Bb = "To report a player, right-click on their name and select the option to report abuse.";
        field_zb = "Rankings";
        field_Ab = "ready";
    }
}
