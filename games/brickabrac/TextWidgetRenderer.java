/*
 * Decompiled by CFR-JS 0.4.0.
 */
class TextWidgetRenderer implements WidgetRenderer, WidgetLayoutProvider {
    static int[] quarterSineQ16;
    int topInset;
    static int[] underwaterBackgroundColors;
    int bottomInset;
    TextFont font;
    int lineSpacing;
    int selectionArgb;
    static UiComponent field_b;
    static RgbSprite field_p;
    static boolean field_t;
    int textColor;
    int verticalAlignment;
    int rightInset;
    static MeshAttributeRecord[] meshAttributeRecords;
    private int shadowColor;
    static boolean field_e;
    int horizontalAlignment;
    int caretColor;
    int leftInset;
    static RgbSprite[] desertCentreSprites;
    private boolean wrapText;

    final static void readReflectionCheckRequest(int unusedRequestContext, PacketBuffer packet, byte obfuscationGuard, PlatformServices services) {
        try {
          int operationIndex = 0;
          int parameterIndex = 0;
          int argumentIndex = 0;
          byte[] argumentBytes = null;
          RuntimeException failureContext = null;
          StringBuilder contextBuilder = null;
          String packetSummary = null;
          StringBuilder serviceContextBuilder = null;
          String serviceSummary = null;
          Throwable caughtFailure = null;
          RuntimeException failure = null;
          int guardArithmetic = 0;
          int operation = 0;
          ClassNotFoundException missingType = null;
          SecurityException lookupDenied = null;
          NullPointerException missingReference = null;
          Exception lookupFailure = null;
          Throwable lookupThrowable = null;
          String fieldOwnerName = null;
          String fieldName = null;
          int parameterCountOrFieldValue = 0;
          String[] parameterTypeNames = null;
          byte[][] serializedArguments = null;
          Class[] parameterTypes = null;
          int argumentLength = 0;
          int unusedGameFlag = 0;
          String parsedFieldOwner = null;
          String parsedFieldName = null;
          int typeIndex = 0;
          ReflectionCheck request = null;
          byte[][] argumentArrayReference = null;
          String methodOwnerName = null;
          String methodName = null;
          byte[][] argumentArrays = null;
          int unusedTypeIndex;
          unusedGameFlag = BrickABrac.field_J ? 1 : 0;
          try {
            request = new ReflectionCheck();
            request.operationCount = packet.readUnsignedByte(255);
            request.requestId = packet.readInt(255);
            request.fieldSetValues = new int[request.operationCount];
            request.operationErrors = new int[request.operationCount];
            request.operations = new int[request.operationCount];
            guardArithmetic = 24 / ((-6 - obfuscationGuard) / 53);
            request.methodTasks = new PlatformTask[request.operationCount];
            request.serializedArguments = new byte[request.operationCount][][];
            request.fieldTasks = new PlatformTask[request.operationCount];
            for (operationIndex = 0; request.operationCount > operationIndex; operationIndex++) {
              try {
                operation = packet.readUnsignedByte(255);
                if (0 != operation &&
                  1 != operation &&
                  operation != 2) {
                  if (3 == operation ||
                    operation == 4) {
                    methodOwnerName = packet.readCp1252String(-1);
                    methodName = packet.readCp1252String(-1);
                    parameterCountOrFieldValue = packet.readUnsignedByte(255);
                    parameterTypeNames = new String[parameterCountOrFieldValue];
                    for (parameterIndex = 0; parameterIndex < parameterCountOrFieldValue; parameterIndex++) {
                      parameterTypeNames[parameterIndex] = packet.readCp1252String(-1);
                    }
                    argumentArrays = new byte[parameterCountOrFieldValue][];
                    argumentArrayReference = argumentArrays;
                    serializedArguments = argumentArrayReference;
                    if (operation == 3) {
                      for (argumentIndex = 0; parameterCountOrFieldValue > argumentIndex; argumentIndex++) {
                        argumentLength = packet.readInt(255);
                        argumentBytes = new byte[argumentLength];
                        serializedArguments[argumentIndex] = argumentBytes;
                        packet.readBytes(0, argumentArrays[argumentIndex], 115, argumentLength);
                      }
                    }
                    request.operations[operationIndex] = operation;
                    parameterTypes = new Class[parameterCountOrFieldValue];
                    typeIndex = 0;
                    unusedTypeIndex = typeIndex;
                    while (parameterCountOrFieldValue > typeIndex) {
                      parameterTypes[typeIndex] = DebouncedValidationSource.resolveReflectionType(parameterTypeNames[typeIndex], true);
                      typeIndex++;
                    }
                    request.methodTasks[operationIndex] = services.lookupMethod(23311, DebouncedValidationSource.resolveReflectionType(methodOwnerName, true), parameterTypes, methodName);
                    request.serializedArguments[operationIndex] = argumentArrays;
                  }
                } else {
                  parsedFieldOwner = packet.readCp1252String(-1);
                  fieldOwnerName = parsedFieldOwner;
                  parsedFieldName = packet.readCp1252String(-1);
                  fieldName = parsedFieldName;
                  parameterCountOrFieldValue = 0;
                  if (operation == 1) {
                    parameterCountOrFieldValue = packet.readInt(255);
                  }
                  request.operations[operationIndex] = operation;
                  request.fieldSetValues[operationIndex] = parameterCountOrFieldValue;
                  request.fieldTasks[operationIndex] = services.lookupField(124, DebouncedValidationSource.resolveReflectionType(parsedFieldOwner, true), parsedFieldName);
                }
              } catch (java.lang.ClassNotFoundException caughtMissingType) {
                caughtFailure = caughtMissingType;
                missingType = (ClassNotFoundException) (Object) caughtFailure;
                request.operationErrors[operationIndex] = -1;
              } catch (java.lang.SecurityException caughtLookupDenied) {
                caughtFailure = caughtLookupDenied;
                lookupDenied = (SecurityException) (Object) caughtFailure;
                request.operationErrors[operationIndex] = -2;
              } catch (java.lang.NullPointerException caughtMissingReference) {
                caughtFailure = caughtMissingReference;
                missingReference = (NullPointerException) (Object) caughtFailure;
                request.operationErrors[operationIndex] = -3;
              } catch (java.lang.Exception caughtLookupFailure) {
                caughtFailure = caughtLookupFailure;
                lookupFailure = (Exception) (Object) caughtFailure;
                request.operationErrors[operationIndex] = -4;
              } catch (java.lang.Throwable caughtLookupThrowable) {
                caughtFailure = caughtLookupThrowable;
                lookupThrowable = caughtFailure;
                request.operationErrors[operationIndex] = -5;
              }
            }
            ResourceArchive.pendingReflectionChecks.addLast(request, (byte) 3);
            return;
          } catch (java.lang.RuntimeException caughtRequestFailure) {
            caughtFailure = caughtRequestFailure;
            failure = (RuntimeException) (Object) caughtFailure;
            failureContext = failure;
            contextBuilder = new StringBuilder().append("um.BA(").append(unusedRequestContext).append(',');
            if (packet == null) {
              packetSummary = "null";
            } else {
              packetSummary = "{...}";
            }
            serviceContextBuilder = ((StringBuilder) (Object) contextBuilder).append(packetSummary).append(',').append(obfuscationGuard).append(',');
            if (services == null) {
              serviceSummary = "null";
            } else {
              serviceSummary = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) serviceContextBuilder).append(serviceSummary).append(')').toString());
          }
        } catch (RuntimeException | Error uncheckedFailure) {
          throw uncheckedFailure;
        } catch (Throwable checkedFailure) {
          throw new RuntimeException(checkedFailure);
        }
    }

    public final int getTextOriginX(Widget widget, byte obfuscationGuard, int parentX) {
        RuntimeException var4 = null;
        Widget var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= 40) {
            var5 = (Widget) null;
            this.getTextOriginX((Widget) null, (byte) -5, -108);
          }
          stackIn_3_0 = this.computeTextX(0, widget, 65263, parentX);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("um.T(");
          if (widget == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(',').append(parentX).append(')').toString());
        }
    }

    TextWidgetRenderer(TextFont font, int horizontalInset, int verticalInset, int textColor, int shadowColor, int horizontalAlignment, int verticalAlignment, int lineSpacing) {
        this(font, horizontalInset, horizontalInset, verticalInset, verticalInset, textColor, shadowColor, horizontalAlignment, verticalAlignment, lineSpacing, -1, 2147483647, false);
    }

    private final void paintText(int obfuscationGuard, int parentX, int parentY, Widget widget) {
        try {
          int var5_int = 64 / ((obfuscationGuard - 64) / 58);
          this.paintTextRun(0, 0, this.shadowColor, parentY, this.textColor, (byte) -56, parentX, widget);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "um.R(" + obfuscationGuard + ',' + parentX + ',' + parentY + ',' + (widget != null ? "{...}" : "null") + ')');
        }
    }

    public final int getTextAreaWidth(int obfuscationGuard, Widget widget) {
        RuntimeException var3 = null;
        ResourceArchive var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 61823) {
            var4 = (ResourceArchive) null;
            TextWidgetRenderer.a((String) null, (String) null, -49, (ResourceArchive) null);
          }
          stackIn_3_0 = -this.leftInset + (widget.width - this.rightInset);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("um.C(").append(obfuscationGuard).append(',');
          if (widget == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void paintTextCaret(Widget widget, int parentX, int caretIndex, int parentY, byte obfuscationGuard) {
        int var7 = 0;
        TextLineLayout var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        WidgetTextLayout var13 = null;
        WidgetTextLayout var14 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_5_3;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (widget.isFocused(-83)) {
            var13 = this.getTextLayout(widget, 121);
            var14 = var13;
            var7 = var14.findLineIndex(caretIndex, true);
            var8 = var13.lines[var7];
            var9 = var14.getCaretX(caretIndex, (byte) -72);
            var10 = this.computeTextX(var9, widget, 65263, parentX);
            var11 = this.getTextOriginY(parentY, (byte) -116, widget) + Math.max(0, var8.top);
            stackIn_4_0 = this.getTextOriginY(parentY, (byte) -96, widget);
            stackIn_4_1 = this.getTextAreaHeight(16265, widget);
            stackIn_4_2 = var8.bottom;
            if (1 + var7 >= var14.lines.length) {
              stackIn_5_3 = var8.bottom;
            } else {
              stackIn_5_3 = var13.lines[1 + var7].top;
            }
            var12 = stackIn_4_0 + Math.min(stackIn_4_1, Math.min(stackIn_4_2, stackIn_5_3));
            MovingBody.a((byte) 125, widget.width + parentX + widget.x, widget.x + parentX, parentY + widget.y, widget.height + parentY + widget.y);
            PopupWidgetLayer.widgetTheme.a(this.caretColor, var10, var11, 91, var12, var10);
            sc.popRaster(-94);
          }
          if (obfuscationGuard <= 118) {
            this.leftInset = -19;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("um.B(");
          if (widget == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(parentX).append(',').append(caretIndex).append(',').append(parentY).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final int computeTextX(int localX, Widget widget, int obfuscationGuard, int parentX) {
        RuntimeException var5 = null;
        Widget var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 65263) {
            var6 = (Widget) null;
            this.getTextAreaWidth(41, (Widget) null);
          }
          stackIn_3_0 = localX + widget.textOffsetX + parentX + (widget.x + this.leftInset);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("um.U(").append(localX).append(',');
          if (widget == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(',').append(parentX).append(')').toString());
        }
    }

    public final WidgetTextLayout getTextLayout(Widget widget, int obfuscationGuard) {
        int var3_int = 0;
        RuntimeException var3 = null;
        WidgetTextLayout stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (widget.textLayout == null) {
            widget.textLayout = (WidgetTextLayout) ((Object) new RichTextLayout());
          }
          var3_int = -14 / ((obfuscationGuard - 49) / 43);
          if (this.wrapText) {
            ((RichTextLayout) (widget.textLayout)).layoutWrapped(this.getDisplayText(widget, true), this.horizontalAlignment, 122, this.getTextAreaHeight(16265, widget), this.lineSpacing, this.getTextAreaWidth(61823, widget), this.verticalAlignment, this.font);
          } else {
            this.layoutSingleLine((byte) 6, widget);
          }
          stackIn_6_0 = widget.textLayout;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("um.N(");
          if (widget == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final int findTextSourceOffset(Widget widget, int pointerX, boolean obfuscationGuard, int parentY, int pointerY, int parentX) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!obfuscationGuard) {
            stackIn_2_0 = 64;
            return stackIn_2_0;
          }
          this.getTextLayout(widget, 121);
          stackIn_4_0 = widget.textLayout.findSourceOffset(-this.getTextOriginX(widget, (byte) 48, parentX) + pointerX, false, pointerY - this.getTextOriginY(parentY, (byte) -122, widget));
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("um.O(");
          if (widget == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(pointerX).append(',').append(obfuscationGuard).append(',').append(parentY).append(',').append(pointerY).append(',').append(parentX).append(')').toString());
        }
    }

    final static void requestCancelOpponentSearch(int obfuscationGuard, int opcode) {
        if (obfuscationGuard != 200) {
          field_b = (UiComponent) null;
        }
        BitPacketBuffer packet = TextFieldValidator.outgoingPackets;
        packet.writeCipheredOpcode(obfuscationGuard ^ -13485, opcode);
        packet.writeByte(87, 1);
        packet.writeByte(-121, 3);
    }

    final static boolean ensureGamePacketBody(byte obfuscationGuard) {
        if (ga.incomingPacketLength == -1) {
          if (!PacketReceiveHelpers.ensureGamePacketBytes(20, 1)) {
            return false;
          }
          ga.incomingPacketLength = LogoRenderHelpers.incomingPackets.readUnsignedByte(255);
          LogoRenderHelpers.incomingPackets.position = 0;
        }
        if (obfuscationGuard > -40) {
          desertCentreSprites = (RgbSprite[]) null;
        }
        if (-2 == ga.incomingPacketLength) {
          if (!PacketReceiveHelpers.ensureGamePacketBytes(20, 2)) {
            return false;
          }
          ga.incomingPacketLength = LogoRenderHelpers.incomingPackets.readUnsignedShort(65280);
          LogoRenderHelpers.incomingPackets.position = 0;
        }
        return PacketReceiveHelpers.ensureGamePacketBytes(20, ga.incomingPacketLength);
    }

    public final int getPreferredWidth(Widget widget, int obfuscationGuard) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.getTextLayout(widget, -118);
          if (obfuscationGuard > 24) {
            stackIn_4_0 = widget.textLayout.getRightEdge(31458) - (-this.leftInset - this.rightInset);
            return stackIn_4_0;
          }
          stackIn_2_0 = 74;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("um.J(");
          if (widget == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final int computeTextY(byte obfuscationGuard, int parentY, int localY, Widget widget) {
        RuntimeException var5 = null;
        Widget var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard < 103) {
            var6 = (Widget) null;
            this.layoutSingleLine((byte) -127, (Widget) null);
          }
          stackIn_3_0 = widget.textOffsetY + parentY - (-widget.y - this.topInset) + localY;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("um.L(").append(obfuscationGuard).append(',').append(parentY).append(',').append(localY).append(',');
          if (widget == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void copyStyleTo(int obfuscationGuard, TextWidgetRenderer target) {
        try {
          target.textColor = this.textColor;
          target.lineSpacing = this.lineSpacing;
          target.verticalAlignment = this.verticalAlignment;
          target.selectionArgb = this.selectionArgb;
          target.leftInset = this.leftInset;
          target.topInset = this.topInset;
          target.shadowColor = this.shadowColor;
          target.rightInset = this.rightInset;
          target.horizontalAlignment = this.horizontalAlignment;
          target.bottomInset = this.bottomInset;
          if (obfuscationGuard > -7) {
            underwaterBackgroundColors = (int[]) null;
          }
          target.font = this.font;
          target.wrapText = this.wrapText;
          target.caretColor = this.caretColor;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "um.W(" + obfuscationGuard + ',' + (target != null ? "{...}" : "null") + ')');
        }
    }

    final static RgbSprite a(String param0, String param1, int param2, ResourceArchive param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RgbSprite stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param3.getGroupId(param0, false);
          if (param2 != 1593955777) {
            field_p = (RgbSprite) null;
          }
          var5 = param3.getFileId(var4_int, param2 - 1593955846, param1);
          stackIn_3_0 = TextLineLayout.a(param3, var4_int, var5, 1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("um.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final int getTextAreaHeight(int obfuscationGuard, Widget widget) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 16265) {
            quarterSineQ16 = (int[]) null;
          }
          stackIn_3_0 = -this.bottomInset + (widget.height - this.topInset);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("um.D(").append(obfuscationGuard).append(',');
          if (widget == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public void paintWidget(boolean obfuscationGuard, int callbackGuard, int parentX, Widget widget, int parentY) {
        if (null == this.font) {
          return;
        }
        try {
          this.paintText(-94, parentX, parentY, widget);
          if (callbackGuard != -20618) {
            quarterSineQ16 = (int[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "um.AA(" + obfuscationGuard + ',' + callbackGuard + ',' + parentX + ',' + (widget != null ? "{...}" : "null") + ',' + parentY + ')');
        }
    }

    public final void paintTextSelection(int obfuscationGuard, int parentY, int parentX, int selectionAnchor, int caretIndex, Widget widget) {
        int var12 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        TextLineLayout var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        WidgetTextLayout var17 = null;
        WidgetTextLayout var18 = null;
        var16 = BrickABrac.field_J ? 1 : 0;
        try {
          if (caretIndex == selectionAnchor) {
            return;
          }
          if (obfuscationGuard != -15964) {
            return;
          }
          if (widget.isFocused(-76)) {
            var17 = this.getTextLayout(widget, 106);
            var18 = var17;
            if (selectionAnchor < caretIndex) {
              var8 = selectionAnchor;
              var9 = caretIndex;
            } else {
              var8 = caretIndex;
              var9 = selectionAnchor;
            }
            var10 = var18.findLineIndex(var8, true);
            var11 = var18.findLineIndex(var9, true);
            MovingBody.a((byte) 127, widget.x + parentX + widget.width, parentX + widget.x, widget.y + parentY, widget.height + (widget.y + parentY));
            for (var12 = var10; var12 <= var11; var12++) {
              var13 = var17.lines[var12];
              if (var10 != var12) {
                stackIn_16_0 = var13.caretX[0];
              } else {
                stackIn_16_0 = var18.getCaretX(var8, (byte) -61);
              }
              var14 = stackIn_16_0;
              if (var12 == var11) {
                stackIn_21_0 = var18.getCaretX(var9, (byte) -102);
              } else {
                if (var13 == null) {
                  stackIn_21_0 = 0;
                } else {
                  stackIn_21_0 = var13.caretX[var13.caretX.length - 1];
                }
              }
              var15 = stackIn_21_0;
              PopupWidgetLayer.widgetTheme.a(var13.top + this.topInset + (widget.y + (parentY + widget.textOffsetY)), this.selectionArgb >>> 24, this.selectionArgb, this.computeTextX(var14, widget, 65263, parentX), var13.bottom, (byte) 55, var15 - var14);
            }
            sc.popRaster(-98);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_26_0 = var7;
          stackIn_26_1 = new StringBuilder().append("um.I(").append(obfuscationGuard).append(',').append(parentY).append(',').append(parentX).append(',').append(selectionAnchor).append(',').append(caretIndex).append(',');
          if (widget == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    private final void layoutSingleLine(byte obfuscationGuard, Widget widget) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int textAreaWidth = 0;
        RuntimeException var3 = null;
        int textAreaHeight = 0;
        int baselineY = 0;
        int verticalAlignment = 0;
        int var7 = 0;
        Widget var8 = null;
        int horizontalAlignment;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          if (null == widget.textLayout) {
            widget.textLayout = (WidgetTextLayout) ((Object) new RichTextLayout());
          }
          textAreaWidth = this.getTextAreaWidth(61823, widget);
          textAreaHeight = this.getTextAreaHeight(16265, widget);
          if (obfuscationGuard != 6) {
            var8 = (Widget) null;
            this.getTextOriginX((Widget) null, (byte) 6, -90);
          }
          verticalAlignment = this.verticalAlignment;
          if (verticalAlignment != 0) {
            if (2 != verticalAlignment) {
              if (verticalAlignment != 3 &&
                verticalAlignment == 1) {
              }
              baselineY = (-this.font.descent + textAreaHeight - this.font.ascent >> 1) + this.font.ascent;
            } else {
              baselineY = textAreaHeight - this.font.descent;
            }
          } else {
            baselineY = this.font.ascent;
          }
          horizontalAlignment = this.horizontalAlignment;
          if (horizontalAlignment != 0 &&
            horizontalAlignment != 3) {
            if (1 == horizontalAlignment) {
              if (!(widget.textLayout instanceof RichTextLayout)) {
                return;
              }
              ((RichTextLayout) (widget.textLayout)).layoutCentered(this.getDisplayText(widget, true), baselineY, this.font, textAreaWidth >> 1, 1);
              return;
            }
            if (horizontalAlignment != 2) {
              return;
            }
            if (!(widget.textLayout instanceof RichTextLayout)) {
              return;
            }
            ((RichTextLayout) (widget.textLayout)).layoutRightAligned(this.getDisplayText(widget, true), this.font, textAreaWidth, (byte) -115, baselineY);
            return;
          }
          if (widget.textLayout instanceof RichTextLayout) {
            ((RichTextLayout) (widget.textLayout)).layoutLeftAligned(this.font, baselineY, 0, this.getDisplayText(widget, true), 0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("um.M(").append(obfuscationGuard).append(',');
          if (widget == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, boolean param2, int param3, int param4, int param5, byte param6) {
        int var19_int = 0;
        int var23_int = 0;
        UiComponent dupTemp$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        ScrollPane stackIn_3_0;
        int stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        int stackIn_3_4;
        boolean stackIn_3_5;
        boolean stackIn_4_6;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        LobbyGame stackIn_10_0;
        UiComponent stackIn_10_1;
        UiComponent stackIn_10_2;
        long stackIn_10_3;
        UiComponent stackIn_11_1 = null;
        UiComponent stackIn_11_2 = null;
        UiComponent stackIn_11_4 = null;
        LobbyGame stackIn_27_0;
        UiComponent stackIn_27_1;
        UiComponent stackIn_27_2;
        long stackIn_27_3;
        UiComponent stackIn_28_1;
        UiComponent stackIn_28_2;
        UiComponent stackIn_28_4;
        int stackIn_32_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_77_0 = 0;
        RgbSprite[] stackIn_79_0 = null;
        int stackIn_80_1 = 0;
        RgbSprite[] stackIn_87_0 = null;
        int stackIn_88_1 = 0;
        String stackIn_148_0 = null;
        String stackIn_158_0 = null;
        String stackIn_164_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        NodeDeque var8 = null;
        long var9 = 0L;
        Object var11 = null;
        int var12 = 0;
        LobbyGame var13 = null;
        int var14 = 0;
        int var15 = 0;
        UiComponent var19 = null;
        UiComponent var20 = null;
        UiComponent var21 = null;
        UiComponent var22 = null;
        UiComponent var23 = null;
        UiComponent var24 = null;
        UiComponent var25 = null;
        UiComponent var26 = null;
        UiComponent var27 = null;
        UiComponent var28 = null;
        UiComponent var29 = null;
        UiComponent var30 = null;
        UiComponent var31 = null;
        int var32 = 0;
        String var33 = null;
        int var34_int = 0;
        String var34 = null;
        int var35_int = 0;
        String var35 = null;
        Object var36 = null;
        int var37 = 0;
        int var38_int = 0;
        StringBuilder var38 = null;
        int var39_int = 0;
        String var39 = null;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        RgbSprite var43 = null;
        UiComponent var44 = null;
        UiComponent var45 = null;
        UiComponent var46 = null;
        UiComponent var47 = null;
        UiComponent var48 = null;
        UiComponent var49 = null;
        UiComponent var50 = null;
        Object var51 = null;
        RgbSprite var51_ref = null;
        Object var52 = null;
        RgbSprite var52_ref = null;
        Object var53 = null;
        RgbSprite var53_ref = null;
        Object var54 = null;
        RgbSprite var54_ref = null;
        RgbSprite var55 = null;
        String var35Lifetime1;
        String var35Lifetime2;
        int var15Lifetime1;
        int var34_intLifetime1;
        int var35_intLifetime1;
        int var35_intLifetime2;
        int var37Lifetime1;
        int var37Lifetime2;
        int var38_intLifetime1;
        int var39_intLifetime1;
        int var40Lifetime1;
        var51 = null;
        var52 = null;
        var53 = null;
        var54 = null;
        var42 = BrickABrac.field_J ? 1 : 0;
        try {
          stackIn_3_0 = rl.field_e;
          stackIn_3_1 = 2;
          stackIn_3_2 = (np.uiRowHeight * 4 + 8) * param3;
          stackIn_3_3 = 2 * (2 + np.uiRowHeight);
          stackIn_3_4 = 22676;
          stackIn_3_5 = param2;
          stackIn_4_6 = (rl.field_e == ClientResourceHelpers.field_b);
          var7_int = ((ScrollPane) (Object) stackIn_3_0).updateContentLayout(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4, stackIn_3_5, stackIn_4_6) ? 1 : 0;
          var8 = rl.field_e.content.children;
          var9 = MonotonicTime.nowMillis(false);
          var12 = -30 / ((param6 + 26) / 55);
          var11 = null;
          var13 = (LobbyGame) (var8.first(-64));
          while (var13 != null) {
            var14 = 0;
            if (null == var13.children) {
              var13.field_Ac = new UiComponent(0L, OptionsScreen.field_v);
              stackIn_8_0 = param1;
              stackIn_8_1 = param5;
              var15 = stackIn_8_0 | stackIn_8_1;
              var13.addChild(var13.field_Ac, 0);
              var13.field_Ac.horizontalAlignment = 1;
              var13.field_Vb = new UiComponent(0L, TextFieldWidget.field_K);
              var13.addChild(var13.field_Vb, 0);
              var13.field_tc = new UiComponent(0L, OptionsScreen.field_v);
              var13.addChild(var13.field_tc, 0);
              var13.field_tc.textInset = 0;
              var13.field_Cc = new UiComponent(0L, OptionsScreen.field_v);
              var13.addChild(var13.field_Cc, 0);
              var13.field_Cc.textInset = 0;
              var13.field_mc = new UiComponent(0L, TextFieldWidget.field_K);
              var13.addChild(var13.field_mc, 0);
              var13.field_mc.horizontalAlignment = 2;
              stackIn_10_0 = var13;
              stackIn_10_1 = null;
              stackIn_10_2 = null;
              stackIn_10_3 = 0L;
              if (PacketReceiveHelpers.field_e) {
                stackIn_11_1 = null;
                stackIn_11_2 = null;
                stackIn_11_4 = OptionsScreen.field_v;
              } else {
                stackIn_11_1 = null;
                stackIn_11_2 = null;
                stackIn_11_4 = TextFieldWidget.field_K;
              }
              stackIn_10_0.field_ec = new UiComponent(stackIn_10_3, stackIn_11_4);
              var13.addChild(var13.field_ec, 0);
              var13.field_Ec = new UiComponent[RankingsRequest.gameSettingCount];
              var13.field_sc = new UiComponent(0L, (UiComponent) null);
              if ((1 << BackgroundRegistry.field_c & var15) != 0) {
                var13.field_ec.addChild(var13.field_sc, 0);
              }
              var13.field_Yb = new UiComponent(0L, (UiComponent) null);
              if ((1 << MotionWaypoint.field_q & var15) != 0) {
                var13.field_ec.addChild(var13.field_Yb, 0);
              }
              var13.field_Bc = new UiComponent(0L, (UiComponent) null);
              if ((1 << u.field_a & var15) != 0) {
                var13.field_ec.addChild(var13.field_Bc, 0);
              }
              var13.field_lc = new UiComponent(0L, (UiComponent) null);
              if ((1 << ScrollPane.field_Pb & var15) != 0) {
                var13.field_ec.addChild(var13.field_lc, 0);
              }
              var46 = var13.field_sc;
              var45 = var13.field_lc;
              var44 = var13.field_Yb;
              var13.field_Bc.verticalAlignment = 1;
              var44.verticalAlignment = 1;
              var45.verticalAlignment = 1;
              var46.verticalAlignment = 1;
              for (var19_int = 0; RankingsRequest.gameSettingCount > var19_int; var19_int++) {
                var13.field_Ec[var19_int] = new UiComponent(0L, (UiComponent) null);
                if ((var15 & 1 << WidgetLayer.field_K + var19_int) != 0) {
                  var13.field_ec.addChild(var13.field_Ec[var19_int], 0);
                }
                var13.field_Ec[var19_int].verticalAlignment = 1;
              }
              stackIn_27_0 = var13;
              stackIn_27_1 = null;
              stackIn_27_2 = null;
              stackIn_27_3 = 0L;
              if (PacketReceiveHelpers.field_e) {
                stackIn_28_1 = null;
                stackIn_28_2 = null;
                stackIn_28_4 = TextFieldWidget.field_K;
              } else {
                stackIn_28_1 = null;
                stackIn_28_2 = null;
                stackIn_28_4 = OptionsScreen.field_v;
              }
              stackIn_27_0.field_zc = new UiComponent(stackIn_27_3, stackIn_28_4);
              var13.addChild(var13.field_zc, 0);
              var13.field_zc.horizontalAlignment = 2;
              var13.field_Ub = new UiComponent(0L, TextFieldWidget.field_K);
              var13.addChild(var13.field_Ub, 0);
              var13.field_ic = new UiComponent(0L, DualLinkNode.field_t);
              var13.addChild(var13.field_ic, 0);
              var13.field_Sb = new UiComponent(0L, DualLinkNode.field_t);
              var13.addChild(var13.field_Sb, 0);
              var13.field_gc = new UiComponent(0L, CappedUrlRequest.field_l);
              var13.addChild(var13.field_gc, 0);
              var13.markDescendantsToInheritVisualState(true);
              var13.field_nc = new UiComponent(0L, ok.field_d);
              var14 = 1;
              var13.addChild(var13.field_nc, 0);
            }
            var13.field_Ac.text = null;
            stackIn_32_0 = (!var13.started) ? param5 : param1;
            var15Lifetime1 = stackIn_32_0;
            var13.field_Ac.height = 0;
            var47 = var13.field_Ac;
            var47.width = 0;
            var13.field_nc.text = null;
            var13.field_nc.height = 0;
            var48 = var13.field_nc;
            var48.width = 0;
            var13.field_Vb.text = null;
            var49 = var13.field_Vb;
            var13.field_Vb.height = 0;
            var49.width = 0;
            var13.field_tc.text = null;
            var19 = var13.field_tc;
            var13.field_tc.height = 0;
            var13.field_Cc.text = null;
            var19.width = 0;
            var13.field_Cc.height = 0;
            var20 = var13.field_Cc;
            var13.field_mc.text = null;
            var20.width = 0;
            var13.field_mc.height = 0;
            var21 = var13.field_mc;
            var21.width = 0;
            var13.field_ec.text = null;
            var22 = var13.field_ec;
            var13.field_ec.height = 0;
            var22.width = 0;
            for (var23_int = 0; RankingsRequest.gameSettingCount > var23_int; var23_int++) {
              var13.field_Ec[var23_int].sprite = null;
              var24 = var13.field_Ec[var23_int];
              var13.field_Ec[var23_int].height = 0;
              var24.width = 0;
            }
            var13.field_sc.sprite = null;
            var23 = var13.field_sc;
            var13.field_sc.height = 0;
            var13.field_lc.sprite = null;
            var23.width = 0;
            var50 = var13.field_lc;
            var13.field_lc.height = 0;
            var50.width = 0;
            var13.field_Yb.sprite = null;
            var13.field_Yb.height = 0;
            var25 = var13.field_Yb;
            var13.field_Bc.sprite = null;
            var25.width = 0;
            var26 = var13.field_Bc;
            var13.field_Bc.height = 0;
            var26.width = 0;
            var13.field_zc.text = null;
            var27 = var13.field_zc;
            var13.field_zc.height = 0;
            var27.width = 0;
            var13.field_Ub.text = null;
            var13.field_Ub.height = 0;
            var28 = var13.field_Ub;
            var28.width = 0;
            var13.field_ic.text = null;
            var29 = var13.field_ic;
            var13.field_ic.height = 0;
            var29.width = 0;
            var13.field_Sb.text = null;
            var30 = var13.field_Sb;
            var13.field_Sb.height = 0;
            var30.width = 0;
            var13.field_gc.text = null;
            var31 = var13.field_gc;
            var13.field_gc.height = 0;
            var31.width = 0;
            var13.width = rl.field_e.content.width;
            var32 = 0;
            var33 = var13.displayName;
            if (!var13.isUnindexed(107)) {
              boolean decompiledFrameRemainder1 = true;
              if (!var13.started) {
                if (!var13.directJoinAvailable &&
                  !var13.invitationPending) {
                  if (!var13.directJoinEnabled) {
                    var13.field_Ac.text = hm.field_a;
                  } else {
                    var13.field_Ac.text = IntArrayRequest.field_p;
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  var13.field_nc.text = TooltipSprite.field_k;
                }
              } else {
                if (var13.concludedDurationMillis < 0) {
                  if (var13.protocolFlag8 && (var13.directJoinAvailable ||
                    var13.invitationPending)) {
                    var13.field_nc.text = TooltipSprite.field_k;
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (var13.spectatorMode != 2) {
                      var13.field_Ac.text = CanvasResizeController.field_o;
                    } else {
                      var13.field_nc.text = ArrayWidgetGroup.field_I;
                    }
                  }
                } else {
                  var13.field_Ac.text = LobbyPlayer.field_Sb;
                }
              }
              if (null == var13.field_nc.text) {
                var13.field_Ac.setBounds(np.uiRowHeight, var32, 0, 68, (byte) 64);
              } else {
                var13.field_nc.setBounds(np.uiRowHeight, var32, 0, 68, (byte) 64);
              }
              var13.field_Vb.text = TextFont.truncateText(var13.field_Vb.font, var33, 78);
              var13.field_Vb.setBounds(np.uiRowHeight, var32, 70, 78, (byte) 64);
              if (var13.field_Vb.activeInside &&
                !var13.field_Vb.text.equals(var33)) {
                WidgetTextLayout.field_e = var33;
              }
              var13.field_tc.text = Integer.toString(var13.playerCount);
              if (!var13.protocolFlag8) {
                var13.field_tc.horizontalAlignment = 1;
                var13.field_tc.setBounds(np.uiRowHeight, var32, 150, 48, (byte) 64);
              } else {
                var13.field_Cc.text = "/" + var13.maxPlayers;
                var13.field_tc.horizontalAlignment = 2;
                var34_int = (348 - var13.field_Cc.font.measureText("/")) / 2;
                var13.field_tc.setBounds(np.uiRowHeight, var32, 150, -150 + var34_int, (byte) 64);
                var13.field_Cc.setBounds(np.uiRowHeight, var32, var34_int, 198 - var34_int, (byte) 64);
              }
              var13.field_mc.text = Integer.toString(var13.protocolWord16);
              var13.field_mc.setBounds(np.uiRowHeight, var32, 200, 48, (byte) 64);
              stackIn_66_0 = (!PacketReceiveHelpers.field_e) ? 200 : 250;
              var34_intLifetime1 = stackIn_66_0;
              var13.field_ec.setBounds(np.uiRowHeight, var32, var34_intLifetime1, -2 + (365 - var34_intLifetime1), (byte) 64);
              var35_int = QuickChatCategoryDefinition.field_z;
              if ((var15Lifetime1 & 1 << BackgroundRegistry.field_c) != 0) {
                var51_ref = GameClock.field_f[var13.joinSortPriority];
                var13.field_sc.sprite = var51_ref;
                var13.field_sc.setBounds(var13.field_ec.height, 0, var35_int, var51_ref.canvasWidth, (byte) 64);
                var35_int = var35_int + (var51_ref.canvasWidth + QuickChatCategoryDefinition.field_z);
              }
              if ((var15Lifetime1 & 1 << MotionWaypoint.field_q) != 0) {
                if (!var13.directJoinAvailable) {
                  stackIn_77_0 = (var13.invitationPending) ? 1 : 0;
                } else {
                  stackIn_77_0 = 1;
                }
                var37 = stackIn_77_0;
                stackIn_79_0 = AppletResourceHelpers.field_c;
                if (var37 == 0) {
                  stackIn_80_1 = 0;
                } else {
                  stackIn_80_1 = 1;
                }
                var52_ref = stackIn_79_0[stackIn_80_1];
                var13.field_Yb.sprite = var52_ref;
                var13.field_Yb.setBounds(var13.field_ec.height, 0, var35_int, var52_ref.canvasWidth, (byte) 64);
                var35_int = var35_int + (var52_ref.canvasWidth + QuickChatCategoryDefinition.field_z);
              }
              if ((1 << u.field_a & var15Lifetime1) != 0) {
                var53_ref = Ball.field_K[var13.spectatorMode - 1];
                var13.field_Bc.sprite = var53_ref;
                var13.field_Bc.setBounds(var13.field_ec.height, 0, var35_int, var53_ref.canvasWidth, (byte) 64);
                var35_int = var35_int + (var53_ref.canvasWidth + QuickChatCategoryDefinition.field_z);
              }
              if ((var15Lifetime1 & 1 << ScrollPane.field_Pb) != 0) {
                stackIn_87_0 = FullscreenDialogHelpers.field_c;
                if (var13.rated) {
                  stackIn_88_1 = 1;
                } else {
                  stackIn_88_1 = 0;
                }
                var54_ref = stackIn_87_0[stackIn_88_1];
                var13.field_lc.sprite = var54_ref;
                var13.field_lc.setBounds(var13.field_ec.height, 0, var35_int, var54_ref.canvasWidth, (byte) 64);
                var35_int = var35_int + (QuickChatCategoryDefinition.field_z + var54_ref.canvasWidth);
              }
              if (null != TextChoiceDialogHitTest.field_c) {
                for (var37Lifetime1 = 0; var37Lifetime1 < RankingsRequest.gameSettingCount; var37Lifetime1++) {
                  if (null != TextChoiceDialogHitTest.field_c[var37Lifetime1] &&
                    (1 << var37Lifetime1 + WidgetLayer.field_K & var15Lifetime1) != 0) {
                    var43 = TextChoiceDialogHitTest.field_c[var37Lifetime1][255 & var13.settings[var37Lifetime1]];
                    var55 = var43;
                    var13.field_Ec[var37Lifetime1].sprite = var43;
                    var13.field_Ec[var37Lifetime1].setBounds(var13.field_ec.height, 0, var35_int, var55.canvasWidth, (byte) 64);
                    var35_int = var35_int + (QuickChatCategoryDefinition.field_z + var55.canvasWidth);
                  }
                }
              }
              var37Lifetime2 = (var13.field_ec.width - var35_int) / 2;
              if (var37Lifetime2 > 0) {
                var13.field_sc.localX = var13.field_sc.localX + var37Lifetime2;
                var13.field_Yb.localX = var13.field_Yb.localX + var37Lifetime2;
                var13.field_Bc.localX = var13.field_Bc.localX + var37Lifetime2;
                var13.field_lc.localX = var13.field_lc.localX + var37Lifetime2;
                for (var38_int = 0; RankingsRequest.gameSettingCount > var38_int; var38_int++) {
                  dupTemp$0 = var13.field_Ec[var38_int];
                  dupTemp$0.localX = dupTemp$0.localX + var37Lifetime2;
                }
              }
              if (var13.started) {
                var38_intLifetime1 = var13.concludedDurationMillis;
                if (0 > var38_intLifetime1) {
                  var38_intLifetime1 = (int)(-var13.activityTimeMillis + var9);
                }
                var39_int = var38_intLifetime1 / 1000;
                var40 = var39_int / 60;
                var39_int = var39_int % 60;
                if (var40 >= 60) {
                  var41 = var40 / 60;
                  var40 = var40 % 60;
                  var13.field_zc.text = var41 + ":" + var40 / 10 + var40 % 10 + ":" + var39_int / 10 + var39_int % 10;
                } else {
                  var13.field_zc.text = var40 + ":" + var39_int / 10 + var39_int % 10;
                }
              }
              var13.field_zc.setBounds(np.uiRowHeight, var32, 365, var13.width - 365, (byte) 64);
              var32 = var32 + np.uiRowHeight;
              if (var13.playerNames != null) {
                var32 += 2;
                var38 = new StringBuilder(64);
                discarded$1 = var38.append(QuickChatParameterType.field_f);
                discarded$2 = var38.append(var13.playerNames[0]);
                for (var39_intLifetime1 = 1; var13.playerCount > var39_intLifetime1; var39_intLifetime1++) {
                  discarded$3 = var38.append(", ");
                  discarded$4 = var38.append(var13.playerNames[var39_intLifetime1]);
                }
                var39 = var38.toString();
                var13.field_Ub.text = var39;
                var40Lifetime1 = var13.field_Ub.font.countWrappedLines(var39, var13.width - var13.field_Ub.textInset * 2);
                var13.field_Ub.setBounds(np.uiRowHeight * var40Lifetime1, var32, 0, var13.width, (byte) 64);
                var32 = var32 + np.uiRowHeight * var40Lifetime1;
              }
              if (var13.invitationPending) {
                var13.field_ic.text = GamePresentationHelpers.formatIndexedText(TextFieldRenderer.field_y, new String[]{var33}, (byte) 103);
                var13.field_ic.setBounds(np.uiRowHeight, var32, LobbyGame.field_oc, -(LobbyGame.field_oc * 2) + var13.width, (byte) 64);
                var32 = var32 + np.uiRowHeight;
              }
              if (var13.joinRequestPending) {
                var13.field_Sb.text = GamePresentationHelpers.formatIndexedText(TextChoiceDialogHitTest.field_b, new String[]{var33}, (byte) 103);
                var13.field_Sb.setBounds(np.uiRowHeight, var32, LobbyGame.field_oc, -(LobbyGame.field_oc * 2) + var13.width, (byte) 64);
                var32 = var32 + np.uiRowHeight;
              }
            }
            var34 = NodeDeque.a(var13.removalStatus, var33, -15);
            var35 = var34;
            var35Lifetime1 = var34;
            if (var34 != null) {
              var35_intLifetime1 = var13.field_gc.font.countWrappedLines(var34, -LobbyGame.field_oc + (var13.width - LobbyGame.field_oc));
              var13.field_gc.text = var34;
              var13.field_gc.textAlpha256 = var13.statusChangeTick * 256 / AlternateNumericLoginCredentials.field_o;
              var13.field_gc.setBounds(np.uiRowHeight * var35_intLifetime1, var32, LobbyGame.field_oc, var13.width - 2 * LobbyGame.field_oc, (byte) 64);
              var32 = var32 + np.uiRowHeight * var35_intLifetime1;
            }
            if (var7_int == 0) {
              var13.remainingHeight = -var13.height + var32;
            }
            if (var14 != 0) {
              rl.field_e.content.placeBelow((UiComponent) (var11), 2, var13, 17290);
            }
            for (var35_intLifetime2 = 0; RankingsRequest.gameSettingCount > var35_intLifetime2; var35_intLifetime2++) {
              if (var13.field_Ec[var35_intLifetime2].activeInside) {
                if (null == LoginCredentials.field_i) {
                  var36 = null;
                } else {
                  if (LoginCredentials.field_i[var35_intLifetime2] != null) {
                    var36 = LoginCredentials.field_i[var35_intLifetime2][var13.settings[var35_intLifetime2] & 255];
                  } else {
                    var36 = null;
                  }
                }
                if (var36 == null) {
                  WidgetTextLayout.field_e = QuickChatPhraseRegistry.field_b[var35_intLifetime2];
                } else {
                  WidgetTextLayout.field_e = QuickChatPhraseRegistry.field_b[var35_intLifetime2] + " - " + (String) (var36);
                }
              }
            }
            if (var13.field_sc.activeInside) {
              if (var13.joinSortPriority != 1) {
                var35Lifetime2 = AchievementsScreen.field_H[var13.joinSortPriority];
              } else {
                var35Lifetime2 = SoundCache.field_b;
              }
              WidgetTextLayout.field_e = FarmBackground.field_s + " - " + var35Lifetime2;
            }
            if (var13.field_lc.activeInside) {
              if (var13.rated) {
                stackIn_148_0 = DelayedPacket.field_n;
              } else {
                stackIn_148_0 = rl.field_b;
              }
              WidgetTextLayout.field_e = stackIn_148_0;
            }
            if (var13.field_Yb.activeInside) {
              if (!var13.directJoinAvailable &&
                !var13.invitationPending) {
                if (!var13.protocolFlag8) {
                  stackIn_158_0 = AchievementsScreen.field_K;
                } else {
                  stackIn_158_0 = WidgetPaintStyle.field_n;
                }
              } else {
                stackIn_158_0 = ArchiveSource.field_d;
              }
              WidgetTextLayout.field_e = stackIn_158_0;
            }
            if (var13.field_Bc.activeInside) {
              if (2 != var13.spectatorMode) {
                stackIn_164_0 = AlternateNumericLoginCredentials.field_q;
              } else {
                stackIn_164_0 = LobbyPlayer.field_jc;
              }
              WidgetTextLayout.field_e = stackIn_164_0;
            }
            boolean decompiledFrameRemainder0 = true;
            if (var13.pressedButton != 0) {
              if (var13.isUnindexed(109)) {
                var13 = (LobbyGame) (var8.next((byte) 116));
                continue;
              }
              if (var13.field_nc.pressedButton == 0) {
                FullscreenFailureKind.a(var13, param0, (byte) -71, var33);
              } else {
                if (var13.started && (!var13.protocolFlag8 ||
                  !var13.directJoinAvailable &&
                  !var13.invitationPending)) {
                  DraggableWidget.requestSpectateGame(var13.getGameId((byte) -107), -85, param4);
                  decompiledFrameRemainder0 = false;
                }
                else {
                  DropTargetWidget.requestJoinGame(var13.getGameId((byte) -34), param4, 11912);
                }
              }
            }
            var13 = (LobbyGame) (var8.next((byte) 116));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var7), "um.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    String getDisplayText(Widget widget, boolean obfuscationGuard) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard) {
            stackIn_4_0 = widget.text;
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("um.Q(");
          if (widget == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final void paintTextRun(int localX, int localY, int shadowColor, int parentY, int textColor, byte obfuscationGuard, int parentX, Widget widget) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var12Lifetime1;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          MovingBody.a((byte) 81, widget.width + widget.x + parentX, parentX + widget.x, widget.y + parentY, parentY + widget.y + widget.height);
          if (obfuscationGuard >= -45) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          var9_int = this.getTextAreaWidth(61823, widget);
          var10 = this.getTextAreaHeight(16265, widget);
          if (this.wrapText) {
            this.font.drawParagraph(this.getDisplayText(widget, true), this.computeTextX(localX, widget, 65263, parentX), this.computeTextY((byte) 117, parentY, localY, widget), var9_int, var10, textColor, shadowColor, this.horizontalAlignment, this.verticalAlignment, this.lineSpacing);
          } else {
            var12 = this.verticalAlignment;
            if (var12 != 0) {
              if (var12 != 2) {
                if (var12 != 3 &&
                  var12 != 1) {
                }
                var11 = this.font.ascent + (-this.font.descent - this.font.ascent + var10 >> 1);
              } else {
                var11 = -this.font.descent + var10;
              }
            } else {
              var11 = this.font.ascent;
            }
            var12Lifetime1 = this.horizontalAlignment;
            if (0 != var12Lifetime1 &&
              var12Lifetime1 != 3) {
              if (1 == var12Lifetime1) {
                this.font.drawCentered(this.getDisplayText(widget, true), (var9_int >> 1) + this.computeTextX(localX, widget, 65263, parentX), this.computeTextY((byte) 118, parentY, localY, widget) + var11, textColor, shadowColor);
              } else {
                if ((var12Lifetime1 == 2)) {
                  this.font.drawRight(this.getDisplayText(widget, true), this.computeTextX(localX, widget, 65263, parentX) + var9_int, var11 + this.computeTextY((byte) 127, parentY, localY, widget), textColor, shadowColor);
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.font.drawLeft(this.getDisplayText(widget, true), this.computeTextX(localX, widget, 65263, parentX), this.computeTextY((byte) 105, parentY, localY, widget) + var11, textColor, shadowColor);
            }
          }
          sc.popRaster(-103);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_28_0 = var9;
          stackIn_28_1 = new StringBuilder().append("um.P(").append(localX).append(',').append(localY).append(',').append(shadowColor).append(',').append(parentY).append(',').append(textColor).append(',').append(obfuscationGuard).append(',').append(parentX).append(',');
          if (widget == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    public final int getTextOriginY(int parentY, byte obfuscationGuard, Widget widget) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= -92) {
            this.font = (TextFont) null;
          }
          stackIn_3_0 = this.computeTextY((byte) 125, parentY, 0, widget);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("um.S(").append(parentY).append(',').append(obfuscationGuard).append(',');
          if (widget == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final int getLineHeight(byte obfuscationGuard) {
        if (obfuscationGuard < 64) {
          this.lineSpacing = -89;
        }
        return this.font.descent + this.font.ascent;
    }

    public final int getPreferredHeight(Widget widget, int obfuscationGuard) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.getTextLayout(widget, 109);
          if (obfuscationGuard == 46695) {
            stackIn_4_0 = widget.textLayout.getHeight(obfuscationGuard ^ 46695) + this.topInset + this.bottomInset;
            return stackIn_4_0;
          }
          stackIn_2_0 = 99;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("um.G(");
          if (widget == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_p = null;
        quarterSineQ16 = null;
        if (param0 != 31292) {
          field_b = (UiComponent) null;
        }
        underwaterBackgroundColors = null;
        meshAttributeRecords = null;
        field_b = null;
        desertCentreSprites = null;
    }

    protected TextWidgetRenderer() {
    }

    TextWidgetRenderer(TextFont font, int leftInset, int rightInset, int topInset, int bottomInset, int textColor, int shadowColor, int horizontalAlignment, int verticalAlignment, int lineSpacing, int caretColor, int selectionArgb, boolean wrapText) {
        try {
          this.wrapText = wrapText ? true : false;
          this.textColor = textColor;
          this.lineSpacing = lineSpacing;
          this.font = font;
          this.bottomInset = bottomInset;
          this.topInset = topInset;
          this.selectionArgb = selectionArgb;
          this.verticalAlignment = verticalAlignment;
          this.caretColor = caretColor;
          this.rightInset = rightInset;
          this.leftInset = leftInset;
          this.horizontalAlignment = horizontalAlignment;
          this.shadowColor = shadowColor;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "um.<init>(" + (font != null ? "{...}" : "null") + ',' + leftInset + ',' + rightInset + ',' + topInset + ',' + bottomInset + ',' + textColor + ',' + shadowColor + ',' + horizontalAlignment + ',' + verticalAlignment + ',' + lineSpacing + ',' + caretColor + ',' + selectionArgb + ',' + wrapText + ')');
        }
    }

    static {
        underwaterBackgroundColors = new int[]{31114, 12658477, 16494651, 26679, 16711935};
        field_e = true;
        quarterSineQ16 = new int[]{0, 50, 101, 151, 201, 251, 302, 352, 402, 452, 503, 553, 603, 653, 704, 754, 804, 854, 905, 955, 1005, 1056, 1106, 1156, 1206, 1257, 1307, 1357, 1407, 1458, 1508, 1558, 1608, 1659, 1709, 1759, 1809, 1860, 1910, 1960, 2010, 2061, 2111, 2161, 2211, 2261, 2312, 2362, 2412, 2462, 2513, 2563, 2613, 2663, 2714, 2764, 2814, 2864, 2914, 2965, 3015, 3065, 3115, 3165, 3216, 3266, 3316, 3366, 3417, 3467, 3517, 3567, 3617, 3667, 3718, 3768, 3818, 3868, 3918, 3969, 4019, 4069, 4119, 4169, 4219, 4270, 4320, 4370, 4420, 4470, 4520, 4570, 4621, 4671, 4721, 4771, 4821, 4871, 4921, 4972, 5022, 5072, 5122, 5172, 5222, 5272, 5322, 5372, 5422, 5473, 5523, 5573, 5623, 5673, 5723, 5773, 5823, 5873, 5923, 5973, 6023, 6073, 6123, 6173, 6224, 6274, 6324, 6374, 6424, 6474, 6524, 6574, 6624, 6674, 6724, 6774, 6824, 6874, 6924, 6974, 7024, 7074, 7124, 7174, 7224, 7273, 7323, 7373, 7423, 7473, 7523, 7573, 7623, 7673, 7723, 7773, 7823, 7873, 7923, 7972, 8022, 8072, 8122, 8172, 8222, 8272, 8322, 8371, 8421, 8471, 8521, 8571, 8621, 8670, 8720, 8770, 8820, 8870, 8919, 8969, 9019, 9069, 9119, 9168, 9218, 9268, 9318, 9367, 9417, 9467, 9517, 9566, 9616, 9666, 9716, 9765, 9815, 9865, 9914, 9964, 10014, 10063, 10113, 10163, 10212, 10262, 10312, 10361, 10411, 10461, 10510, 10560, 10609, 10659, 10709, 10758, 10808, 10857, 10907, 10956, 11006, 11056, 11105, 11155, 11204, 11254, 11303, 11353, 11402, 11452, 11501, 11551, 11600, 11650, 11699, 11749, 11798, 11847, 11897, 11946, 11996, 12045, 12095, 12144, 12193, 12243, 12292, 12341, 12391, 12440, 12490, 12539, 12588, 12638, 12687, 12736, 12785, 12835, 12884, 12933, 12983, 13032, 13081, 13130, 13180, 13229, 13278, 13327, 13376, 13426, 13475, 13524, 13573, 13622, 13672, 13721, 13770, 13819, 13868, 13917, 13966, 14016, 14065, 14114, 14163, 14212, 14261, 14310, 14359, 14408, 14457, 14506, 14555, 14604, 14653, 14702, 14751, 14800, 14849, 14898, 14947, 14996, 15045, 15094, 15143, 15192, 15240, 15289, 15338, 15387, 15436, 15485, 15534, 15582, 15631, 15680, 15729, 15778, 15826, 15875, 15924, 15973, 16021, 16070, 16119, 16168, 16216, 16265, 16314, 16362, 16411, 16460, 16508, 16557, 16606, 16654, 16703, 16751, 16800, 16849, 16897, 16946, 16994, 17043, 17091, 17140, 17188, 17237, 17285, 17334, 17382, 17431, 17479, 17528, 17576, 17625, 17673, 17721, 17770, 17818, 17867, 17915, 17963, 18012, 18060, 18108, 18156, 18205, 18253, 18301, 18350, 18398, 18446, 18494, 18543, 18591, 18639, 18687, 18735, 18783, 18832, 18880, 18928, 18976, 19024, 19072, 19120, 19168, 19216, 19264, 19313, 19361, 19409, 19457, 19505, 19553, 19600, 19648, 19696, 19744, 19792, 19840, 19888, 19936, 19984, 20032, 20080, 20127, 20175, 20223, 20271, 20319, 20366, 20414, 20462, 20510, 20557, 20605, 20653, 20701, 20748, 20796, 20844, 20891, 20939, 20987, 21034, 21082, 21129, 21177, 21224, 21272, 21320, 21367, 21415, 21462, 21510, 21557, 21604, 21652, 21699, 21747, 21794, 21842, 21889, 21936, 21984, 22031, 22078, 22126, 22173, 22220, 22268, 22315, 22362, 22409, 22457, 22504, 22551, 22598, 22645, 22693, 22740, 22787, 22834, 22881, 22928, 22975, 23022, 23069, 23116, 23163, 23210, 23257, 23304, 23351, 23398, 23445, 23492, 23539, 23586, 23633, 23680, 23727, 23774, 23820, 23867, 23914, 23961, 24008, 24054, 24101, 24148, 24195, 24241, 24288, 24335, 24381, 24428, 24475, 24521, 24568, 24614, 24661, 24708, 24754, 24801, 24847, 24894, 24940, 24987, 25033, 25080, 25126, 25172, 25219, 25265, 25312, 25358, 25404, 25451, 25497, 25543, 25589, 25636, 25682, 25728, 25774, 25821, 25867, 25913, 25959, 26005, 26051, 26098, 26144, 26190, 26236, 26282, 26328, 26374, 26420, 26466, 26512, 26558, 26604, 26650, 26696, 26742, 26787, 26833, 26879, 26925, 26971, 27017, 27062, 27108, 27154, 27200, 27245, 27291, 27337, 27382, 27428, 27474, 27519, 27565, 27611, 27656, 27702, 27747, 27793, 27838, 27884, 27929, 27975, 28020, 28066, 28111, 28156, 28202, 28247, 28293, 28338, 28383, 28429, 28474, 28519, 28564, 28610, 28655, 28700, 28745, 28790, 28835, 28881, 28926, 28971, 29016, 29061, 29106, 29151, 29196, 29241, 29286, 29331, 29376, 29421, 29466, 29511, 29555, 29600, 29645, 29690, 29735, 29780, 29824, 29869, 29914, 29959, 30003, 30048, 30093, 30137, 30182, 30226, 30271, 30316, 30360, 30405, 30449, 30494, 30538, 30583, 30627, 30672, 30716, 30760, 30805, 30849, 30893, 30938, 30982, 31026, 31071, 31115, 31159, 31203, 31248, 31292, 31336, 31380, 31424, 31468, 31512, 31556, 31600, 31644, 31688, 31732, 31776, 31820, 31864, 31908, 31952, 31996, 32040, 32084, 32127, 32171, 32215, 32259, 32303, 32346, 32390, 32434, 32477, 32521, 32565, 32608, 32652, 32695, 32739, 32783, 32826, 32870, 32913, 32956, 33000, 33043, 33087, 33130, 33173, 33217, 33260, 33303, 33347, 33390, 33433, 33476, 33520, 33563, 33606, 33649, 33692, 33735, 33778, 33821, 33865, 33908, 33951, 33994, 34037, 34079, 34122, 34165, 34208, 34251, 34294, 34337, 34380, 34422, 34465, 34508, 34551, 34593, 34636, 34679, 34721, 34764, 34806, 34849, 34892, 34934, 34977, 35019, 35062, 35104, 35146, 35189, 35231, 35274, 35316, 35358, 35401, 35443, 35485, 35527, 35570, 35612, 35654, 35696, 35738, 35781, 35823, 35865, 35907, 35949, 35991, 36033, 36075, 36117, 36159, 36201, 36243, 36284, 36326, 36368, 36410, 36452, 36493, 36535, 36577, 36619, 36660, 36702, 36744, 36785, 36827, 36868, 36910, 36951, 36993, 37034, 37076, 37117, 37159, 37200, 37241, 37283, 37324, 37365, 37407, 37448, 37489, 37530, 37572, 37613, 37654, 37695, 37736, 37777, 37818, 37859, 37900, 37941, 37982, 38023, 38064, 38105, 38146, 38187, 38228, 38269, 38309, 38350, 38391, 38432, 38472, 38513, 38554, 38594, 38635, 38675, 38716, 38757, 38797, 38838, 38878, 38919, 38959, 38999, 39040, 39080, 39120, 39161, 39201, 39241, 39282, 39322, 39362, 39402, 39442, 39482, 39523, 39563, 39603, 39643, 39683, 39723, 39763, 39803, 39843, 39882, 39922, 39962, 40002, 40042, 40082, 40121, 40161, 40201, 40241, 40280, 40320, 40359, 40399, 40439, 40478, 40518, 40557, 40597, 40636, 40675, 40715, 40754, 40794, 40833, 40872, 40912, 40951, 40990, 41029, 41068, 41108, 41147, 41186, 41225, 41264, 41303, 41342, 41381, 41420, 41459, 41498, 41537, 41576, 41614, 41653, 41692, 41731, 41770, 41808, 41847, 41886, 41924, 41963, 42002, 42040, 42079, 42117, 42156, 42194, 42233, 42271, 42309, 42348, 42386, 42424, 42463, 42501, 42539, 42578, 42616, 42654, 42692, 42730, 42768, 42806, 42844, 42882, 42920, 42958, 42996, 43034, 43072, 43110, 43148, 43186, 43223, 43261, 43299, 43337, 43374, 43412, 43450, 43487, 43525, 43562, 43600, 43638, 43675, 43713, 43750, 43787, 43825, 43862, 43899, 43937, 43974, 44011, 44049, 44086, 44123, 44160, 44197, 44234, 44271, 44308, 44345, 44382, 44419, 44456, 44493, 44530, 44567, 44604, 44641, 44677, 44714, 44751, 44788, 44824, 44861, 44898, 44934, 44971, 45007, 45044, 45080, 45117, 45153, 45190, 45226, 45262, 45299, 45335, 45371, 45408, 45444, 45480, 45516, 45552, 45589, 45625, 45661, 45697, 45733, 45769, 45805, 45841, 45877, 45912, 45948, 45984, 46020, 46056, 46091, 46127, 46163, 46199, 46234, 46270, 46305, 46341, 46376, 46412, 46447, 46483, 46518, 46554, 46589, 46624, 46660, 46695, 46730, 46765, 46801, 46836, 46871, 46906, 46941, 46976, 47011, 47046, 47081, 47116, 47151, 47186, 47221, 47256, 47291, 47325, 47360, 47395, 47430, 47464, 47499, 47534, 47568, 47603, 47637, 47672, 47706, 47741, 47775, 47809, 47844, 47878, 47912, 47947, 47981, 48015, 48049, 48084, 48118, 48152, 48186, 48220, 48254, 48288, 48322, 48356, 48390, 48424, 48458, 48491, 48525, 48559, 48593, 48626, 48660, 48694, 48727, 48761, 48795, 48828, 48862, 48895, 48929, 48962, 48995, 49029, 49062, 49095, 49129, 49162, 49195, 49228, 49262, 49295, 49328, 49361, 49394, 49427, 49460, 49493, 49526, 49559, 49592, 49624, 49657, 49690, 49723, 49756, 49788, 49821, 49854, 49886, 49919, 49951, 49984, 50016, 50049, 50081, 50114, 50146, 50178, 50211, 50243, 50275, 50307, 50340, 50372, 50404, 50436, 50468, 50500, 50532, 50564, 50596, 50628, 50660, 50692, 50724, 50756, 50787, 50819, 50851, 50882, 50914, 50946, 50977, 51009, 51041, 51072, 51104, 51135, 51166, 51198, 51229, 51260, 51292, 51323, 51354, 51386, 51417, 51448, 51479, 51510, 51541, 51572, 51603, 51634, 51665, 51696, 51727, 51758, 51789, 51819, 51850, 51881, 51911, 51942, 51973, 52003, 52034, 52065, 52095, 52126, 52156, 52186, 52217, 52247, 52277, 52308, 52338, 52368, 52398, 52429, 52459, 52489, 52519, 52549, 52579, 52609, 52639, 52669, 52699, 52729, 52759, 52788, 52818, 52848, 52878, 52907, 52937, 52967, 52996, 53026, 53055, 53085, 53114, 53144, 53173, 53202, 53232, 53261, 53290, 53319, 53349, 53378, 53407, 53436, 53465, 53494, 53523, 53552, 53581, 53610, 53639, 53668, 53697, 53726, 53754, 53783, 53812, 53840, 53869, 53898, 53926, 53955, 53983, 54012, 54040, 54069, 54097, 54125, 54154, 54182, 54210, 54239, 54267, 54295, 54323, 54351, 54379, 54407, 54435, 54463, 54491, 54519, 54547, 54575, 54603, 54630, 54658, 54686, 54714, 54741, 54769, 54796, 54824, 54852, 54879, 54906, 54934, 54961, 54989, 55016, 55043, 55071, 55098, 55125, 55152, 55179, 55206, 55233, 55260, 55288, 55314, 55341, 55368, 55395, 55422, 55449, 55476, 55502, 55529, 55556, 55582, 55609, 55636, 55662, 55689, 55715, 55742, 55768, 55794, 55821, 55847, 55873, 55900, 55926, 55952, 55978, 56004, 56030, 56056, 56082, 56108, 56134, 56160, 56186, 56212, 56238, 56264, 56289, 56315, 56341, 56367, 56392, 56418, 56443, 56469, 56494, 56520, 56545, 56571, 56596, 56621, 56647, 56672, 56697, 56722, 56747, 56773, 56798, 56823, 56848, 56873, 56898, 56923, 56948, 56972, 56997, 57022, 57047, 57072, 57096, 57121, 57145, 57170, 57195, 57219, 57244, 57268, 57293, 57317, 57341, 57366, 57390, 57414, 57438, 57463, 57487, 57511, 57535, 57559, 57583, 57607, 57631, 57655, 57679, 57703, 57726, 57750, 57774, 57798, 57821, 57845, 57869, 57892, 57916, 57939, 57963, 57986, 58009, 58033, 58056, 58079, 58103, 58126, 58149, 58172, 58195, 58219, 58242, 58265, 58288, 58311, 58334, 58356, 58379, 58402, 58425, 58448, 58470, 58493, 58516, 58538, 58561, 58583, 58606, 58628, 58651, 58673, 58696, 58718, 58740, 58763, 58785, 58807, 58829, 58851, 58873, 58896, 58918, 58940, 58962, 58983, 59005, 59027, 59049, 59071, 59093, 59114, 59136, 59158, 59179, 59201, 59222, 59244, 59265, 59287, 59308, 59330, 59351, 59372, 59393, 59415, 59436, 59457, 59478, 59499, 59520, 59541, 59562, 59583, 59604, 59625, 59646, 59667, 59687, 59708, 59729, 59750, 59770, 59791, 59811, 59832, 59852, 59873, 59893, 59914, 59934, 59954, 59975, 59995, 60015, 60035, 60055, 60075, 60096, 60116, 60136, 60156, 60175, 60195, 60215, 60235, 60255, 60275, 60294, 60314, 60334, 60353, 60373, 60392, 60412, 60431, 60451, 60470, 60490, 60509, 60528, 60547, 60567, 60586, 60605, 60624, 60643, 60662, 60681, 60700, 60719, 60738, 60757, 60776, 60794, 60813, 60832, 60851, 60869, 60888, 60906, 60925, 60943, 60962, 60980, 60999, 61017, 61035, 61054, 61072, 61090, 61108, 61127, 61145, 61163, 61181, 61199, 61217, 61235, 61253, 61270, 61288, 61306, 61324, 61341, 61359, 61377, 61394, 61412, 61429, 61447, 61464, 61482, 61499, 61517, 61534, 61551, 61568, 61586, 61603, 61620, 61637, 61654, 61671, 61688, 61705, 61722, 61739, 61756, 61772, 61789, 61806, 61823, 61839, 61856, 61873, 61889, 61906, 61922, 61939, 61955, 61971, 61988, 62004, 62020, 62036, 62053, 62069, 62085, 62101, 62117, 62133, 62149, 62165, 62181, 62197, 62212, 62228, 62244, 62260, 62275, 62291, 62307, 62322, 62338, 62353, 62369, 62384, 62400, 62415, 62430, 62445, 62461, 62476, 62491, 62506, 62521, 62536, 62551, 62566, 62581, 62596, 62611, 62626, 62641, 62655, 62670, 62685, 62699, 62714, 62729, 62743, 62758, 62772, 62787, 62801, 62815, 62830, 62844, 62858, 62872, 62886, 62901, 62915, 62929, 62943, 62957, 62971, 62985, 62998, 63012, 63026, 63040, 63054, 63067, 63081, 63095, 63108, 63122, 63135, 63149, 63162, 63175, 63189, 63202, 63215, 63229, 63242, 63255, 63268, 63281, 63294, 63307, 63320, 63333, 63346, 63359, 63372, 63385, 63397, 63410, 63423, 63435, 63448, 63461, 63473, 63486, 63498, 63510, 63523, 63535, 63547, 63560, 63572, 63584, 63596, 63608, 63621, 63633, 63645, 63657, 63668, 63680, 63692, 63704, 63716, 63728, 63739, 63751, 63763, 63774, 63786, 63797, 63809, 63820, 63832, 63843, 63854, 63866, 63877, 63888, 63899, 63910, 63922, 63933, 63944, 63955, 63966, 63976, 63987, 63998, 64009, 64020, 64031, 64041, 64052, 64062, 64073, 64084, 64094, 64105, 64115, 64125, 64136, 64146, 64156, 64167, 64177, 64187, 64197, 64207, 64217, 64227, 64237, 64247, 64257, 64267, 64277, 64287, 64296, 64306, 64316, 64325, 64335, 64344, 64354, 64363, 64373, 64382, 64392, 64401, 64410, 64420, 64429, 64438, 64447, 64456, 64465, 64474, 64483, 64492, 64501, 64510, 64519, 64528, 64536, 64545, 64554, 64563, 64571, 64580, 64588, 64597, 64605, 64614, 64622, 64630, 64639, 64647, 64655, 64663, 64672, 64680, 64688, 64696, 64704, 64712, 64720, 64728, 64735, 64743, 64751, 64759, 64766, 64774, 64782, 64789, 64797, 64804, 64812, 64819, 64827, 64834, 64841, 64849, 64856, 64863, 64870, 64877, 64884, 64892, 64899, 64905, 64912, 64919, 64926, 64933, 64940, 64947, 64953, 64960, 64967, 64973, 64980, 64986, 64993, 64999, 65006, 65012, 65018, 65025, 65031, 65037, 65043, 65049, 65055, 65061, 65067, 65073, 65079, 65085, 65091, 65097, 65103, 65109, 65114, 65120, 65126, 65131, 65137, 65142, 65148, 65153, 65159, 65164, 65169, 65175, 65180, 65185, 65190, 65195, 65200, 65205, 65210, 65215, 65220, 65225, 65230, 65235, 65240, 65245, 65249, 65254, 65259, 65263, 65268, 65272, 65277, 65281, 65286, 65290, 65294, 65299, 65303, 65307, 65311, 65315, 65320, 65324, 65328, 65332, 65336, 65339, 65343, 65347, 65351, 65355, 65358, 65362, 65366, 65369, 65373, 65376, 65380, 65383, 65387, 65390, 65393, 65397, 65400, 65403, 65406, 65410, 65413, 65416, 65419, 65422, 65425, 65428, 65430, 65433, 65436, 65439, 65442, 65444, 65447, 65449, 65452, 65455, 65457, 65460, 65462, 65464, 65467, 65469, 65471, 65473, 65476, 65478, 65480, 65482, 65484, 65486, 65488, 65490, 65492, 65493, 65495, 65497, 65499, 65500, 65502, 65504, 65505, 65507, 65508, 65510, 65511, 65512, 65514, 65515, 65516, 65517, 65519, 65520, 65521, 65522, 65523, 65524, 65525, 65526, 65527, 65527, 65528, 65529, 65530, 65530, 65531, 65532, 65532, 65533, 65533, 65534, 65534, 65534, 65535, 65535, 65535, 65536, 65536, 65536, 65536, 65536, 65536};
    }
}
