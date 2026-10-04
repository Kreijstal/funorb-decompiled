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
    static long field_G;
    private ButtonWidget cancelButton;

    private final boolean h(byte param0) {
        if (!this.a(-115, (ValidationProviderSource) (this.displayNameInput))) {
            return false;
        }
        if (param0 != -118) {
            this.confirmButton = (ButtonWidget) null;
            return true;
        }
        return true;
    }

    public DisplayNamePanel() {
        super(0, 0, 496, 0, (WidgetRenderer) null);
        this.displayNameInput = new ValidatedTextInputWidget("", (WidgetListener) null, 12);
        TextWidgetRenderer var1 = new TextWidgetRenderer(UiFontResources.commonUiSmallFont, 0, 0, 0, 0, 16777215, -1, 3, 0, DialogLayer.sharedUiFont.maxAscent, -1, 2147483647, true);
        UiWidget var2 = new UiWidget(ClientTimingSupport.loginNoDisplayNameText, var1, (WidgetListener) null);
        this.confirmButton = new ButtonWidget(MatchScoringSupport.okText, (WidgetListener) null);
        this.cancelButton = new ButtonWidget(TextTemplateArgumentType.cancelText, (WidgetListener) null);
        this.displayNameInput.hoverText = AchievementProtocolSupport.createDisplayNameTooltipText;
        this.displayNameInput.a((byte) -58, new UsernameAvailabilityValidator(this.displayNameInput));
        this.confirmButton.enabled = false;
        this.confirmButton.renderer = (WidgetRenderer) ((Object) new SpriteButtonRenderer());
        this.cancelButton.renderer = (WidgetRenderer) ((Object) new UnderlinedButtonRenderer());
        this.displayNameInput.renderer = (WidgetRenderer) ((Object) new TextInputRenderer(10000536));
        int var3 = 20;
        int var4 = 4;
        var2.setWidgetBounds(50, 270, (byte) -8, var3, 20);
        int var5 = 200;
        this.addChild((byte) -110, var2);
        var3 += 50;
        var3 = var3 + (5 + this.a(var3, -12037, 170, this.displayNameInput, ClientProtocolStage.createDisplayNameHintText, OpacityWidget.createDisplayNameText));
        this.confirmButton.setWidgetBounds(40, var5, (byte) -23, var3, -var5 + 496 >> 1);
        this.cancelButton.setWidgetBounds(40, 60, (byte) -85, var3 + 15, 3 + var4);
        this.cancelButton.listener = (WidgetListener) (this);
        this.confirmButton.listener = (WidgetListener) (this);
        this.addChild((byte) -102, this.confirmButton);
        this.addChild((byte) -105, this.cancelButton);
        this.usernameSuggestions = new UsernameSuggestionsPanel((UsernameSuggestionListener) (this));
        this.usernameSuggestions.setWidgetBounds(150, -60 + this.widgetWidth + (-this.displayNameInput.widgetX - this.displayNameInput.widgetWidth), (byte) -54, 20, 60 + this.displayNameInput.widgetX + this.displayNameInput.widgetWidth);
        this.addChild((byte) -102, this.usernameSuggestions);
        this.setWidgetBounds(var4 + 55 + var3, 496, (byte) -55, 0, 0);
    }

    private final int a(int param0, int param1, String param2, String param3, int param4, int param5, UiWidget param6) {
        RuntimeException var8 = null;
        ValidationMessageWidget var9 = null;
        int var10 = 0;
        LabeledChildWidget var11 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var11 = new LabeledChildWidget(20, param0, param5 + 120, 25, param6, false, 120, 3, DialogLayer.sharedUiFont, 16777215, param2);
          var10 = -110 / ((70 - param1) / 33);
          this.addChild((byte) -108, var11);
          var9 = new ValidationMessageWidget(((ValidationProviderSource) ((Object) param6)).getValidationProvider((byte) -113), param3, 126, param0 + var11.widgetHeight, 25 + param5, param4);
          var9.listener = (WidgetListener) (this);
          this.addChild((byte) -115, var9);
          stackIn_1_0 = var9.widgetHeight + var11.widgetHeight;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("hi.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
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
            L1: {
              characterCode = text.charAt(characterStart + characterIndex);
              if (!((0 < characterCode) &&
                  (characterCode < 128))) {
                if (!((characterCode >= 160) &&
                    (characterCode <= 255))) {
                  if (characterCode == 8364) {
                    destination[characterIndex + destinationOffset] = (byte)-128;
                    break L1;
                  }
                  if (characterCode == 8218) {
                    destination[destinationOffset + characterIndex] = (byte)-126;
                    break L1;
                  }
                  if (characterCode == 402) {
                    destination[destinationOffset + characterIndex] = (byte)-125;
                    break L1;
                  }
                  if (8222 == characterCode) {
                    destination[characterIndex + destinationOffset] = (byte)-124;
                    break L1;
                  }
                  if (8230 == characterCode) {
                    destination[characterIndex + destinationOffset] = (byte)-123;
                    break L1;
                  }
                  if (characterCode == 8224) {
                    destination[destinationOffset + characterIndex] = (byte)-122;
                    break L1;
                  }
                  if (characterCode == 8225) {
                    destination[characterIndex + destinationOffset] = (byte)-121;
                    break L1;
                  }
                  if (characterCode == 710) {
                    destination[characterIndex + destinationOffset] = (byte)-120;
                    break L1;
                  }
                  if (8240 == characterCode) {
                    destination[characterIndex + destinationOffset] = (byte)-119;
                    break L1;
                  }
                  if (characterCode == 352) {
                    destination[destinationOffset + characterIndex] = (byte)-118;
                    break L1;
                  }
                  if (characterCode == 8249) {
                    destination[destinationOffset + characterIndex] = (byte)-117;
                    break L1;
                  }
                  if (characterCode == 338) {
                    destination[characterIndex + destinationOffset] = (byte)-116;
                    break L1;
                  }
                  if (381 == characterCode) {
                    destination[characterIndex + destinationOffset] = (byte)-114;
                    break L1;
                  }
                  if (characterCode == 8216) {
                    destination[destinationOffset + characterIndex] = (byte)-111;
                    break L1;
                  }
                  if (characterCode == 8217) {
                    destination[destinationOffset + characterIndex] = (byte)-110;
                    break L1;
                  }
                  if (characterCode == 8220) {
                    destination[characterIndex + destinationOffset] = (byte)-109;
                    break L1;
                  }
                  if (characterCode == 8221) {
                    destination[destinationOffset + characterIndex] = (byte)-108;
                    break L1;
                  }
                  if (8226 == characterCode) {
                    destination[destinationOffset + characterIndex] = (byte)-107;
                    break L1;
                  }
                  if (8211 == characterCode) {
                    destination[characterIndex + destinationOffset] = (byte)-106;
                    break L1;
                  }
                  if (characterCode == 8212) {
                    destination[destinationOffset + characterIndex] = (byte)-105;
                    break L1;
                  }
                  if (characterCode == 732) {
                    destination[characterIndex + destinationOffset] = (byte)-104;
                    break L1;
                  }
                  if (characterCode == 8482) {
                    destination[destinationOffset + characterIndex] = (byte)-103;
                    break L1;
                  }
                  if (characterCode == 353) {
                    destination[destinationOffset + characterIndex] = (byte)-102;
                    break L1;
                  }
                  if (characterCode == 8250) {
                    destination[characterIndex + destinationOffset] = (byte)-101;
                    break L1;
                  }
                  if (339 == characterCode) {
                    destination[characterIndex + destinationOffset] = (byte)-100;
                    break L1;
                  }
                  if (characterCode == 382) {
                    destination[characterIndex + destinationOffset] = (byte)-98;
                    break L1;
                  }
                  if (characterCode != 376) {
                    destination[characterIndex + destinationOffset] = (byte)63;
                    break L1;
                  }
                  destination[characterIndex + destinationOffset] = (byte)-97;
                  break L1;
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

    private final boolean a(int param0, ValidationProviderSource param1) {
        ValidationProvider var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ValidationState var5 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.getValidationProvider((byte) -98);
          if (var3 == null) {
            return true;
          }
          var4 = 37 / ((-70 - param0) / 38);
          var5 = var3.a((byte) -105);
          stackIn_7_0 = !(var5 != SocketArchiveNetworkClient.field_w);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("hi.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void onButtonActivated(int param0, byte param1, int param2, int param3, ButtonWidget param4) {
        boolean discarded$1 = false;
        ValidationProviderSource var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.cancelButton != param4) {
            if (this.confirmButton == param4) {
              this.f(-50);
            }
          } else {
            DebouncedValidationProvider.d(24107);
          }
          if (param1 != -20) {
            var7 = (ValidationProviderSource) null;
            discarded$1 = this.a(-4, (ValidationProviderSource) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("hi.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void onSuggestionSelected(String suggestion, int methodGuard) {
        ValidatedTextInputWidget var3 = null;
        String var4 = null;
        try {
            if (methodGuard != 20) {
                this.cancelButton = (ButtonWidget) null;
            }
            var3 = this.displayNameInput;
            var4 = suggestion;
            ((TextInputWidget) ((Object) var3)).a(methodGuard - 136, var4, false);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "hi.P(" + (suggestion != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    final void updatePointerState(boolean hoverGuard, int parentY, UiWidget eventContext, int parentX) {
        try {
            super.updatePointerState(hoverGuard, parentY, eventContext, parentX);
            this.confirmButton.enabled = this.h((byte) -118);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "hi.H(" + hoverGuard + ',' + parentY + ',' + (eventContext != null ? "{...}" : "null") + ',' + parentX + ')');
        }
    }

    public static void i(byte param0) {
        if (param0 > -45) {
            return;
        }
        createIneligibleText = null;
        bakingForegroundSprite = null;
    }

    final boolean handleKeyInput(int param0, int param1, char param2, UiWidget param3) {
        boolean discarded$1 = false;
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 13) {
            discarded$1 = this.h((byte) -45);
          }
          if (super.handleKeyInput(param0, param1 + 0, param2, param3)) {
            return true;
          }
          if (98 == param0) {
            stackIn_7_0 = this.a(7305, param3);
            return stackIn_7_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_10_0 = this.a(param3, -96);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("hi.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final void onMoreSuggestionsRequested(byte methodGuard) {
        ((UsernameAvailabilityValidator) ((Object) this.displayNameInput.getValidationProvider((byte) -117))).c((byte) -80);
        if (methodGuard != 83) {
            this.confirmButton = (ButtonWidget) null;
        }
    }

    private final int a(int param0, int param1, int param2, UiWidget param3, String param4, String param5) {
        RuntimeException var7 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -12037) {
            field_G = 55L;
          }
          stackIn_3_0 = this.a(param0, -116, param5, param4, 35, param2, param3);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("hi.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void f(int param0) {
        if (!this.h((byte) -118)) {
            return;
        }
        if (param0 >= -42) {
            return;
        }
        EmailValidator.c(12607, this.displayNameInput.widgetText);
    }

    static {
        livePointerPressY = 0;
        createIneligibleText = "Unfortunately you are not eligible to create an account.";
    }
}
