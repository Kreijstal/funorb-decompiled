/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayNamePanel extends WidgetContainer implements UsernameSuggestionListener, ButtonActivationListener {
    private ValidatedTextInputWidget displayNameInput;
    static volatile int livePointerPressY;
    UsernameSuggestionsPanel usernameSuggestions;
    private ButtonWidget confirmButton;
    static Sprite bakingForegroundSprite;
    static String createIneligibleText;
    static long connectionRetryDeadlineMillis;
    private ButtonWidget cancelButton;

    private final boolean isDisplayNameAccepted(byte methodGuard) {
        if (!this.isValidationSourceAccepted(-115, (ValidationProviderSource) (this.displayNameInput))) {
            return false;
        }
        if (methodGuard != -118) {
            this.confirmButton = (ButtonWidget) null;
            return true;
        }
        return true;
    }

    public DisplayNamePanel() {
        super(0, 0, 496, 0, (WidgetRenderer) null);
        this.displayNameInput = new ValidatedTextInputWidget("", (WidgetListener) null, 12);
        TextWidgetRenderer introTextRenderer = new TextWidgetRenderer(UiFontResources.commonUiSmallFont, 0, 0, 0, 0, 16777215, -1, 3, 0, DialogLayer.sharedUiFont.maxAscent, -1, 2147483647, true);
        UiWidget introTextWidget = new UiWidget(ClientTimingSupport.loginNoDisplayNameText, introTextRenderer, (WidgetListener) null);
        this.confirmButton = new ButtonWidget(MatchScoringSupport.okText, (WidgetListener) null);
        this.cancelButton = new ButtonWidget(TextTemplateArgumentType.cancelText, (WidgetListener) null);
        this.displayNameInput.hoverText = AchievementProtocolSupport.createDisplayNameTooltipText;
        this.displayNameInput.setValidationProvider((byte) -58, new UsernameAvailabilityValidator(this.displayNameInput));
        this.confirmButton.enabled = false;
        this.confirmButton.renderer = (WidgetRenderer) ((Object) new SpriteButtonRenderer());
        this.cancelButton.renderer = (WidgetRenderer) ((Object) new UnderlinedButtonRenderer());
        this.displayNameInput.renderer = (WidgetRenderer) ((Object) new TextInputRenderer(10000536));
        int layoutCursorY = 20;
        int panelPadding = 4;
        introTextWidget.setWidgetBounds(50, 270, (byte) -8, layoutCursorY, 20);
        int confirmButtonWidth = 200;
        this.addChild((byte) -110, introTextWidget);
        layoutCursorY += 50;
        layoutCursorY = layoutCursorY + (5 + this.addDisplayNameInputRow(layoutCursorY, -12037, 170, this.displayNameInput, ClientProtocolStage.createDisplayNameHintText, OpacityWidget.createDisplayNameText));
        this.confirmButton.setWidgetBounds(40, confirmButtonWidth, (byte) -23, layoutCursorY, -confirmButtonWidth + 496 >> 1);
        this.cancelButton.setWidgetBounds(40, 60, (byte) -85, layoutCursorY + 15, 3 + panelPadding);
        this.cancelButton.listener = (WidgetListener) (this);
        this.confirmButton.listener = (WidgetListener) (this);
        this.addChild((byte) -102, this.confirmButton);
        this.addChild((byte) -105, this.cancelButton);
        this.usernameSuggestions = new UsernameSuggestionsPanel((UsernameSuggestionListener) (this));
        this.usernameSuggestions.setWidgetBounds(150, -60 + this.widgetWidth + (-this.displayNameInput.widgetX - this.displayNameInput.widgetWidth), (byte) -54, 20, 60 + this.displayNameInput.widgetX + this.displayNameInput.widgetWidth);
        this.addChild((byte) -102, this.usernameSuggestions);
        this.setWidgetBounds(panelPadding + 55 + layoutCursorY, 496, (byte) -55, 0, 0);
    }

    private final int addLabeledValidatedInput(int rowY, int methodGuard, String labelText, String fallbackMessage, int validationMessageHeight, int inputWidth, UiWidget inputWidget) {
        RuntimeException rowFailureForContext = null;
        ValidationMessageWidget validationMessageWidget = null;
        int guardQuotient = 0;
        LabeledChildWidget labeledInputWidget = null;
        int rowHeightBeforeReturn = 0;
        RuntimeException rowFailureBeforeDescriptions = null;
        StringBuilder rowMessagePrefix = null;
        String labelDescription = null;
        StringBuilder rowMessageBeforeFallback = null;
        String fallbackDescription = null;
        StringBuilder rowMessageBeforeInput = null;
        String inputDescription = null;
        RuntimeException caughtRowFailure = null;
        try {
          labeledInputWidget = new LabeledChildWidget(20, rowY, inputWidth + 120, 25, inputWidget, false, 120, 3, DialogLayer.sharedUiFont, 16777215, labelText);
          guardQuotient = -110 / ((70 - methodGuard) / 33);
          this.addChild((byte) -108, labeledInputWidget);
          validationMessageWidget = new ValidationMessageWidget(((ValidationProviderSource) ((Object) inputWidget)).getValidationProvider((byte) -113), fallbackMessage, 126, rowY + labeledInputWidget.widgetHeight, 25 + inputWidth, validationMessageHeight);
          validationMessageWidget.listener = (WidgetListener) (this);
          this.addChild((byte) -115, validationMessageWidget);
          rowHeightBeforeReturn = validationMessageWidget.widgetHeight + labeledInputWidget.widgetHeight;
          return rowHeightBeforeReturn;
        } catch (java.lang.RuntimeException rowFailure) {
          caughtRowFailure = rowFailure;
          rowFailureForContext = caughtRowFailure;
          rowFailureBeforeDescriptions = rowFailureForContext;
          rowMessagePrefix = new StringBuilder().append("hi.O(").append(rowY).append(',').append(methodGuard).append(',');
          if (labelText == null) {
            labelDescription = "null";
          } else {
            labelDescription = "{...}";
          }
          rowMessageBeforeFallback = ((StringBuilder) (Object) rowMessagePrefix).append(labelDescription).append(',');
          if (fallbackMessage == null) {
            fallbackDescription = "null";
          } else {
            fallbackDescription = "{...}";
          }
          rowMessageBeforeInput = ((StringBuilder) (Object) rowMessageBeforeFallback).append(fallbackDescription).append(',').append(validationMessageHeight).append(',').append(inputWidth).append(',');
          if (inputWidget == null) {
            inputDescription = "null";
          } else {
            inputDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) rowFailureBeforeDescriptions), ((StringBuilder) (Object) rowMessageBeforeInput).append(inputDescription).append(')').toString());
        }
    }

    final static void renderLitQueuedMeshFaces(int halfVectorZQ8, int lightDirectionZQ8, int halfVectorXQ8, int guard, int lightDirectionXQ8, TriangleMesh mesh, int halfVectorYQ8, int lightDirectionYQ8) {
        int diffuseResponseCandidate = 0;
        int[] specularResponseTableSnapshot = null;
        int absoluteHalfVectorDot = 0;
        int faceNormalAIndexOrMissing = 0;
        int faceNormalBIndexOrMissing = 0;
        int faceNormalCIndexOrMissing = 0;
        MeshMaterial faceMaterialOrNull = null;
        int flatBaseRgbOrDefault = 0;
        int smoothBaseRgbOrDefault = 0;
        RuntimeException renderFailureBeforeContext = null;
        StringBuilder renderMessagePrefix = null;
        String meshDescription = null;
        RuntimeException caughtRenderFailure = null;
        int[] diffuseResponsesThirdAlias = null;
        RuntimeException renderFailure = null;
        int normalOrFaceQueueIndex = 0;
        int diffuseResponseOrFaceIndex = 0;
        int specularResponseOrVertexA = 0;
        int faceVertexB = 0;
        int faceVertexC = 0;
        int faceNormalA = 0;
        int faceNormalB = 0;
        int faceNormalC = 0;
        MeshMaterial faceMaterial = null;
        int vertexAX = 0;
        int vertexAY = 0;
        int vertexBX = 0;
        int vertexBY = 0;
        int vertexCX = 0;
        int vertexCY = 0;
        int diffuseA = 0;
        int flatSpecularOrDiffuseB = 0;
        int flatBaseRgbOrDiffuseC = 0;
        int flatRedBlueMaskOrSpecularA = 0;
        int flatGreenMaskOrSpecularB = 0;
        int flatLitRgbOrSpecularC = 0;
        int smoothBaseRgb = 0;
        int smoothRedBlueMask = 0;
        int smoothGreenMask = 0;
        int vertexALitRgb = 0;
        int vertexBLitRgb = 0;
        int vertexCLitRgb = 0;
        int controlFlagSnapshot = 0;
        int[] diffuseResponsesSecondAlias = null;
        TriangleMesh meshForPriorityDecision = null;
        int[] diffuseResponsesFirstAlias = null;
        int[] diffuseResponses = null;
        byte[] facePriorities = null;
        int[] transformedNormalsY = null;
        int[] transformedNormalsX = null;
        int[] transformedNormalsZ = null;
        int[] specularResponses = null;
        controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        try {
          meshForPriorityDecision = mesh;
          if ((null != meshForPriorityDecision.facePriorities) &&
              (meshForPriorityDecision.facePriorityCount > 1)) {
            facePriorities = meshForPriorityDecision.facePriorities;
            MeshPrioritySupport.groupQueuedMeshFacesByPriority(0, facePriorities, 0, PasswordWidgetRenderer.meshFacePriorityWriteOffsets, (byte) -85);
          } else {
            CachedTextLayout.compactDepthBucketFaceOrder(2971);
          }
          if (guard != 6562) {
            return;
          }
          diffuseResponses = new int[mesh.normalCount];
          diffuseResponsesFirstAlias = diffuseResponses;
          diffuseResponsesSecondAlias = diffuseResponsesFirstAlias;
          diffuseResponsesThirdAlias = diffuseResponsesSecondAlias;
          specularResponses = new int[mesh.normalCount];
          transformedNormalsX = ClientRenderingState.transformedMeshNormalX;
          transformedNormalsY = ClientClockSupport.transformedMeshNormalY;
          transformedNormalsZ = IterableNodeHashTable.transformedMeshNormalZ;
          for (normalOrFaceQueueIndex = 0; mesh.normalCount > normalOrFaceQueueIndex; normalOrFaceQueueIndex++) {
            diffuseResponseOrFaceIndex = transformedNormalsY[normalOrFaceQueueIndex] * lightDirectionYQ8 + lightDirectionXQ8 * transformedNormalsX[normalOrFaceQueueIndex] + transformedNormalsZ[normalOrFaceQueueIndex] * lightDirectionZQ8 >> 8;
            if (0 > diffuseResponseOrFaceIndex) {
              diffuseResponseOrFaceIndex = -diffuseResponseOrFaceIndex;
            }
            if (diffuseResponseOrFaceIndex >= 0) {
              if (128 <= diffuseResponseOrFaceIndex) {
                diffuseResponseCandidate = 256;
              } else {
                diffuseResponseCandidate = 128 + diffuseResponseOrFaceIndex;
              }
            } else {
              diffuseResponseCandidate = 128;
            }
            diffuseResponseOrFaceIndex = diffuseResponseCandidate;
            specularResponseOrVertexA = halfVectorZQ8 * transformedNormalsZ[normalOrFaceQueueIndex] + (halfVectorXQ8 * transformedNormalsX[normalOrFaceQueueIndex] + halfVectorYQ8 * transformedNormalsY[normalOrFaceQueueIndex]) >> 8;
            specularResponseTableSnapshot = MultiHandleSliderRenderer.meshSpecularResponseByAbsDot;
            if (specularResponseOrVertexA < 0) {
              absoluteHalfVectorDot = -specularResponseOrVertexA;
            } else {
              absoluteHalfVectorDot = specularResponseOrVertexA;
            }
            specularResponseOrVertexA = specularResponseTableSnapshot[absoluteHalfVectorDot];
            diffuseResponseOrFaceIndex = diffuseResponseOrFaceIndex * (256 - specularResponseOrVertexA) >>> 8;
            diffuseResponses[normalOrFaceQueueIndex] = diffuseResponseOrFaceIndex;
            specularResponses[normalOrFaceQueueIndex] = specularResponseOrVertexA;
          }
          for (normalOrFaceQueueIndex = 0; normalOrFaceQueueIndex < GameApplet.queuedMeshFaceCount; normalOrFaceQueueIndex++) {
            diffuseResponseOrFaceIndex = InstrumentNoteMask.meshFaceOrder[normalOrFaceQueueIndex];
            specularResponseOrVertexA = mesh.faceVertexA[diffuseResponseOrFaceIndex];
            faceVertexB = mesh.faceVertexB[diffuseResponseOrFaceIndex];
            faceVertexC = mesh.faceVertexC[diffuseResponseOrFaceIndex];
            if (mesh.faceNormalA[diffuseResponseOrFaceIndex] >= ClientRenderingState.transformedMeshNormalX.length) {
              faceNormalAIndexOrMissing = -1;
            } else {
              faceNormalAIndexOrMissing = mesh.faceNormalA[diffuseResponseOrFaceIndex];
            }
            faceNormalA = faceNormalAIndexOrMissing;
            if (ClientRenderingState.transformedMeshNormalX.length > mesh.faceNormalB[diffuseResponseOrFaceIndex]) {
              faceNormalBIndexOrMissing = mesh.faceNormalB[diffuseResponseOrFaceIndex];
            } else {
              faceNormalBIndexOrMissing = -1;
            }
            faceNormalB = faceNormalBIndexOrMissing;
            if (ClientRenderingState.transformedMeshNormalX.length > mesh.faceNormalC[diffuseResponseOrFaceIndex]) {
              faceNormalCIndexOrMissing = mesh.faceNormalC[diffuseResponseOrFaceIndex];
            } else {
              faceNormalCIndexOrMissing = -1;
            }
            faceNormalC = faceNormalCIndexOrMissing;
            if ((DirectByteStorage.meshMaterials != null) &&
                (mesh.faceMaterialIndices != null) &&
                (mesh.faceMaterialIndices.length > diffuseResponseOrFaceIndex) &&
                (mesh.faceMaterialIndices[diffuseResponseOrFaceIndex] != -1) &&
                (DirectByteStorage.meshMaterials.length > mesh.faceMaterialIndices[diffuseResponseOrFaceIndex])) {
              faceMaterialOrNull = DirectByteStorage.meshMaterials[mesh.faceMaterialIndices[diffuseResponseOrFaceIndex]];
            } else {
              faceMaterialOrNull = null;
            }
            faceMaterial = faceMaterialOrNull;
            vertexAX = SingleChildWidget.projectedMeshVertexX[specularResponseOrVertexA];
            vertexAY = TextInputWidget.projectedMeshVertexY[specularResponseOrVertexA];
            vertexBX = SingleChildWidget.projectedMeshVertexX[faceVertexB];
            vertexBY = TextInputWidget.projectedMeshVertexY[faceVertexB];
            vertexCX = SingleChildWidget.projectedMeshVertexX[faceVertexC];
            vertexCY = TextInputWidget.projectedMeshVertexY[faceVertexC];
            if ((faceNormalA == faceNormalB) &&
                (faceNormalC == faceNormalB)) {
              diffuseA = diffuseResponses[faceNormalA];
              flatSpecularOrDiffuseB = specularResponses[faceNormalA];
              if (faceMaterial != null) {
                flatBaseRgbOrDefault = faceMaterial.baseRgb;
              } else {
                flatBaseRgbOrDefault = 8355711;
              }
              flatBaseRgbOrDiffuseC = flatBaseRgbOrDefault;
              flatRedBlueMaskOrSpecularA = flatBaseRgbOrDiffuseC & 16711935;
              flatGreenMaskOrSpecularB = 65280 & flatBaseRgbOrDiffuseC;
              flatLitRgbOrSpecularC = (-16711703 & flatRedBlueMaskOrSpecularA * diffuseA) >>> 8 | -285147392 & flatGreenMaskOrSpecularB * diffuseA >>> 8;
              flatLitRgbOrSpecularC = flatLitRgbOrSpecularC + flatSpecularOrDiffuseB * 65793;
              IterableNodeHashTable.drawHalfBlendSolidTriangle(vertexCX, -122, vertexCY, vertexBY, vertexBX, vertexAX, vertexAY, 8355711 & flatLitRgbOrSpecularC >> 1);
            } else {
              diffuseA = diffuseResponses[faceNormalA];
              flatSpecularOrDiffuseB = diffuseResponses[faceNormalB];
              flatBaseRgbOrDiffuseC = diffuseResponses[faceNormalC];
              flatRedBlueMaskOrSpecularA = specularResponses[faceNormalA];
              flatGreenMaskOrSpecularB = specularResponses[faceNormalB];
              flatLitRgbOrSpecularC = specularResponses[faceNormalC];
              if (faceMaterial != null) {
                smoothBaseRgbOrDefault = faceMaterial.baseRgb;
              } else {
                smoothBaseRgbOrDefault = 8355711;
              }
              smoothBaseRgb = smoothBaseRgbOrDefault;
              smoothRedBlueMask = smoothBaseRgb & 16711935;
              smoothGreenMask = 65280 & smoothBaseRgb;
              vertexALitRgb = (diffuseA * smoothGreenMask & 16711921) >>> 8 | -822148865 & diffuseA * smoothRedBlueMask >>> 8;
              vertexBLitRgb = (smoothGreenMask * flatSpecularOrDiffuseB & 16711688) >>> 8 | (flatSpecularOrDiffuseB * smoothRedBlueMask & -16711783) >>> 8;
              vertexBLitRgb = vertexBLitRgb + 65793 * flatGreenMaskOrSpecularB;
              vertexALitRgb = vertexALitRgb + 65793 * flatRedBlueMaskOrSpecularA;
              vertexCLitRgb = flatBaseRgbOrDiffuseC * smoothGreenMask >>> 8 & 1543569152 | flatBaseRgbOrDiffuseC * smoothRedBlueMask >>> 8 & -536936193;
              vertexCLitRgb = vertexCLitRgb + flatLitRgbOrSpecularC * 65793;
              EntitySpawnSupport.drawHalfBlendRgbTriangle(255 & vertexALitRgb, 255 & vertexALitRgb >> 8, vertexCLitRgb >> 16, vertexCLitRgb >> 8 & 255, vertexBY, 255 & vertexBLitRgb, vertexALitRgb >> 16, vertexAY, vertexCX, 255 & vertexCLitRgb, -2, vertexBLitRgb >> 16, 255 & vertexBLitRgb >> 8, vertexBX, vertexAX, vertexCY);
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtRenderParameter) {
          caughtRenderFailure = caughtRenderParameter;
          renderFailure = caughtRenderFailure;
          renderFailureBeforeContext = renderFailure;
          renderMessagePrefix = new StringBuilder().append("hi.M(").append(halfVectorZQ8).append(',').append(lightDirectionZQ8).append(',').append(halfVectorXQ8).append(',').append(guard).append(',').append(lightDirectionXQ8).append(',');
          if (mesh == null) {
            meshDescription = "null";
          } else {
            meshDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) renderFailureBeforeContext), ((StringBuilder) (Object) renderMessagePrefix).append(meshDescription).append(',').append(halfVectorYQ8).append(',').append(lightDirectionYQ8).append(')').toString());
        }
    }

    final static int encodeTextSlice(CharSequence text, byte[] destination, int characterStart, int characterEnd, int destinationOffset, int methodGuard) {
        int characterIndex = 0;
        int guardResultBeforeReturn = 0;
        int encodedLengthBeforeReturn = 0;
        RuntimeException encodingFailureBeforeTextDescription = null;
        StringBuilder encodingMessagePrefix = null;
        String textDescription = null;
        StringBuilder encodingMessageBeforeDestination = null;
        String destinationDescription = null;
        RuntimeException caughtEncodingFailure = null;
        int encodedLength = 0;
        RuntimeException encodingFailureForContext = null;
        int characterCode = 0;
        try {
          encodedLength = -characterStart + characterEnd;
          if (methodGuard != 98) {
            guardResultBeforeReturn = 52;
            return guardResultBeforeReturn;
          }
          for (characterIndex = 0; characterIndex < encodedLength; characterIndex++) {
            encodedCharacterHandled: {
              characterCode = text.charAt(characterStart + characterIndex);
              if (!((0 < characterCode) &&
                  (characterCode < 128))) {
                if (!((characterCode >= 160) &&
                    (characterCode <= 255))) {
                  if (characterCode == 8364) {
                    destination[characterIndex + destinationOffset] = (byte)-128;
                    break encodedCharacterHandled;
                  }
                  if (characterCode == 8218) {
                    destination[destinationOffset + characterIndex] = (byte)-126;
                    break encodedCharacterHandled;
                  }
                  if (characterCode == 402) {
                    destination[destinationOffset + characterIndex] = (byte)-125;
                    break encodedCharacterHandled;
                  }
                  if (8222 == characterCode) {
                    destination[characterIndex + destinationOffset] = (byte)-124;
                    break encodedCharacterHandled;
                  }
                  if (8230 == characterCode) {
                    destination[characterIndex + destinationOffset] = (byte)-123;
                    break encodedCharacterHandled;
                  }
                  if (characterCode == 8224) {
                    destination[destinationOffset + characterIndex] = (byte)-122;
                    break encodedCharacterHandled;
                  }
                  if (characterCode == 8225) {
                    destination[characterIndex + destinationOffset] = (byte)-121;
                    break encodedCharacterHandled;
                  }
                  if (characterCode == 710) {
                    destination[characterIndex + destinationOffset] = (byte)-120;
                    break encodedCharacterHandled;
                  }
                  if (8240 == characterCode) {
                    destination[characterIndex + destinationOffset] = (byte)-119;
                    break encodedCharacterHandled;
                  }
                  if (characterCode == 352) {
                    destination[destinationOffset + characterIndex] = (byte)-118;
                    break encodedCharacterHandled;
                  }
                  if (characterCode == 8249) {
                    destination[destinationOffset + characterIndex] = (byte)-117;
                    break encodedCharacterHandled;
                  }
                  if (characterCode == 338) {
                    destination[characterIndex + destinationOffset] = (byte)-116;
                    break encodedCharacterHandled;
                  }
                  if (381 == characterCode) {
                    destination[characterIndex + destinationOffset] = (byte)-114;
                    break encodedCharacterHandled;
                  }
                  if (characterCode == 8216) {
                    destination[destinationOffset + characterIndex] = (byte)-111;
                    break encodedCharacterHandled;
                  }
                  if (characterCode == 8217) {
                    destination[destinationOffset + characterIndex] = (byte)-110;
                    break encodedCharacterHandled;
                  }
                  if (characterCode == 8220) {
                    destination[characterIndex + destinationOffset] = (byte)-109;
                    break encodedCharacterHandled;
                  }
                  if (characterCode == 8221) {
                    destination[destinationOffset + characterIndex] = (byte)-108;
                    break encodedCharacterHandled;
                  }
                  if (8226 == characterCode) {
                    destination[destinationOffset + characterIndex] = (byte)-107;
                    break encodedCharacterHandled;
                  }
                  if (8211 == characterCode) {
                    destination[characterIndex + destinationOffset] = (byte)-106;
                    break encodedCharacterHandled;
                  }
                  if (characterCode == 8212) {
                    destination[destinationOffset + characterIndex] = (byte)-105;
                    break encodedCharacterHandled;
                  }
                  if (characterCode == 732) {
                    destination[characterIndex + destinationOffset] = (byte)-104;
                    break encodedCharacterHandled;
                  }
                  if (characterCode == 8482) {
                    destination[destinationOffset + characterIndex] = (byte)-103;
                    break encodedCharacterHandled;
                  }
                  if (characterCode == 353) {
                    destination[destinationOffset + characterIndex] = (byte)-102;
                    break encodedCharacterHandled;
                  }
                  if (characterCode == 8250) {
                    destination[characterIndex + destinationOffset] = (byte)-101;
                    break encodedCharacterHandled;
                  }
                  if (339 == characterCode) {
                    destination[characterIndex + destinationOffset] = (byte)-100;
                    break encodedCharacterHandled;
                  }
                  if (characterCode == 382) {
                    destination[characterIndex + destinationOffset] = (byte)-98;
                    break encodedCharacterHandled;
                  }
                  if (characterCode != 376) {
                    destination[characterIndex + destinationOffset] = (byte)63;
                    break encodedCharacterHandled;
                  }
                  destination[characterIndex + destinationOffset] = (byte)-97;
                  break encodedCharacterHandled;
                }
              }
              destination[destinationOffset + characterIndex] = (byte)characterCode;
            }
          }
          encodedLengthBeforeReturn = encodedLength;
          return encodedLengthBeforeReturn;
        } catch (java.lang.RuntimeException encodingFailure) {
          caughtEncodingFailure = encodingFailure;
          encodingFailureForContext = caughtEncodingFailure;
          encodingFailureBeforeTextDescription = encodingFailureForContext;
          encodingMessagePrefix = new StringBuilder().append("hi.N(");
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          encodingMessageBeforeDestination = ((StringBuilder) (Object) encodingMessagePrefix).append(textDescription).append(',');
          if (destination == null) {
            destinationDescription = "null";
          } else {
            destinationDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) encodingFailureBeforeTextDescription), ((StringBuilder) (Object) encodingMessageBeforeDestination).append(destinationDescription).append(',').append(characterStart).append(',').append(characterEnd).append(',').append(destinationOffset).append(',').append(methodGuard).append(')').toString());
        }
    }

    private final boolean isValidationSourceAccepted(int methodGuard, ValidationProviderSource validationSource) {
        ValidationProvider validationProvider = null;
        RuntimeException acceptanceFailureForContext = null;
        int guardQuotient = 0;
        ValidationState validationState = null;
        boolean acceptedBeforeReturn = false;
        RuntimeException acceptanceFailureBeforeDescription = null;
        StringBuilder acceptanceMessagePrefix = null;
        String validationSourceDescription = null;
        RuntimeException caughtAcceptanceFailure = null;
        try {
          validationProvider = validationSource.getValidationProvider((byte) -98);
          if (validationProvider == null) {
            return true;
          }
          guardQuotient = 37 / ((-70 - methodGuard) / 38);
          validationState = validationProvider.getDebouncedValidationState((byte) -105);
          acceptedBeforeReturn = !(validationState != SocketArchiveNetworkClient.validInputValidationState);
          return acceptedBeforeReturn;
        } catch (java.lang.RuntimeException acceptanceFailure) {
          caughtAcceptanceFailure = acceptanceFailure;
          acceptanceFailureForContext = caughtAcceptanceFailure;
          acceptanceFailureBeforeDescription = acceptanceFailureForContext;
          acceptanceMessagePrefix = new StringBuilder().append("hi.J(").append(methodGuard).append(',');
          if (validationSource == null) {
            validationSourceDescription = "null";
          } else {
            validationSourceDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) acceptanceFailureBeforeDescription), ((StringBuilder) (Object) acceptanceMessagePrefix).append(validationSourceDescription).append(')').toString());
        }
    }

    public final void onButtonActivated(int buttonX, byte methodGuard, int buttonY, int pointerButton, ButtonWidget button) {
        boolean discardedGuardValidationResult = false;
        ValidationProviderSource nullValidationSourceSnapshot = null;
        RuntimeException activationFailureBeforeDescription = null;
        StringBuilder activationMessagePrefix = null;
        String activatedButtonDescription = null;
        RuntimeException caughtActivationFailure = null;
        RuntimeException activationFailureForContext = null;
        try {
          if (this.cancelButton != button) {
            if (this.confirmButton == button) {
              this.submitValidatedDisplayName(-50);
            }
          } else {
            DebouncedValidationProvider.showEmptyLoginForm(24107);
          }
          if (methodGuard != -20) {
            nullValidationSourceSnapshot = (ValidationProviderSource) null;
            discardedGuardValidationResult = this.isValidationSourceAccepted(-4, (ValidationProviderSource) null);
          }
          return;
        } catch (java.lang.RuntimeException activationFailure) {
          caughtActivationFailure = activationFailure;
          activationFailureForContext = caughtActivationFailure;
          activationFailureBeforeDescription = activationFailureForContext;
          activationMessagePrefix = new StringBuilder().append("hi.Q(").append(buttonX).append(',').append(methodGuard).append(',').append(buttonY).append(',').append(pointerButton).append(',');
          if (button == null) {
            activatedButtonDescription = "null";
          } else {
            activatedButtonDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) activationFailureBeforeDescription), ((StringBuilder) (Object) activationMessagePrefix).append(activatedButtonDescription).append(')').toString());
        }
    }

    public final void onSuggestionSelected(String suggestion, int methodGuard) {
        ValidatedTextInputWidget displayNameInputSnapshot = null;
        String selectedSuggestionSnapshot = null;
        try {
            if (methodGuard != 20) {
                this.cancelButton = (ButtonWidget) null;
            }
            displayNameInputSnapshot = this.displayNameInput;
            selectedSuggestionSnapshot = suggestion;
            ((TextInputWidget) ((Object) displayNameInputSnapshot)).setInputText(methodGuard - 136, selectedSuggestionSnapshot, false);
        } catch (RuntimeException suggestionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) suggestionFailure), "hi.P(" + (suggestion != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    final void updatePointerState(boolean hoverGuard, int parentY, UiWidget eventContext, int parentX) {
        try {
            super.updatePointerState(hoverGuard, parentY, eventContext, parentX);
            this.confirmButton.enabled = this.isDisplayNameAccepted((byte) -118);
        } catch (RuntimeException pointerUpdateFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) pointerUpdateFailure), "hi.H(" + hoverGuard + ',' + parentY + ',' + (eventContext != null ? "{...}" : "null") + ',' + parentX + ')');
        }
    }

    public static void releaseStaticReferences(byte methodGuard) {
        if (methodGuard > -45) {
            return;
        }
        createIneligibleText = null;
        bakingForegroundSprite = null;
    }

    final boolean handleKeyInput(int keyCode, int methodGuard, char typedCharacter, UiWidget eventContext) {
        boolean discardedGuardAcceptanceResult = false;
        RuntimeException keyFailureForContext = null;
        boolean previousFocusResult = false;
        boolean nextFocusResult = false;
        RuntimeException keyFailureBeforeDescription = null;
        StringBuilder keyMessagePrefix = null;
        String eventContextDescription = null;
        RuntimeException caughtKeyFailure = null;
        try {
          if (methodGuard != 13) {
            discardedGuardAcceptanceResult = this.isDisplayNameAccepted((byte) -45);
          }
          if (super.handleKeyInput(keyCode, methodGuard + 0, typedCharacter, eventContext)) {
            return true;
          }
          if (98 == keyCode) {
            previousFocusResult = this.requestPreviousChildFocus(7305, eventContext);
            return previousFocusResult;
          }
          if (keyCode != 99) {
            return false;
          }
          nextFocusResult = this.requestNextChildFocus(eventContext, -96);
          return nextFocusResult;
        } catch (java.lang.RuntimeException keyFailure) {
          caughtKeyFailure = keyFailure;
          keyFailureForContext = caughtKeyFailure;
          keyFailureBeforeDescription = keyFailureForContext;
          keyMessagePrefix = new StringBuilder().append("hi.I(").append(keyCode).append(',').append(methodGuard).append(',').append(typedCharacter).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) keyFailureBeforeDescription), ((StringBuilder) (Object) keyMessagePrefix).append(eventContextDescription).append(')').toString());
        }
    }

    public final void onMoreSuggestionsRequested(byte methodGuard) {
        ((UsernameAvailabilityValidator) ((Object) this.displayNameInput.getValidationProvider((byte) -117))).invalidateCachedUsernameAvailability((byte) -80);
        if (methodGuard != 83) {
            this.confirmButton = (ButtonWidget) null;
        }
    }

    private final int addDisplayNameInputRow(int rowY, int methodGuard, int inputWidth, UiWidget inputWidget, String fallbackMessage, String labelText) {
        RuntimeException layoutFailureForContext = null;
        int rowHeightBeforeReturn = 0;
        RuntimeException layoutFailureBeforeDescriptions = null;
        StringBuilder layoutMessagePrefix = null;
        String inputDescription = null;
        StringBuilder layoutMessageBeforeFallback = null;
        String fallbackDescription = null;
        StringBuilder layoutMessageBeforeLabel = null;
        String labelDescription = null;
        RuntimeException caughtLayoutFailure = null;
        try {
          if (methodGuard != -12037) {
            connectionRetryDeadlineMillis = 55L;
          }
          rowHeightBeforeReturn = this.addLabeledValidatedInput(rowY, -116, labelText, fallbackMessage, 35, inputWidth, inputWidget);
          return rowHeightBeforeReturn;
        } catch (java.lang.RuntimeException layoutFailure) {
          caughtLayoutFailure = layoutFailure;
          layoutFailureForContext = caughtLayoutFailure;
          layoutFailureBeforeDescriptions = layoutFailureForContext;
          layoutMessagePrefix = new StringBuilder().append("hi.G(").append(rowY).append(',').append(methodGuard).append(',').append(inputWidth).append(',');
          if (inputWidget == null) {
            inputDescription = "null";
          } else {
            inputDescription = "{...}";
          }
          layoutMessageBeforeFallback = ((StringBuilder) (Object) layoutMessagePrefix).append(inputDescription).append(',');
          if (fallbackMessage == null) {
            fallbackDescription = "null";
          } else {
            fallbackDescription = "{...}";
          }
          layoutMessageBeforeLabel = ((StringBuilder) (Object) layoutMessageBeforeFallback).append(fallbackDescription).append(',');
          if (labelText == null) {
            labelDescription = "null";
          } else {
            labelDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) layoutFailureBeforeDescriptions), ((StringBuilder) (Object) layoutMessageBeforeLabel).append(labelDescription).append(')').toString());
        }
    }

    private final void submitValidatedDisplayName(int methodGuard) {
        if (!this.isDisplayNameAccepted((byte) -118)) {
            return;
        }
        if (methodGuard >= -42) {
            return;
        }
        EmailValidator.setOptionalLoginTextAndShowLoggingIn(12607, this.displayNameInput.widgetText);
    }

    static {
        livePointerPressY = 0;
        createIneligibleText = "Unfortunately you are not eligible to create an account.";
    }
}
