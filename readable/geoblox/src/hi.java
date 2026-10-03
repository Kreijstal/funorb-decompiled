/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends ee implements ta, pl {
    private hc field_E;
    static volatile int livePointerPressY;
    vh field_D;
    private hk field_H;
    static Sprite bakingForegroundSprite;
    static String createIneligibleText;
    static long field_G;
    private hk field_J;

    private final boolean h(byte param0) {
        if (!this.a(-115, (nl) (this.field_E))) {
            return false;
        }
        if (param0 != -118) {
            this.field_H = (hk) null;
            return true;
        }
        return true;
    }

    public hi() {
        super(0, 0, 496, 0, (dh) null);
        this.field_E = new hc("", (bb) null, 12);
        ff var1 = new ff(hh.field_d, 0, 0, 0, 0, 16777215, -1, 3, 0, ng.field_F.maxAscent, -1, 2147483647, true);
        el var2 = new el(sb.loginNoDisplayNameText, var1, (bb) null);
        this.field_H = new hk(ec.okText, (bb) null);
        this.field_J = new hk(ck.cancelText, (bb) null);
        this.field_E.field_j = ud.createDisplayNameTooltipText;
        this.field_E.a((byte) -58, new uk(this.field_E));
        this.field_H.field_D = false;
        this.field_H.field_q = (dh) ((Object) new ml());
        this.field_J.field_q = (dh) ((Object) new fh());
        this.field_E.field_q = (dh) ((Object) new ac(10000536));
        int var3 = 20;
        int var4 = 4;
        var2.a(50, 270, (byte) -8, var3, 20);
        int var5 = 200;
        this.b((byte) -110, var2);
        var3 += 50;
        var3 = var3 + (5 + this.a(var3, -12037, 170, this.field_E, gk.createDisplayNameHintText, wj.createDisplayNameText));
        this.field_H.a(40, var5, (byte) -23, var3, -var5 + 496 >> 1);
        this.field_J.a(40, 60, (byte) -85, var3 + 15, 3 + var4);
        this.field_J.field_u = (bb) (this);
        this.field_H.field_u = (bb) (this);
        this.b((byte) -102, this.field_H);
        this.b((byte) -105, this.field_J);
        this.field_D = new vh((ta) (this));
        this.field_D.a(150, -60 + this.field_r + (-this.field_E.field_v - this.field_E.field_r), (byte) -54, 20, 60 + this.field_E.field_v + this.field_E.field_r);
        this.b((byte) -102, this.field_D);
        this.a(var4 + 55 + var3, 496, (byte) -55, 0, 0);
    }

    private final int a(int param0, int param1, String param2, String param3, int param4, int param5, el param6) {
        RuntimeException var8 = null;
        pi var9 = null;
        int var10 = 0;
        hd var11 = null;
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
          var11 = new hd(20, param0, param5 + 120, 25, param6, false, 120, 3, ng.field_F, 16777215, param2);
          var10 = -110 / ((70 - param1) / 33);
          this.b((byte) -108, var11);
          var9 = new pi(((nl) ((Object) param6)).a((byte) -113), param3, 126, param0 + var11.field_h, 25 + param5, param4);
          var9.field_u = (bb) (this);
          this.b((byte) -115, var9);
          stackIn_1_0 = var9.field_h + var11.field_h;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = (RuntimeException) (var8);
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
          throw t.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
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
        controlFlagSnapshot = Geoblox.field_C;
        try {
          L0: {
            meshForPriorityDecision = mesh;
            if (null != meshForPriorityDecision.facePriorities) {
              if (meshForPriorityDecision.facePriorityCount > 1) {
                facePriorities = meshForPriorityDecision.facePriorities;
                va.a(0, facePriorities, 0, uh.meshFacePriorityWriteOffsets, (byte) -85);
                break L0;
              }
            }
            vc.d(2971);
          }
          if (guard != 6562) {
            return;
          }
          diffuseResponses = new int[mesh.normalCount];
          diffuseResponsesFirstAlias = diffuseResponses;
          diffuseResponsesSecondAlias = diffuseResponsesFirstAlias;
          diffuseResponsesThirdAlias = diffuseResponsesSecondAlias;
          specularResponses = new int[mesh.normalCount];
          transformedNormalsX = ok.transformedMeshNormalX;
          transformedNormalsY = oa.transformedMeshNormalY;
          transformedNormalsZ = gi.transformedMeshNormalZ;
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
            specularResponseTableSnapshot = jf.meshSpecularResponseByAbsDot;
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
          for (normalOrFaceQueueIndex = 0; normalOrFaceQueueIndex < ch.queuedMeshFaceCount; normalOrFaceQueueIndex++) {
            diffuseResponseOrFaceIndex = pj.meshFaceOrder[normalOrFaceQueueIndex];
            specularResponseOrVertexA = mesh.faceVertexA[diffuseResponseOrFaceIndex];
            faceVertexB = mesh.faceVertexB[diffuseResponseOrFaceIndex];
            faceVertexC = mesh.faceVertexC[diffuseResponseOrFaceIndex];
            if (mesh.faceNormalA[diffuseResponseOrFaceIndex] >= ok.transformedMeshNormalX.length) {
              faceNormalAIndexOrMissing = -1;
            } else {
              faceNormalAIndexOrMissing = mesh.faceNormalA[diffuseResponseOrFaceIndex];
            }
            faceNormalA = faceNormalAIndexOrMissing;
            if (ok.transformedMeshNormalX.length > mesh.faceNormalB[diffuseResponseOrFaceIndex]) {
              faceNormalBIndexOrMissing = mesh.faceNormalB[diffuseResponseOrFaceIndex];
            } else {
              faceNormalBIndexOrMissing = -1;
            }
            faceNormalB = faceNormalBIndexOrMissing;
            if (ok.transformedMeshNormalX.length > mesh.faceNormalC[diffuseResponseOrFaceIndex]) {
              faceNormalCIndexOrMissing = mesh.faceNormalC[diffuseResponseOrFaceIndex];
            } else {
              faceNormalCIndexOrMissing = -1;
            }
            L7: {
              faceNormalC = faceNormalCIndexOrMissing;
              if (l.meshMaterials != null) {
                if (mesh.faceMaterialIndices != null) {
                  if (mesh.faceMaterialIndices.length > diffuseResponseOrFaceIndex) {
                    if (mesh.faceMaterialIndices[diffuseResponseOrFaceIndex] != -1) {
                      if (l.meshMaterials.length > mesh.faceMaterialIndices[diffuseResponseOrFaceIndex]) {
                        faceMaterialOrNull = l.meshMaterials[mesh.faceMaterialIndices[diffuseResponseOrFaceIndex]];
                        break L7;
                      }
                    }
                  }
                }
              }
              faceMaterialOrNull = null;
            }
            L9: {
              faceMaterial = faceMaterialOrNull;
              vertexAX = sh.projectedMeshVertexX[specularResponseOrVertexA];
              vertexAY = dj.projectedMeshVertexY[specularResponseOrVertexA];
              vertexBX = sh.projectedMeshVertexX[faceVertexB];
              vertexBY = dj.projectedMeshVertexY[faceVertexB];
              vertexCX = sh.projectedMeshVertexX[faceVertexC];
              vertexCY = dj.projectedMeshVertexY[faceVertexC];
              if (faceNormalA == faceNormalB) {
                if (faceNormalC == faceNormalB) {
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
                  gi.a(vertexCX, -122, vertexCY, vertexBY, vertexBX, vertexAX, vertexAY, 8355711 & flatLitRgbOrSpecularC >> 1);
                  break L9;
                }
              }
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
              nb.drawHalfBlendRgbTriangle(255 & vertexALitRgb, 255 & vertexALitRgb >> 8, vertexCLitRgb >> 16, vertexCLitRgb >> 8 & 255, vertexBY, 255 & vertexBLitRgb, vertexALitRgb >> 16, vertexAY, vertexCX, 255 & vertexCLitRgb, -2, vertexBLitRgb >> 16, 255 & vertexBLitRgb >> 8, vertexBX, vertexAX, vertexCY);
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtRenderParameter) {
          caughtRenderFailure = caughtRenderParameter;
          renderFailure = caughtRenderFailure;
          renderFailureBeforeContext = (RuntimeException) (renderFailure);
          renderMessagePrefix = new StringBuilder().append("hi.M(").append(halfVectorZQ8).append(',').append(lightDirectionZQ8).append(',').append(halfVectorXQ8).append(',').append(guard).append(',').append(lightDirectionXQ8).append(',');
          if (mesh == null) {
            meshDescription = "null";
          } else {
            meshDescription = "{...}";
          }
          throw t.a((Throwable) ((Object) renderFailureBeforeContext), ((StringBuilder) (Object) renderMessagePrefix).append(meshDescription).append(',').append(halfVectorYQ8).append(',').append(lightDirectionYQ8).append(')').toString());
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
              L2: {
                characterCode = text.charAt(characterStart + characterIndex);
                if (0 < characterCode) {
                  if (characterCode < 128) {
                    break L2;
                  }
                }
                if (characterCode >= 160) {
                  if (characterCode <= 255) {
                    break L2;
                  }
                }
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
              destination[destinationOffset + characterIndex] = (byte)characterCode;
            }
          }
          encodedLengthBeforeReturn = encodedLength;
          return encodedLengthBeforeReturn;
        } catch (java.lang.RuntimeException encodingFailure) {
          caughtEncodingFailure = encodingFailure;
          encodingFailureForContext = caughtEncodingFailure;
          encodingFailureBeforeTextDescription = (RuntimeException) (encodingFailureForContext);
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
          throw t.a((Throwable) ((Object) encodingFailureBeforeTextDescription), ((StringBuilder) (Object) encodingMessageBeforeDestination).append(destinationDescription).append(',').append(characterStart).append(',').append(characterEnd).append(',').append(destinationOffset).append(',').append(methodGuard).append(')').toString());
        }
    }

    private final boolean a(int param0, nl param1) {
        dg var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        lh var5 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.a((byte) -98);
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
          stackIn_10_0 = (RuntimeException) (var3_ref);
          stackIn_10_1 = new StringBuilder().append("hi.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void a(int param0, byte param1, int param2, int param3, hk param4) {
        boolean discarded$1 = false;
        nl var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (this.field_J != param4) {
            if (this.field_H == param4) {
              this.f(-50);
            }
          } else {
            ib.d(24107);
          }
          if (param1 != -20) {
            var7 = (nl) null;
            discarded$1 = this.a(-4, (nl) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var6);
          stackIn_10_1 = new StringBuilder().append("hi.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void a(String param0, int param1) {
        hc var3 = null;
        String var4 = null;
        try {
            if (param1 != 20) {
                this.field_J = (hk) null;
            }
            var3 = this.field_E;
            var4 = param0;
            ((dj) ((Object) var3)).a(param1 - 136, var4, false);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hi.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, int param1, el param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_H.field_D = this.h((byte) -118);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hi.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void i(byte param0) {
        if (param0 > -45) {
            return;
        }
        createIneligibleText = null;
        bakingForegroundSprite = null;
    }

    final boolean a(int param0, int param1, char param2, el param3) {
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
          if (super.a(param0, param1 + 0, param2, param3)) {
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
          stackIn_15_0 = (RuntimeException) (var5);
          stackIn_15_1 = new StringBuilder().append("hi.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final void a(byte param0) {
        ((uk) ((Object) this.field_E.a((byte) -117))).c((byte) -80);
        if (param0 != 83) {
            this.field_H = (hk) null;
        }
    }

    private final int a(int param0, int param1, int param2, el param3, String param4, String param5) {
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
          stackIn_6_0 = (RuntimeException) (var7);
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
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void f(int param0) {
        if (!this.h((byte) -118)) {
            return;
        }
        if (param0 >= -42) {
            return;
        }
        ag.c(12607, this.field_E.field_s);
    }

    static {
        livePointerPressY = 0;
        createIneligibleText = "Unfortunately you are not eligible to create an account.";
    }
}
