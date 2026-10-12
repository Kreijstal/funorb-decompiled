/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountNamePrompt extends ClientUiComponent {
    private int pendingResult;
    static String[] field_Pb;
    static String field_Nb;
    private ClientUiComponent instructionsComponent;
    private StringBuilder nameBuffer;
    private ClientUiComponent inputComponent;
    static String field_Ib;
    static String field_Jb;
    static String field_Ob;

    public static void k(int param0) {
        field_Jb = null;
        field_Pb = null;
        field_Ib = null;
        field_Nb = null;
        if (param0 == 0) {
          field_Ob = null;
          return;
        }
        field_Jb = (String) null;
        field_Ob = null;
    }

    final int pollInput(boolean obfuscationGuard, boolean enableCapture) {
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        int var4;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.updateInput(obfuscationGuard, enableCapture);
        if (!enableCapture) {
          this.inputComponent.text = this.nameBuffer.toString();
          if (enableCapture &&
            0 != DeployEvent.pointerPressButton &&
            this.pressedButton == 0) {
            this.pendingResult = 1;
          }
          if (!obfuscationGuard) {
            this.pollInput(false, true);
          }
          return this.pendingResult;
        }
        while (true) {
          if (!Unit.pollKeyEvent((byte) -51)) {
            this.inputComponent.text = this.nameBuffer.toString();
            if (enableCapture &&
              0 != DeployEvent.pointerPressButton &&
              this.pressedButton == 0) {
              this.pendingResult = 1;
              if (obfuscationGuard) {
                return this.pendingResult;
              }
              this.pollInput(false, true);
              return this.pendingResult;
            }
            if (obfuscationGuard) {
              return this.pendingResult;
            }
            this.pollInput(false, true);
            return this.pendingResult;
          }
          if (rs.keyCode == 85 &&
            this.nameBuffer.length() > 0) {
            PortalLossCondition.a(' ', -1 + this.nameBuffer.length(), this.nameBuffer, true);
          }
          if (kv.a(false, (CharSequence) ((Object) this.nameBuffer), DualNodeDeque.typedCharacter)) {
            discarded$1 = this.nameBuffer.append(DualNodeDeque.typedCharacter);
          } else {
            if (this.nameBuffer.length() == 0 &&
              91 == DualNodeDeque.typedCharacter) {
              discarded$2 = this.nameBuffer.append(DualNodeDeque.typedCharacter);
            } else {
              if (this.nameBuffer.length() == 1 &&
                DualNodeDeque.typedCharacter == 35) {
                discarded$3 = this.nameBuffer.append(DualNodeDeque.typedCharacter);
              } else {
                if (DualNodeDeque.typedCharacter == 93) {
                  discarded$4 = this.nameBuffer.append(DualNodeDeque.typedCharacter);
                }
              }
            }
          }
          if (rs.keyCode != 84) {
            if (rs.keyCode != 13) {
              continue;
            }
            return 1;
          }
          break;
        }
        if (this.nameBuffer.length() <= 0) {
          return 1;
        }
        this.text = this.nameBuffer.toString();
        return 2;
    }

    final boolean handleLegacyNameKey(byte obfuscationGuard) {
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var2;
        int var2Lifetime1;
        int var2Lifetime2;
        if (0 != this.pendingResult) {
          return false;
        }
        if (rs.keyCode != 85) {
          if (this.nameBuffer.length() >= 12) {
            if (84 == rs.keyCode) {
              if (this.nameBuffer.length() <= 0) {
                this.pendingResult = 1;
              } else {
                this.text = this.nameBuffer.toString();
                this.pendingResult = 2;
              }
            }
            if (rs.keyCode == 13) {
              this.pendingResult = 1;
            }
            if (obfuscationGuard != -101) {
              return false;
            }
            return true;
          }
          var2 = Character.toLowerCase(DualNodeDeque.typedCharacter);
          if (var2 == 32) {
            var2 = 95;
            if (var2 == 95 &&
              this.nameBuffer.length() > 0) {
              discarded$8 = this.nameBuffer.append((char) var2);
            }
          } else {
            if (var2 == 95 &&
              this.nameBuffer.length() > 0) {
              discarded$9 = this.nameBuffer.append((char) var2);
            }
          }
          if (MeshObject.a((byte) -125, (char) var2)) {
            discarded$10 = this.nameBuffer.append((char) var2);
            if (84 == rs.keyCode) {
              if (this.nameBuffer.length() <= 0) {
                this.pendingResult = 1;
              } else {
                this.text = this.nameBuffer.toString();
                this.pendingResult = 2;
              }
            }
            if (rs.keyCode == 13) {
              this.pendingResult = 1;
            }
            if (obfuscationGuard != -101) {
              return false;
            }
            return true;
          }
          if (!mu.a(28799, (char) var2)) {
            if (84 == rs.keyCode) {
              if (this.nameBuffer.length() <= 0) {
                this.pendingResult = 1;
              } else {
                this.text = this.nameBuffer.toString();
                this.pendingResult = 2;
              }
            }
            if (rs.keyCode == 13) {
              this.pendingResult = 1;
            }
            if (obfuscationGuard != -101) {
              return false;
            }
            return true;
          }
          discarded$11 = this.nameBuffer.append((char) var2);
          if (84 == rs.keyCode) {
            if (this.nameBuffer.length() <= 0) {
              this.pendingResult = 1;
            } else {
              this.text = this.nameBuffer.toString();
              this.pendingResult = 2;
            }
          }
          if (rs.keyCode == 13) {
            this.pendingResult = 1;
          }
          if (obfuscationGuard != -101) {
            return false;
          }
          return true;
        }
        if (this.nameBuffer.length() <= 0) {
          if (this.nameBuffer.length() >= 12) {
            if (84 == rs.keyCode) {
              if (this.nameBuffer.length() <= 0) {
                this.pendingResult = 1;
              } else {
                this.text = this.nameBuffer.toString();
                this.pendingResult = 2;
              }
            }
            if (rs.keyCode == 13) {
              this.pendingResult = 1;
            }
            if (obfuscationGuard == -101) {
              return true;
            }
            return false;
          }
          var2Lifetime1 = Character.toLowerCase(DualNodeDeque.typedCharacter);
          if (var2Lifetime1 == 32) {
            var2Lifetime1 = 95;
            if (var2Lifetime1 == 95 &&
              this.nameBuffer.length() > 0) {
              discarded$4 = this.nameBuffer.append((char) var2Lifetime1);
            }
          } else {
            if (var2Lifetime1 == 95 &&
              this.nameBuffer.length() > 0) {
              discarded$5 = this.nameBuffer.append((char) var2Lifetime1);
            }
          }
          if (MeshObject.a((byte) -125, (char) var2Lifetime1)) {
            discarded$6 = this.nameBuffer.append((char) var2Lifetime1);
            if (84 == rs.keyCode) {
              if (this.nameBuffer.length() <= 0) {
                this.pendingResult = 1;
              } else {
                this.text = this.nameBuffer.toString();
                this.pendingResult = 2;
              }
            }
            if (rs.keyCode == 13) {
              this.pendingResult = 1;
            }
            if (obfuscationGuard != -101) {
              return false;
            }
            return true;
          }
          if (!mu.a(28799, (char) var2Lifetime1)) {
            if (84 == rs.keyCode) {
              if (this.nameBuffer.length() <= 0) {
                this.pendingResult = 1;
              } else {
                this.text = this.nameBuffer.toString();
                this.pendingResult = 2;
              }
            }
            if (rs.keyCode == 13) {
              this.pendingResult = 1;
            }
            if (obfuscationGuard != -101) {
              return false;
            }
            return true;
          }
          discarded$7 = this.nameBuffer.append((char) var2Lifetime1);
          if (84 == rs.keyCode) {
            if (this.nameBuffer.length() <= 0) {
              this.pendingResult = 1;
            } else {
              this.text = this.nameBuffer.toString();
              this.pendingResult = 2;
            }
          }
          if (rs.keyCode == 13) {
            this.pendingResult = 1;
          }
          if (obfuscationGuard == -101) {
            return true;
          }
          return false;
        }
        PortalLossCondition.a(' ', this.nameBuffer.length() - 1, this.nameBuffer, true);
        if (this.nameBuffer.length() >= 12) {
          if (84 == rs.keyCode) {
            if (this.nameBuffer.length() <= 0) {
              this.pendingResult = 1;
            } else {
              this.text = this.nameBuffer.toString();
              this.pendingResult = 2;
            }
          }
          if (rs.keyCode == 13) {
            this.pendingResult = 1;
          }
          if (obfuscationGuard == -101) {
            return true;
          }
          return false;
        }
        var2Lifetime2 = Character.toLowerCase(DualNodeDeque.typedCharacter);
        if (var2Lifetime2 == 32) {
          var2Lifetime2 = 95;
          if (var2Lifetime2 == 95 &&
            this.nameBuffer.length() > 0) {
            discarded$0 = this.nameBuffer.append((char) var2Lifetime2);
          }
        } else {
          if (var2Lifetime2 == 95 &&
            this.nameBuffer.length() > 0) {
            discarded$1 = this.nameBuffer.append((char) var2Lifetime2);
          }
        }
        if (MeshObject.a((byte) -125, (char) var2Lifetime2)) {
          discarded$2 = this.nameBuffer.append((char) var2Lifetime2);
          if (84 == rs.keyCode) {
            if (this.nameBuffer.length() <= 0) {
              this.pendingResult = 1;
            } else {
              this.text = this.nameBuffer.toString();
              this.pendingResult = 2;
            }
          }
          if (rs.keyCode == 13) {
            this.pendingResult = 1;
          }
          if (obfuscationGuard == -101) {
            return true;
          }
          return false;
        }
        if (!mu.a(28799, (char) var2Lifetime2)) {
          if (84 == rs.keyCode) {
            if (this.nameBuffer.length() <= 0) {
              this.pendingResult = 1;
            } else {
              this.text = this.nameBuffer.toString();
              this.pendingResult = 2;
            }
          }
          if (rs.keyCode == 13) {
            this.pendingResult = 1;
          }
          if (obfuscationGuard == -101) {
            return true;
          }
          return false;
        }
        discarded$3 = this.nameBuffer.append((char) var2Lifetime2);
        if (84 == rs.keyCode) {
          if (this.nameBuffer.length() <= 0) {
            this.pendingResult = 1;
          } else {
            this.text = this.nameBuffer.toString();
            this.pendingResult = 2;
          }
        }
        if (rs.keyCode == 13) {
          this.pendingResult = 1;
        }
        if (obfuscationGuard == -101) {
          return true;
        }
        return false;
    }

    AccountNamePrompt(int anchorX, int anchorY, int anchorWidth, int anchorHeight, String instructions, ClientUiComponent style, ClientUiComponent instructionsStyle, ClientUiComponent inputStyle) {
        super(0L, style);
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
        this.pendingResult = 0;
        try {
          this.instructionsComponent = new ClientUiComponent(0L, instructionsStyle, instructions);
          this.addChild(this.instructionsComponent, 112);
          this.inputComponent = new ClientUiComponent(0L, inputStyle);
          this.inputComponent.textColour = 16764006;
          this.addChild(this.inputComponent, 74);
          this.inputComponent.blinkTextSuffix = "|";
          this.nameBuffer = new StringBuilder(12);
          var9_int = this.instructionsComponent.getPreferredWidth(122);
          this.instructionsComponent.setBounds(jn.field_d, -20500, var9_int, 3, 5);
          this.inputComponent.setBounds(jn.field_d, -20500, var9_int, 3 + jn.field_d, 5);
          var10 = var9_int + 5 + 5;
          var11 = 3 + (2 * jn.field_d + 3);
          var12 = jp.a(anchorX, anchorWidth, var10, -1);
          var13 = pd.a(var11, 0, anchorY, anchorHeight);
          this.setBounds(var11, -20500, var10, var13, var12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_5_0 = var9;
          stackIn_5_1 = new StringBuilder().append("oc.<init>(").append(anchorX).append(',').append(anchorY).append(',').append(anchorWidth).append(',').append(anchorHeight).append(',');
          if (instructions == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (style == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (instructionsStyle == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (inputStyle == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_Nb = "<%0> has declined the invitation.";
        field_Jb = "Type your email address again to make sure it's correct";
        field_Ib = "<%0> must play <%1> more rated games before playing with the current options.";
        field_Pb = new String[]{"All scores", "My scores", "Best each"};
        field_Ob = "That name is not available";
    }
}
