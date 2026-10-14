/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class HighscoresScreen extends MenuScreen {
    static int field_v;
    static int[][] field_w;
    private int packIndex;
    private HighscorePackSelector packSelector;
    static int[] bzip2TraversalTable;
    private int scoreFilterIndex;

    final void onEnter(boolean usePointer, int initialSelection, int obfuscationGuard) {
        LevelSequence var4;
        if (obfuscationGuard < 96) {
          return;
        }
        super.onEnter(usePointer, initialSelection, 101);
        rf.field_g = null;
        this.packIndex = 0;
        if (IntArrayRequest.gameplayScreen != null &&
          !IntArrayRequest.gameplayScreen.networkedMatch) {
          var4 = IntArrayRequest.gameplayScreen.match.configuration;
          if (var4.pack.packId == 1) {
            this.packIndex = 1;
          }
        }
    }

    final int getButtonTop(int buttonIndex, int obfuscationGuard) {
        int var3 = 0;
        if (obfuscationGuard != 1) {
          bzip2TraversalTable = (int[]) null;
        }
        if (this.buttons.length != 2) {
          var3 = this.buttons[buttonIndex].actionId;
          return var3 == 43 ? 140 : -6 + (this.buttonTop + 38);
        }
        return this.buttonTop;
    }

    final void onExit(byte obfuscationGuard) {
        rf.field_g = null;
        if (obfuscationGuard != 79) {
          this.packIndex = -114;
        }
    }

    final static void a(String param0, int param1, String param2) {
        try {
          ArchiveFetchClient.a(false, param0, param2, 2);
          if (param1 != 11455) {
            field_v = -30;
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ah.KA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void handleNavigationKey(int obfuscationGuard, int keyCode, char character) {
        int var5;
        boolean decompiledFrameRemainder0 = true;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (this.buttons.length == 2) {
          this.selection.navigateHorizontal(0, obfuscationGuard + 119);
        } else {
          if (keyCode == 96) {
            if (this.selection.selectedIndex <= 0) {
              this.selection.setSelectedIndex(false, 3);
            } else {
              if (this.selection.selectedIndex < 4) {
                this.selection.setSelectedIndex(false, -1 + this.selection.selectedIndex);
              }
            }
          }
          if (keyCode == 97) {
            if (3 <= this.selection.selectedIndex) {
              if (this.selection.selectedIndex == 3) {
                this.selection.setSelectedIndex(false, 0);
              }
            } else {
              this.selection.setSelectedIndex(false, 1 + this.selection.selectedIndex);
            }
          }
          if (keyCode == 99) {
            if (this.selection.selectedIndex < 4) {
              this.selection.setSelectedIndex(false, 4);
              this.packSelector.selectFirst((byte) 108);
            } else {
              if (this.packSelector.handleNavigationKey(keyCode, character, -94)) {
                this.selection.setSelectedIndex(false, 0);
              }
            }
          }
          if (keyCode == 98) {
            if (4 > this.selection.selectedIndex) {
              this.selection.setSelectedIndex(false, 4);
              this.packSelector.selectRelativeToEnd(obfuscationGuard ^ 119);
              this.selection.pollKeyboardCode((byte) -124);
              decompiledFrameRemainder0 = false;
            }
            else {
              if (this.packSelector.handleNavigationKey(keyCode, character, -67)) {
                this.selection.setSelectedIndex(false, 0);
                this.selection.pollKeyboardCode((byte) -124);
                decompiledFrameRemainder0 = false;
              }
            }
          }
          if (decompiledFrameRemainder0) {
            this.selection.pollKeyboardCode((byte) -124);
          }
        }
        if (obfuscationGuard != -120) {
          bzip2TraversalTable = (int[]) null;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, String param7) {
        try {
          if (param0 != -1) {
            PasswordFieldRenderer.field_D.drawRight(param0 + 1 + ". ", SecondaryNodeQueue.field_b[0], param2, param3, -1);
          }
          PasswordFieldRenderer.field_D.drawLeft(param7, SecondaryNodeQueue.field_b[0], param2, param3, -1);
          PasswordFieldRenderer.field_D.drawCentered(Integer.toString(1 + param1), SecondaryNodeQueue.field_b[1] - ContextActionController.field_g.measureText(SpriteGeometry.field_u) / 2, param2, param3, -1);
          PasswordFieldRenderer.field_D.drawCentered(Integer.toString(1 + param4), SecondaryNodeQueue.field_b[2] - ContextActionController.field_g.measureText(ba.field_u) / 2, param2, param3, -1);
          PasswordFieldRenderer.field_D.drawRight(Integer.toString(param6), SecondaryNodeQueue.field_b[3], param2, param3, -1);
          int var9_int = 102 % ((param5 + 15) / 45);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ah.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    final static char foldPlayerNameCharacter(int obfuscationGuard, char character) {
        int var2;
        int var3;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard != 207) {
          return 'j';
        }
        var2 = character;
        if (32 != var2 &&
          160 != var2 &&
          var2 != 95 &&
          var2 != 45) {
          if (var2 != 91 &&
            var2 != 93 &&
            35 != var2) {
            if (var2 != 224 &&
              225 != var2 &&
              var2 != 226 &&
              228 != var2 &&
              227 != var2 &&
              var2 != 192 &&
              193 != var2 &&
              194 != var2 &&
              var2 != 196 &&
              var2 != 195) {
              if (232 != var2 &&
                var2 != 233 &&
                var2 != 234 &&
                var2 != 235 &&
                var2 != 200 &&
                201 != var2 &&
                var2 != 202 &&
                var2 != 203) {
                if (var2 != 237 &&
                  var2 != 238 &&
                  var2 != 239 &&
                  var2 != 205 &&
                  var2 != 206 &&
                  207 != var2) {
                  if (var2 != 242 &&
                    var2 != 243 &&
                    var2 != 244 &&
                    var2 != 246 &&
                    245 != var2 &&
                    var2 != 210 &&
                    211 != var2 &&
                    var2 != 212 &&
                    var2 != 214 &&
                    var2 != 213) {
                    if (249 != var2 &&
                      var2 != 250 &&
                      251 != var2 &&
                      var2 != 252 &&
                      217 != var2 &&
                      218 != var2 &&
                      var2 != 219 &&
                      var2 != 220) {
                      if (var2 != 231 &&
                        var2 != 199) {
                        if (var2 != 255 &&
                          var2 != 376) {
                          if (var2 != 241 &&
                            var2 != 209) {
                            if (223 != var2) {
                              return Character.toLowerCase(character);
                            }
                            return 'b';
                          }
                          return 'n';
                        }
                        return 'y';
                      }
                      return 'c';
                    }
                    return 'u';
                  }
                  return 'o';
                }
                return 'i';
              }
              return 'e';
            }
            return 'a';
          }
          return character;
        }
        return '_';
    }

    final void layoutButtons(boolean obfuscationGuard) {
        int var5_int = 0;
        String stackIn_8_0 = null;
        int var2;
        int var3;
        int var4;
        MenuButton var4_ref_q;
        MenuButton var5;
        String var5_ref;
        MenuButton var6;
        int var6_int;
        int var7;
        MenuButton var8;
        String var9;
        MenuButton var10;
        int var3Lifetime1;
        var7 = BrickABrac.field_J ? 1 : 0;
        if (!obfuscationGuard) {
          field_v = -11;
        }
        if (this.buttons.length != 2) {
          var2 = 0;
          for (var3 = 0; var3 < -1 + this.buttons.length; var3++) {
            var4_ref_q = this.buttons[var3];
            if (var4_ref_q.actionId == 8) {
              stackIn_8_0 = this.e((byte) 125);
            } else {
              stackIn_8_0 = ArrayWidgetGroup.buttonLabels[var4_ref_q.actionId];
            }
            var9 = stackIn_8_0;
            var5_ref = var9;
            var6_int = ContextActionController.field_g.measureText(var9) + 30;
            if (var6_int > var2) {
              var2 = var6_int;
            }
          }
          var3Lifetime1 = 30 + var2 * 4;
          var4 = 120 + (-var3Lifetime1 + 475) / 2;
          for (var5_int = 0; this.buttons.length - 1 > var5_int; var5_int++) {
            var6 = this.buttons[var5_int];
            var6.x = var4;
            var6.y = this.getButtonTop(var5_int, 1);
            var6.width = var2;
            var6.height = this.getButtonHeight((byte) 118, var5_int);
            var4 = var4 + (10 + var6.width);
          }
          var8 = this.buttons[this.buttons.length - 1];
          var10 = var8;
          var5 = var10;
          var8.width = SaveResultsPromptScreen.packCardIcons[0].canvasWidth;
          var8.height = SaveResultsPromptScreen.packCardIcons[0].canvasHeight * 2;
          var5.x = (-var10.width + 240) / 4;
          var5.y = 140;
        } else {
          this.e(2);
        }
    }

    final static void a(BitPacketBuffer param0, byte param1) {
        try {
          int var5 = 0;
          int var10_int = 0;
          RuntimeException stackIn_66_0 = null;
          StringBuilder stackIn_66_1 = null;
          String stackIn_67_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2 = null;
          int var3 = 0;
          int var4 = 0;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          InvalidClassException var6_ref = null;
          StreamCorruptedException var6_ref2 = null;
          OptionalDataException var6_ref3 = null;
          IllegalAccessException var6_ref4 = null;
          IllegalArgumentException var6_ref5 = null;
          java.lang.reflect.InvocationTargetException var6_ref6 = null;
          SecurityException var6_ref7 = null;
          IOException var6_ref8 = null;
          NullPointerException var6_ref9 = null;
          Exception var6_ref10 = null;
          Throwable var6_ref11 = null;
          int var8 = 0;
          Object[] var9 = null;
          Object var10 = null;
          ObjectInputStream var11 = null;
          int var12 = 0;
          bg var13 = null;
          java.lang.reflect.Field var15 = null;
          Object var16 = null;
          java.lang.reflect.Field var16_ref = null;
          bg var17 = null;
          Object var18 = null;
          java.lang.reflect.Field var19 = null;
          Object var20 = null;
          Object var22 = null;
          byte[][] var25 = null;
          java.lang.reflect.Field var26 = null;
          java.lang.reflect.Method var27 = null;
          java.lang.reflect.Method var28 = null;
          int var8Lifetime1;
          var18 = null;
          var16 = null;
          var20 = null;
          var22 = null;
          var12 = BrickABrac.field_J ? 1 : 0;
          try {
            var13 = (bg) (ResourceArchive.field_i.first(-48));
            var17 = var13;
            if (var17 == null) {
              return;
            }
            var3 = 0;
            for (var4 = 0; var17.field_s > var4; var4++) {
              if (null != var13.field_j[var4]) {
                if (var13.field_j[var4].status == 2) {
                  var13.field_k[var4] = -5;
                }
                if (0 == var13.field_j[var4].status) {
                  var3 = 1;
                }
              }
              if (var13.field_l[var4] != null) {
                if (2 == var13.field_l[var4].status) {
                  var13.field_k[var4] = -6;
                }
                if (0 == var13.field_l[var4].status) {
                  var3 = 1;
                }
              }
            }
            if (var3 != 0) {
              return;
            }
            var4 = param0.position;
            param0.writeInt(var17.field_i, (byte) -79);
            for (var5 = 0; var17.field_s > var5; var5++) {
              if (var17.field_k[var5] == 0) {
                try {
                  var6_int = var17.field_t[var5];
                  if (var6_int == 0) {
                    var15 = (java.lang.reflect.Field) (var17.field_j[var5].result);
                    var8 = var15.getInt((Object) null);
                    param0.writeByte(-7, 0);
                    param0.writeInt(var8, (byte) -79);
                  } else {
                    if (var6_int == 1) {
                      var16_ref = (java.lang.reflect.Field) (var17.field_j[var5].result);
                      var19 = var16_ref;
                      var19.setInt((Object) null, var17.field_q[var5]);
                      param0.writeByte(-15, 0);
                    } else {
                      if (var6_int == 2) {
                        var26 = (java.lang.reflect.Field) (var17.field_j[var5].result);
                        var8 = var26.getModifiers();
                        param0.writeByte(param1 - 4, 0);
                        param0.writeInt(var8, (byte) -79);
                      }
                    }
                  }
                  if (var6_int == 3) {
                    var28 = (java.lang.reflect.Method) (var17.field_l[var5].result);
                    var25 = var17.field_m[var5];
                    var9 = new Object[var25.length];
                    for (var10_int = 0; var25.length > var10_int; var10_int++) {
                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var25[var10_int])));
                      var9[var10_int] = var11.readObject();
                    }
                    var10 = var28.invoke((Object) null, var9);
                    if (var10 == null) {
                      param0.writeByte(param1 ^ 61, 0);
                    } else if (var10 instanceof Number) {
                      param0.writeByte(param1 ^ -114, 1);
                      param0.writeLong(-23054, ((Number) (var10)).longValue());
                    } else if (!(var10 instanceof String)) {
                      param0.writeByte(22, 4);
                    } else {
                      param0.writeByte(param1 ^ -103, 2);
                      param0.writeCp1252String((String) (var10), -1);
                    }
                  } else {
                    if (var6_int == 4) {
                      var27 = (java.lang.reflect.Method) (var17.field_l[var5].result);
                      var8Lifetime1 = var27.getModifiers();
                      param0.writeByte(-123, 0);
                      param0.writeInt(var8Lifetime1, (byte) -79);
                    }
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  param0.writeByte(80, -10);
                } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                  param0.writeByte(param1 - 127, -11);
                } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                  param0.writeByte(param1 ^ -126, -12);
                } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                  param0.writeByte(param1 - 16, -13);
                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                  param0.writeByte(109, -14);
                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                  decompiledCaughtException = decompiledCaughtParameter5;
                  var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                  param0.writeByte(-126, -15);
                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                  decompiledCaughtException = decompiledCaughtParameter6;
                  var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                  param0.writeByte(-114, -16);
                } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                  decompiledCaughtException = decompiledCaughtParameter7;
                  var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                  param0.writeByte(71, -17);
                } catch (java.io.IOException decompiledCaughtParameter8) {
                  decompiledCaughtException = decompiledCaughtParameter8;
                  var6_ref8 = (IOException) (Object) decompiledCaughtException;
                  param0.writeByte(-111, -18);
                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                  decompiledCaughtException = decompiledCaughtParameter9;
                  var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                  param0.writeByte(param1 - 112, -19);
                } catch (java.lang.Exception decompiledCaughtParameter10) {
                  decompiledCaughtException = decompiledCaughtParameter10;
                  var6_ref10 = (Exception) (Object) decompiledCaughtException;
                  param0.writeByte(101, -20);
                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                  decompiledCaughtException = decompiledCaughtParameter11;
                  var6_ref11 = decompiledCaughtException;
                  param0.writeByte(87, -21);
                }
              } else {
                param0.writeByte(87, var17.field_k[var5]);
              }
            }
            if (param1 != 9) {
              HighscoresScreen.foldPlayerNameCharacter(-62, '&');
            }
            param0.appendCrc32(3, var4);
            var17.unlink((byte) 111);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_66_0 = var2;
            stackIn_66_1 = new StringBuilder().append("ah.B(");
            if (param0 == null) {
              stackIn_67_2 = "null";
            } else {
              stackIn_67_2 = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_66_0), ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void f(int param0) {
        bzip2TraversalTable = null;
        if (param0 != -5) {
          String var2 = (String) null;
          HighscoresScreen.a((String) null, -31, (String) null);
        }
        field_w = (int[][]) null;
    }

    final boolean handleMenuAction(int buttonIndex, boolean inputFlag, byte obfuscationGuard) {
        int var4;
        MenuButton var5;
        int var6;
        int var7;
        int var8;
        var8 = BrickABrac.field_J ? 1 : 0;
        var4 = 0;
        if (obfuscationGuard != 123) {
          return true;
        }
        var5 = this.buttons[buttonIndex];
        var6 = var5.actionId;
        var7 = var6;
        if (14 != var7) {
          if (var7 == 15) {
            if (this.selection.isActivated((byte) 113)) {
              this.scoreFilterIndex = 1;
              this.markButton(true, buttonIndex);
              var4 = 1;
            }
          } else {
            if (var7 == 16) {
              if (this.selection.isActivated((byte) 113)) {
                this.scoreFilterIndex = 2;
                var4 = 1;
                this.markButton(true, buttonIndex);
              }
            } else {
              if (var7 != 43) {
                return super.handleMenuAction(buttonIndex, inputFlag, (byte) 123);
              }
              if (this.selection.isActivated((byte) 113) &&
                this.packSelector.selectedPackIndex != -1) {
                rf.field_g = null;
                var4 = 1;
                this.packIndex = this.packSelector.selectedPackIndex;
              }
            }
          }
        } else {
          if (this.selection.isActivated((byte) 113)) {
            this.scoreFilterIndex = 0;
            this.markButton(true, buttonIndex);
            var4 = 1;
          }
        }
        return var4 != 0;
    }

    HighscoresScreen() {
        super(5, 38, 460, 402, 35, LevelPack.field_a);
        this.packIndex = 0;
        this.scoreFilterIndex = 0;
        HuffmanCodec.field_g = PasswordFieldRenderer.field_D.measureText("10. ") + 10;
        SecondaryNodeQueue.field_b = new int[4];
        SecondaryNodeQueue.field_b[2] = 125 + HuffmanCodec.field_g + 330;
        SecondaryNodeQueue.field_b[1] = 125 + HuffmanCodec.field_g + 240;
        SecondaryNodeQueue.field_b[0] = 125 + HuffmanCodec.field_g;
        SecondaryNodeQueue.field_b[3] = 50 - (-HuffmanCodec.field_g - 500);
        this.packSelector = new HighscorePackSelector(this, ObjectHistoryBuffer.field_k.length - 1, 2);
    }

    final void refreshMenu(int obfuscationGuard) {
        this.initializeButtons(ObjectHistoryBuffer.field_k, 0);
        this.markButton(true, 1);
        if (obfuscationGuard >= -60) {
          HighscoresScreen.f(-46);
        }
    }

    final static long a(boolean param0, CharSequence param1) {
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        long stackIn_22_0 = 0L;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          var2_long = 0L;
          var4 = param1.length();
          var5 = 0;
          if (param0) {
            field_w = (int[][]) null;
          }
          while (var4 > var5) {
            var2_long = var2_long * 37L;
            var6 = param1.charAt(var5);
            if (var6 >= 65 &&
              var6 <= 90) {
              var2_long = var2_long + (long)(-65 + (1 + var6));
            } else if (var6 >= 97 &&
              122 >= var6) {
              var2_long = var2_long + (long)(1 + var6 - 97);
            } else {
              if (48 <= var6 &&
                var6 <= 57) {
                var2_long = var2_long + (long)(var6 - 21);
              }
            }
            if (var2_long < 177917621779460413L) {
              var5++;
              continue;
            }
            break;
          }
          while (var2_long % 37L == 0L) {
            if (var2_long != 0L) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_22_0 = var2_long;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("ah.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final void drawScreen(byte obfuscationGuard) {
        int stackIn_17_0 = 0;
        int var2;
        int var3;
        Object var4;
        String var4_ref;
        String[] var5;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int[] var13;
        int[] var16;
        int var2Lifetime1;
        int var3Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var12 = BrickABrac.field_J ? 1 : 0;
        super.drawScreen((byte) -38);
        AchievementMaskRequest.a(this.screenId, 19);
        this.a(0);
        if (QuickChatMenu.h(-26090)) {
          GzipInflater.a(550, 5, 243, 5, 140, (byte) -108, 45);
          VerticalScrollbar.a(243, DateFieldsWidget.field_N, 140, ContextActionController.field_g, -15531, 2);
          return;
        }
        GzipInflater.a(475, 5, 33, 5, 140, (byte) -101, 120);
        ContextActionController.field_g.drawCentered(qn.packNames[this.packIndex], 357, 1 + (-ContextActionController.field_g.xHeight + 178), 0, -1);
        ArchiveNetworkRequest.packSelectorIcons[this.packIndex].e(565, 140, -2048, 4096);
        if (obfuscationGuard >= -14) {
          field_v = -65;
        }
        GzipInflater.a(475, 5, 243, 5, 178, (byte) -57, 120);
        var2 = 149 + ContextActionController.field_g.capHeight + 38;
        var3 = 0;
        ContextActionController.field_g.drawLeft(DualLinkIterator.field_i, -HuffmanCodec.field_g + SecondaryNodeQueue.field_b[0] + 12, var2, var3, -1);
        ContextActionController.field_g.drawRight(SpriteGeometry.field_u, SecondaryNodeQueue.field_b[1], var2, var3, -1);
        ContextActionController.field_g.drawRight(ba.field_u, SecondaryNodeQueue.field_b[2], var2, var3, -1);
        ContextActionController.field_g.drawRight(DebouncedValidationSource.field_d, SecondaryNodeQueue.field_b[3], var2, var3, -1);
        var2Lifetime1 = 5 * (ContextActionController.field_g.descent + ContextActionController.field_g.capHeight) / 2 + 187;
        var4 = null;
        if (rf.field_g != null &&
          rf.field_g.complete) {
          if (null == rf.field_g.names) {
            var4_ref = BoundedFile.field_d;
          } else {
            var4_ref = ArchiveNetworkRequest.field_J;
            var5 = rf.field_g.names[this.scoreFilterIndex];
            var13 = rf.field_g.values[this.scoreFilterIndex];
            var7 = gj.findTableRow(rf.field_g, VerticalScrollbar.field_Ub, -87, this.scoreFilterIndex);
            for (var8 = 0; 10 > var8; var8++) {
              if (var5[var8] != null) {
                stackIn_17_0 = (var7 == var8) ? 1 : 2;
                var3Lifetime1 = stackIn_17_0;
                var9 = var13[2 * var8];
                var10 = var13[2 * var8 + 1] >> 16 & 65535;
                var11 = var13[1 + 2 * var8] & 65535;
                if ((1 & var8) == 0) {
                  Rasterizer2D.fillRectangleAlpha(125, var2Lifetime1 - 15, 465, 18, 16777215, 16);
                }
                var4_ref = "";
                this.a(var8, var10, var2Lifetime1, var3Lifetime1, var11, 105, var9, var5[var8]);
              }
              var2Lifetime1 += 18;
            }
            if (VerticalScrollbar.field_Ub != null &&
              var7 < 0) {
              var16 = VerticalScrollbar.field_Ub.values;
              var8Lifetime1 = var16[0];
              var9Lifetime1 = var16[1] >> 16 & 65535;
              var10Lifetime1 = 65535 & var16[1];
              this.a(-1, var9Lifetime1, var2Lifetime1, 1, var10Lifetime1, 63, var8Lifetime1, tb.field_cb);
            }
          }
        } else {
          var4_ref = kd.field_a;
        }
        if (var4_ref != null) {
          InteractiveGameClient.a(178, ContextActionController.field_g, var4_ref, 357, 243, 2, 15);
        }
        this.packSelector.draw(117);
    }

    final void advanceScreen(boolean updateFlag, boolean inputEnabled, int obfuscationGuard) {
        super.advanceScreen(updateFlag, inputEnabled, -100);
        if (obfuscationGuard >= -52) {
          return;
        }
        if (QuickChatMenu.h(-26090)) {
          return;
        }
        if (rf.field_g == null) {
          rf.field_g = WidgetLayerStack.requestTableData(-2, this.packIndex, 2, 10, 3);
        }
        this.packSelector.updatePointerSelection(111);
    }

    static {
        field_v = 0;
    }
}
