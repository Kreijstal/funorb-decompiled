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

    final static void writeReflectionCheckResponse(BitPacketBuffer packet, byte obfuscationGuard) {
        try {
          int operationIndex = 0;
          int argumentIndex = 0;
          RuntimeException failureContext = null;
          StringBuilder contextBuilder = null;
          String packetSummary = null;
          Throwable caughtFailure = null;
          RuntimeException responseFailure = null;
          int lookupPending = 0;
          int lookupIndexOrResponseStart = 0;
          int operation = 0;
          ClassNotFoundException missingArgumentType = null;
          InvalidClassException incompatibleArgumentClass = null;
          StreamCorruptedException corruptArgumentStream = null;
          OptionalDataException unexpectedPrimitiveData = null;
          IllegalAccessException memberAccessDenied = null;
          IllegalArgumentException invalidArguments = null;
          java.lang.reflect.InvocationTargetException invocationFailure = null;
          SecurityException securityFailure = null;
          IOException argumentIoFailure = null;
          NullPointerException nullReference = null;
          Exception operationFailure = null;
          Throwable operationThrowable = null;
          int fieldValueOrModifiers = 0;
          Object[] arguments = null;
          Object result = null;
          ObjectInputStream argumentStream = null;
          int unusedGameFlag = 0;
          ReflectionCheck queuedRequest = null;
          java.lang.reflect.Field readField = null;
          Object var16 = null;
          java.lang.reflect.Field writeFieldReference = null;
          ReflectionCheck request = null;
          Object var18 = null;
          java.lang.reflect.Field writeField = null;
          Object var20 = null;
          Object var22 = null;
          byte[][] serializedArguments = null;
          java.lang.reflect.Field modifierField = null;
          java.lang.reflect.Method modifierMethod = null;
          java.lang.reflect.Method invokedMethod = null;
          int methodModifiers;
          var18 = null;
          var16 = null;
          var20 = null;
          var22 = null;
          unusedGameFlag = BrickABrac.field_J ? 1 : 0;
          try {
            queuedRequest = (ReflectionCheck) (ResourceArchive.pendingReflectionChecks.first(-48));
            request = queuedRequest;
            if (request == null) {
              return;
            }
            lookupPending = 0;
            for (lookupIndexOrResponseStart = 0; request.operationCount > lookupIndexOrResponseStart; lookupIndexOrResponseStart++) {
              if (null != queuedRequest.fieldTasks[lookupIndexOrResponseStart]) {
                if (queuedRequest.fieldTasks[lookupIndexOrResponseStart].status == 2) {
                  queuedRequest.operationErrors[lookupIndexOrResponseStart] = -5;
                }
                if (0 == queuedRequest.fieldTasks[lookupIndexOrResponseStart].status) {
                  lookupPending = 1;
                }
              }
              if (queuedRequest.methodTasks[lookupIndexOrResponseStart] != null) {
                if (2 == queuedRequest.methodTasks[lookupIndexOrResponseStart].status) {
                  queuedRequest.operationErrors[lookupIndexOrResponseStart] = -6;
                }
                if (0 == queuedRequest.methodTasks[lookupIndexOrResponseStart].status) {
                  lookupPending = 1;
                }
              }
            }
            if (lookupPending != 0) {
              return;
            }
            lookupIndexOrResponseStart = packet.position;
            packet.writeInt(request.requestId, (byte) -79);
            for (operationIndex = 0; request.operationCount > operationIndex; operationIndex++) {
              if (request.operationErrors[operationIndex] == 0) {
                try {
                  operation = request.operations[operationIndex];
                  if (operation == 0) {
                    readField = (java.lang.reflect.Field) (request.fieldTasks[operationIndex].result);
                    fieldValueOrModifiers = readField.getInt((Object) null);
                    packet.writeByte(-7, 0);
                    packet.writeInt(fieldValueOrModifiers, (byte) -79);
                  } else {
                    if (operation == 1) {
                      writeFieldReference = (java.lang.reflect.Field) (request.fieldTasks[operationIndex].result);
                      writeField = writeFieldReference;
                      writeField.setInt((Object) null, request.fieldSetValues[operationIndex]);
                      packet.writeByte(-15, 0);
                    } else {
                      if (operation == 2) {
                        modifierField = (java.lang.reflect.Field) (request.fieldTasks[operationIndex].result);
                        fieldValueOrModifiers = modifierField.getModifiers();
                        packet.writeByte(obfuscationGuard - 4, 0);
                        packet.writeInt(fieldValueOrModifiers, (byte) -79);
                      }
                    }
                  }
                  if (operation == 3) {
                    invokedMethod = (java.lang.reflect.Method) (request.methodTasks[operationIndex].result);
                    serializedArguments = request.serializedArguments[operationIndex];
                    arguments = new Object[serializedArguments.length];
                    for (argumentIndex = 0; serializedArguments.length > argumentIndex; argumentIndex++) {
                      argumentStream = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(serializedArguments[argumentIndex])));
                      arguments[argumentIndex] = argumentStream.readObject();
                    }
                    result = invokedMethod.invoke((Object) null, arguments);
                    if (result == null) {
                      packet.writeByte(obfuscationGuard ^ 61, 0);
                    } else if (result instanceof Number) {
                      packet.writeByte(obfuscationGuard ^ -114, 1);
                      packet.writeLong(-23054, ((Number) (result)).longValue());
                    } else if (!(result instanceof String)) {
                      packet.writeByte(22, 4);
                    } else {
                      packet.writeByte(obfuscationGuard ^ -103, 2);
                      packet.writeCp1252String((String) (result), -1);
                    }
                  } else {
                    if (operation == 4) {
                      modifierMethod = (java.lang.reflect.Method) (request.methodTasks[operationIndex].result);
                      methodModifiers = modifierMethod.getModifiers();
                      packet.writeByte(-123, 0);
                      packet.writeInt(methodModifiers, (byte) -79);
                    }
                  }
                } catch (java.lang.ClassNotFoundException caughtMissingArgumentType) {
                  caughtFailure = caughtMissingArgumentType;
                  missingArgumentType = (ClassNotFoundException) (Object) caughtFailure;
                  packet.writeByte(80, -10);
                } catch (java.io.InvalidClassException caughtIncompatibleArgumentClass) {
                  caughtFailure = caughtIncompatibleArgumentClass;
                  incompatibleArgumentClass = (InvalidClassException) (Object) caughtFailure;
                  packet.writeByte(obfuscationGuard - 127, -11);
                } catch (java.io.StreamCorruptedException caughtCorruptArgumentStream) {
                  caughtFailure = caughtCorruptArgumentStream;
                  corruptArgumentStream = (StreamCorruptedException) (Object) caughtFailure;
                  packet.writeByte(obfuscationGuard ^ -126, -12);
                } catch (java.io.OptionalDataException caughtUnexpectedPrimitiveData) {
                  caughtFailure = caughtUnexpectedPrimitiveData;
                  unexpectedPrimitiveData = (OptionalDataException) (Object) caughtFailure;
                  packet.writeByte(obfuscationGuard - 16, -13);
                } catch (java.lang.IllegalAccessException caughtMemberAccessDenied) {
                  caughtFailure = caughtMemberAccessDenied;
                  memberAccessDenied = (IllegalAccessException) (Object) caughtFailure;
                  packet.writeByte(109, -14);
                } catch (java.lang.IllegalArgumentException caughtInvalidArguments) {
                  caughtFailure = caughtInvalidArguments;
                  invalidArguments = (IllegalArgumentException) (Object) caughtFailure;
                  packet.writeByte(-126, -15);
                } catch (java.lang.reflect.InvocationTargetException caughtInvocationFailure) {
                  caughtFailure = caughtInvocationFailure;
                  invocationFailure = (java.lang.reflect.InvocationTargetException) (Object) caughtFailure;
                  packet.writeByte(-114, -16);
                } catch (java.lang.SecurityException caughtSecurityFailure) {
                  caughtFailure = caughtSecurityFailure;
                  securityFailure = (SecurityException) (Object) caughtFailure;
                  packet.writeByte(71, -17);
                } catch (java.io.IOException caughtArgumentIoFailure) {
                  caughtFailure = caughtArgumentIoFailure;
                  argumentIoFailure = (IOException) (Object) caughtFailure;
                  packet.writeByte(-111, -18);
                } catch (java.lang.NullPointerException caughtNullReference) {
                  caughtFailure = caughtNullReference;
                  nullReference = (NullPointerException) (Object) caughtFailure;
                  packet.writeByte(obfuscationGuard - 112, -19);
                } catch (java.lang.Exception caughtOperationFailure) {
                  caughtFailure = caughtOperationFailure;
                  operationFailure = (Exception) (Object) caughtFailure;
                  packet.writeByte(101, -20);
                } catch (java.lang.Throwable caughtOperationThrowable) {
                  caughtFailure = caughtOperationThrowable;
                  operationThrowable = caughtFailure;
                  packet.writeByte(87, -21);
                }
              } else {
                packet.writeByte(87, request.operationErrors[operationIndex]);
              }
            }
            if (obfuscationGuard != 9) {
              HighscoresScreen.foldPlayerNameCharacter(-62, '&');
            }
            packet.appendCrc32(3, lookupIndexOrResponseStart);
            request.unlink((byte) 111);
            return;
          } catch (java.lang.RuntimeException caughtResponseFailure) {
            caughtFailure = caughtResponseFailure;
            responseFailure = (RuntimeException) (Object) caughtFailure;
            failureContext = responseFailure;
            contextBuilder = new StringBuilder().append("ah.B(");
            if (packet == null) {
              packetSummary = "null";
            } else {
              packetSummary = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(packetSummary).append(',').append(obfuscationGuard).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedFailure) {
          throw uncheckedFailure;
        } catch (Throwable checkedFailure) {
          throw new RuntimeException(checkedFailure);
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
        ContextActionController.field_g.drawCentered(CanvasResizeController.packNames[this.packIndex], 357, 1 + (-ContextActionController.field_g.xHeight + 178), 0, -1);
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
              this.a(-1, var9Lifetime1, var2Lifetime1, 1, var10Lifetime1, 63, var8Lifetime1, LoadingProgressDialog.field_cb);
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
