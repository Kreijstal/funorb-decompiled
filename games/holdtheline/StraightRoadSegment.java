/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class StraightRoadSegment extends RoadSegment {
    Point2i end;
    float blendStartAngle;
    static String field_H;
    int rightRoadStartOffset;
    int rightCollisionEndOffset;
    int rightCollisionStartOffset;
    float blendEndAngle;
    float offsetDirectionX;
    int leftCollisionStartOffset;
    int leftCollisionEndOffset;
    static int[] field_E;
    int leftRoadEndOffset;
    int controlPathEndOffset;
    int rightRoadEndOffset;
    int leftRoadStartOffset;
    float segmentLength;
    float offsetDirectionY;
    Point2i start;
    int controlPathStartOffset;

    final Point2i getLeftCollisionEnd(int param0) {
        if (param0 != 8421504) {
          this.rightRoadEndOffset = 36;
        }
        if (3.141592653589793 == (double)this.blendEndAngle) {
          return new Point2i((int)((float)this.end.x + (float)this.leftCollisionEndOffset * this.offsetDirectionX), (int)((float)this.end.y + (float)this.leftCollisionEndOffset * this.offsetDirectionY));
        }
        return this.leftCollisionEdgeAt(1.0f, 94);
    }

    final Point2i rightCollisionEdgeAt(int param0, float param1) {
        float var3 = (float)this.rightCollisionOffsetAt(36, param1);
        if (param0 != -851) {
          this.rightRoadEdgeAt(0.5826309323310852f, true);
        }
        float var4 = var3 * this.offsetDirectionX + (param1 * (float)(this.end.x - this.start.x) + (float)this.start.x);
        float var5 = var3 * this.offsetDirectionY + ((float)this.start.y + (float)(this.end.y - this.start.y) * param1);
        return new Point2i((int)var4, (int)var5);
    }

    final Point2i getControlPathStart(int param0) {
        float var2 = -((float)this.controlPathStartOffset * this.offsetDirectionX) + (float)this.start.x;
        if (param0 != -1) {
          this.getRightRoadEnd((byte) -67);
        }
        float var3 = (float)this.start.y - (float)this.controlPathStartOffset * this.offsetDirectionY;
        return new Point2i((int)var2, (int)var3);
    }

    final Point2i pointAt(boolean param0, float param1) {
        float var3 = (float)this.start.x + (float)(-this.start.x + this.end.x) * param1;
        float var4 = (float)this.start.y + (float)(this.end.y - this.start.y) * param1;
        if (param0) {
          this.rightCollisionEdgeAt(-19, -1.8915660381317139f);
        }
        return new Point2i((int)var3, (int)var4);
    }

    final Point2i getRightRoadEnd(byte param0) {
        if (3.141592653589793 == (double)this.blendEndAngle) {
          return new Point2i((int)((float)this.end.x + (float)this.rightRoadEndOffset * this.offsetDirectionX), (int)((float)this.end.y + this.offsetDirectionY * (float)this.rightRoadEndOffset));
        }
        if (param0 != 29) {
          this.getRightRoadStart(-11);
        }
        return this.rightRoadEdgeAt(1.0f, false);
    }

    final Point2i leftRoadEdgeAt(float param0, int param1) {
        float var3 = (float)this.leftRoadOffsetAt((byte) -125, param0);
        if (param1 != 255) {
          this.segmentLength = 0.6247459650039673f;
        }
        float var4 = (float)(-this.start.x + this.end.x) * param0 + (float)this.start.x + this.offsetDirectionX * var3;
        float var5 = this.offsetDirectionY * var3 + (param0 * (float)(this.end.y - this.start.y) + (float)this.start.y);
        return new Point2i((int)var4, (int)var5);
    }

    final void setOffsetDirection(int param0, float param1) {
        if (param0 <= 12) {
          return;
        }
        this.offsetDirectionX = (float)Math.cos((double)param1);
        this.offsetDirectionY = -(float)Math.sin((double)param1);
    }

    private final int leftRoadOffsetAt(byte param0, float param1) {
        if (param0 > -120) {
          byte[] var4 = (byte[]) null;
          StraightRoadSegment.buildDecodedPaletteFont((byte) -17, (byte[]) null);
        }
        return (int)((float)this.leftRoadStartOffset + this.widthBlendAt(param1, 6) * (float)(-this.leftRoadStartOffset + this.leftRoadEndOffset));
    }

    private final float widthBlendAt(float param0, int param1) {
        int var3 = -12 / ((86 - param1) / 38);
        return (1.0f - (float)Math.cos((double)((-this.blendStartAngle + this.blendEndAngle) * param0 + this.blendStartAngle))) / 2.0f;
    }

    final int rightCollisionOffsetAt(int param0, float param1) {
        if (param0 < 33) {
          StraightRoadSegment.resendArchiveKeyRequests(55, (byte) -61);
        }
        return (int)((float)this.rightCollisionStartOffset + this.widthBlendAt(param1, 124) * (float)(this.rightCollisionEndOffset - this.rightCollisionStartOffset));
    }

    final static PaletteBitmapFont buildDecodedPaletteFont(byte param0, byte[] param1) {
        PaletteBitmapFont var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        PaletteBitmapFont stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            return null;
          }
          var2 = new PaletteBitmapFont(param1, DirectByteStorage.field_j, Vector2i.field_g, EditableTextField.field_K, ad.field_d, field_E, IterableSecondaryNodeDeque.field_e);
          var3 = 26 / ((param0 - 56) / 51);
          VehicleEngineSounds.clearDecodedSpriteSheet(false);
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("dd.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final Point2i leftCollisionEdgeAt(float param0, int param1) {
        float var3 = (float)this.leftCollisionOffsetAt(param0, 0);
        float var4 = var3 * this.offsetDirectionX + ((float)this.start.x + (float)(-this.start.x + this.end.x) * param0);
        if (param1 < 90) {
          this.controlPathStartOffset = 69;
        }
        float var5 = this.offsetDirectionY * var3 + (param0 * (float)(-this.start.y + this.end.y) + (float)this.start.y);
        return new Point2i((int)var4, (int)var5);
    }

    final Point2i getRightCollisionEnd(int param0) {
        if ((double)this.blendEndAngle == 3.141592653589793) {
          return new Point2i((int)((float)this.rightCollisionEndOffset * this.offsetDirectionX + (float)this.end.x), (int)((float)this.end.y + this.offsetDirectionY * (float)this.rightCollisionEndOffset));
        }
        if (param0 != -14) {
          StraightRoadSegment.setUiFontMetrics(-103, -92, 89, -67, (byte) -96);
        }
        return this.rightCollisionEdgeAt(-851, 1.0f);
    }

    final Point2i getLeftRoadEnd(int param0) {
        if (3.141592653589793 == (double)this.blendEndAngle) {
          return new Point2i((int)((float)this.end.x + this.offsetDirectionX * (float)this.leftRoadEndOffset), (int)(this.offsetDirectionY * (float)this.leftRoadEndOffset + (float)this.end.y));
        }
        if (param0 != 7560980) {
          this.rightCollisionEndOffset = 66;
        }
        return this.leftRoadEdgeAt(1.0f, 255);
    }

    final static void writeLoginPacket(int param0, int param1, boolean param2, LoginCredentials param3, boolean param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          Bzip2State.field_x[0] = BoundaryIntersection.field_n.nextInt();
          Bzip2State.field_x[1] = BoundaryIntersection.field_n.nextInt();
          SecondaryNodeDequeIterator.field_a.position = 0;
          Bzip2State.field_x[2] = (int)(DialogLayer.field_H >> 32);
          Bzip2State.field_x[3] = (int)DialogLayer.field_H;
          SecondaryNodeDequeIterator.field_a.writeInt((byte) -58, Bzip2State.field_x[0]);
          SecondaryNodeDequeIterator.field_a.writeInt((byte) -58, Bzip2State.field_x[1]);
          SecondaryNodeDequeIterator.field_a.writeInt((byte) -58, Bzip2State.field_x[2]);
          SecondaryNodeDequeIterator.field_a.writeInt((byte) -58, Bzip2State.field_x[3]);
          q.writeRandomSeedData(125, SecondaryNodeDequeIterator.field_a);
          SecondaryNodeDequeIterator.field_a.writeShort(-652561784, param1);
          param3.writeToPacket(0, SecondaryNodeDequeIterator.field_a);
          IsaacPacketBuffer.field_p.position = 0;
          if (param4) {
            IsaacPacketBuffer.field_p.writeByte(param0 ^ 111, 18);
          } else {
            IsaacPacketBuffer.field_p.writeByte(111, 16);
          }
          IsaacPacketBuffer.field_p.position = IsaacPacketBuffer.field_p.position + 2;
          var5_int = IsaacPacketBuffer.field_p.position;
          IsaacPacketBuffer.field_p.writeInt((byte) -58, oi.field_b);
          IsaacPacketBuffer.field_p.writeLong((byte) -84, AchievementUnlockRequest.field_i);
          var6 = param0;
          if (hc.field_b) {
            var6 = var6 | 1;
          }
          if (DelegatingCanvas.field_f) {
            var6 = var6 | 4;
          }
          if (param2) {
            var6 = var6 | 8;
          }
          if (null != TutorialTransition.field_f) {
            var6 = var6 | 16;
          }
          IsaacPacketBuffer.field_p.writeByte(111, var6);
          var7 = ph.a((byte) -48, GameKeyHandler.getApplet(113));
          if (var7 == null) {
            var7 = "";
          }
          IsaacPacketBuffer.field_p.writeCp1252String(-74, var7);
          if (TutorialTransition.field_f != null) {
            IsaacPacketBuffer.field_p.writePrefixedCp1252String(29336, TutorialTransition.field_f);
          }
          dg.writeEncryptedPacket(false, ArchiveProvider.field_a, SecondaryNodeDequeIterator.field_a, IsaacPacketBuffer.field_p, EmailAddressValidator.field_k);
          IsaacPacketBuffer.field_p.backpatchShortLength(-29190, IsaacPacketBuffer.field_p.position - var5_int);
          PlayerStatsRequest.flushServerPackets(-1, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("dd.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param4).append(')').toString());
        }
    }

    final Point2i getEndPoint(int param0) {
        if (param0 != 0) {
          return (Point2i) null;
        }
        return this.end;
    }

    final static void drawWhiteRecoloredSprite(int param0, int param1, Sprite param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var9 = 0;
        var9 = HoldTheLine.field_D;
        try {
          var5_int = param3 + (param1 * SoftwareRasterizer.width - 1);
          var6 = 0;
          if (param0 != 7090) {
            return;
          }
          for (var7 = param2.height; var7 > 0; var7--) {
            for (var8 = param2.width; var8 > 0; var8--) {
              if (param2.pixels[var6] != 0) {
                if (param2.pixels[var6] == 16777215) {
                  var5_int++;
                  SoftwareRasterizer.pixels[var5_int] = param4;
                } else {
                  var5_int++;
                  SoftwareRasterizer.pixels[var5_int] = param2.pixels[var6];
                }
              } else {
                var5_int++;
              }
              var6++;
            }
            var5_int = var5_int + (SoftwareRasterizer.width - param2.width);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("dd.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void setUiFontMetrics(int param0, int param1, int param2, int param3, byte param4) {
        CurvedRoadSegment.field_M = param3;
        if (param4 > -55) {
          byte[] var6 = (byte[]) null;
          StraightRoadSegment.buildDecodedPaletteFont((byte) -63, (byte[]) null);
        }
        ViewportSizingController.field_i = param0;
        ClientTextResources.field_b = param1;
        TickClock.field_b = param2;
    }

    final Point2i getLeftRoadStart(boolean param0) {
        if (!param0) {
          this.getStartDirection(34);
        }
        if (0.0f == this.blendStartAngle) {
          return new Point2i((int)(this.offsetDirectionX * (float)this.leftRoadStartOffset + (float)this.start.x), (int)((float)this.start.y + (float)this.leftRoadStartOffset * this.offsetDirectionY));
        }
        return this.leftRoadEdgeAt(0.0f, 255);
    }

    final static void resendArchiveKeyRequests(int param0, byte param1) {
        int var3 = 0;
        ArchiveKeyRequest var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = HoldTheLine.field_D;
        try {
          var4 = (ArchiveKeyRequest) (TutorialPage.field_a.first((byte) 91));
          if (param1 < 8) {
            field_H = (String) null;
          }
          while (var4 != null) {
            WidgetContainer.sendArchiveKeyRequest(3, param0, var4);
            var4 = (ArchiveKeyRequest) (TutorialPage.field_a.next((byte) -120));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var2), "dd.CA(" + param0 + ',' + param1 + ')');
        }
    }

    final Point2i getRightCollisionStart(int param0) {
        if (this.blendStartAngle == 0.0f) {
          return new Point2i((int)((float)this.rightCollisionStartOffset * this.offsetDirectionX + (float)this.start.x), (int)((float)this.rightCollisionStartOffset * this.offsetDirectionY + (float)this.start.y));
        }
        if (param0 != 3337) {
          this.leftCollisionStartOffset = -37;
        }
        return this.rightCollisionEdgeAt(-851, 0.0f);
    }

    final Point2i getLeftCollisionStart(int param0) {
        if (param0 != 255) {
          return (Point2i) null;
        }
        if (0.0f == this.blendStartAngle) {
          return new Point2i((int)((float)this.start.x + this.offsetDirectionX * (float)this.leftCollisionStartOffset), (int)((float)this.start.y + (float)this.leftCollisionStartOffset * this.offsetDirectionY));
        }
        return this.leftCollisionEdgeAt(0.0f, 112);
    }

    final Point2i getControlPathEnd(byte param0) {
        float var2 = (float)this.end.x - (float)this.controlPathEndOffset * this.offsetDirectionX;
        float var3 = (float)this.end.y - this.offsetDirectionY * (float)this.controlPathEndOffset;
        if (param0 >= -65) {
          this.controlPathStartOffset = -102;
        }
        return new Point2i((int)var2, (int)var3);
    }

    final Point2i rightRoadEdgeAt(float param0, boolean param1) {
        float var3 = (float)this.rightRoadOffsetAt(param0, true);
        float var4 = (float)this.start.x + param0 * (float)(this.end.x - this.start.x) + this.offsetDirectionX * var3;
        if (param1) {
          field_H = (String) null;
        }
        float var5 = (float)this.start.y + (float)(-this.start.y + this.end.y) * param0 + this.offsetDirectionY * var3;
        return new Point2i((int)var4, (int)var5);
    }

    final Vector2f getEndDirection(boolean param0) {
        if (param0) {
          this.rightCollisionOffsetAt(93, -0.584915816783905f);
        }
        return this.getStartDirection(-1);
    }

    private final int rightRoadOffsetAt(float param0, boolean param1) {
        if (!param1) {
          this.blendStartAngle = -0.8879954218864441f;
        }
        return (int)((float)this.rightRoadStartOffset + this.widthBlendAt(param0, 124) * (float)(-this.rightRoadStartOffset + this.rightRoadEndOffset));
    }

    public static void clearSharedReferences(byte param0) {
        field_H = null;
        field_E = null;
        if (param0 > -14) {
          StraightRoadSegment.setUiFontMetrics(-28, -9, -41, 91, (byte) 43);
        }
    }

    final Point2i getRightRoadStart(int param0) {
        if (param0 != -14) {
          return (Point2i) null;
        }
        if (0.0f == this.blendStartAngle) {
          return new Point2i((int)((float)this.start.x + this.offsetDirectionX * (float)this.rightRoadStartOffset), (int)(this.offsetDirectionY * (float)this.rightRoadStartOffset + (float)this.start.y));
        }
        return this.rightRoadEdgeAt(0.0f, false);
    }

    final Vector2f directionAt(byte param0, float param1) {
        if (param0 <= 117) {
          return (Vector2f) null;
        }
        return this.getStartDirection(-1);
    }

    final int leftCollisionOffsetAt(float param0, int param1) {
        if (param1 != 0) {
          return -16;
        }
        return (int)((float)this.leftCollisionStartOffset + this.widthBlendAt(param0, param1 + 35) * (float)(this.leftCollisionEndOffset - this.leftCollisionStartOffset));
    }

    final static Point2i closestBoundaryPoint(int param0, Vector2f param1, GrowableObjectList param2, int param3, Point2i param4) {
        int var7 = 0;
        int var9 = 0;
        Point2i stackIn_19_0 = null;
        Object stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        float var5_float = 0.0f;
        RuntimeException var5 = null;
        Object var6 = null;
        GrowableObjectList var8 = null;
        TrackBoundary var10 = null;
        int var11 = 0;
        float var12 = 0.0f;
        float var13 = 0.0f;
        int var15 = 0;
        Vector2f var16 = null;
        Vector2f var17 = null;
        float var13Lifetime1;
        var15 = HoldTheLine.field_D;
        try {
          var5_float = 0.0f;
          var6 = null;
          for (var7 = param0; param2.size > var7; var7++) {
            var8 = (GrowableObjectList) (param2.elements[var7]);
            for (var9 = 0; var9 < var8.size; var9++) {
              boolean decompiledFrameRemainder0 = true;
              var10 = (TrackBoundary) (var8.elements[var9]);
              if (-var10.layer + param3 >= -1 &&
                param3 - var10.layer <= 1) {
                var11 = (-var10.start.y + param4.y) * (-var10.start.y + var10.end.y) + (param4.x - var10.start.x) * (var10.end.x - var10.start.x);
                if (0 <= var11 &&
                  var10.lengthSquared(-120) >= var11) {
                  var17 = var10.getStartDirection(-1).perpendicular((byte) 64);
                  var12 = Math.abs(var17.dot(new Vector2f(var10.start, param4), (byte) -10));
                  var13 = var12 * var12;
                  if ((var6 == null ||
                    (var5_float > var13))) {
                    var5_float = var13;
                    var6 = var10.pointAt(false, (float)var11 / (float)var10.lengthSquared(-125));
                    if ((param1 != null)) {
                      param1.y = var17.y;
                      param1.x = var17.x;
                    }
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if (var11 >= 0) {
                    var13Lifetime1 = (float)((param4.x - var10.end.x) * (param4.x - var10.end.x) + (param4.y - var10.end.y) * (-var10.end.y + param4.y));
                  } else {
                    var13Lifetime1 = (float)((param4.x - var10.start.x) * (-var10.start.x + param4.x) + (-var10.start.y + param4.y) * (-var10.start.y + param4.y));
                  }
                  if (var6 == null ||
                    var13Lifetime1 < var5_float) {
                    var5_float = var13Lifetime1;
                    if (var11 < 0) {
                      stackIn_19_0 = var10.start;
                    } else {
                      stackIn_19_0 = var10.end;
                    }
                    var6 = stackIn_19_0;
                    var16 = var10.getStartDirection(-1).perpendicular((byte) -111);
                    if (param1 != null) {
                      param1.x = var16.x;
                      param1.y = var16.y;
                    }
                  }
                }
              }
            }
          }
          stackIn_30_0 = var6;
          return (Point2i) (stackIn_30_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_33_0 = var5;
          stackIn_33_1 = new StringBuilder().append("dd.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param2 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    final Point2i controlPathAt(float param0, int param1) {
        if (param1 != 7560980) {
          this.rightCollisionEndOffset = -56;
        }
        float var3 = (float)(this.controlPathEndOffset - this.controlPathStartOffset) * param0 + (float)this.controlPathStartOffset;
        float var4 = (float)(-this.start.x + this.end.x) * param0 + (float)this.start.x - var3 * this.offsetDirectionX;
        float var5 = (float)this.start.y + param0 * (float)(this.end.y - this.start.y) - this.offsetDirectionY * var3;
        return new Point2i((int)var4, (int)var5);
    }

    final float length(int param0) {
        if (param0 != 50) {
          return 1.8018358945846558f;
        }
        return this.segmentLength;
    }

    final Vector2f getStartDirection(int param0) {
        if (param0 != -1) {
          this.controlPathEndOffset = 97;
        }
        return new Vector2f(this.offsetDirectionY, -this.offsetDirectionX);
    }

    StraightRoadSegment(Point2i param0, Point2i param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, boolean param13, boolean param14, boolean param15, boolean param16, boolean param17, boolean param18, float param19, float param20, float param21) {
        boolean stackIn_4_1 = false;
        boolean stackIn_7_1 = false;
        boolean stackIn_10_1 = false;
        boolean stackIn_13_1 = false;
        boolean stackIn_16_1 = false;
        boolean stackIn_19_1 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var23 = null;
        try {
          this.layerSlope = 0.0f;
          this.start = param0;
          this.leftCollisionEndOffset = param9;
          this.rightCollisionStartOffset = param8;
          this.leftRoadEndOffset = param5;
          this.controlPathStartOffset = param11;
          this.rightCollisionEndOffset = param10;
          this.rightRoadEndOffset = param6;
          stackIn_4_1 = (param18);
          this.field_q = stackIn_4_1;
          stackIn_7_1 = (param16);
          this.field_x = stackIn_7_1;
          this.blendEndAngle = param21;
          stackIn_10_1 = (param14);
          this.field_s = stackIn_10_1;
          stackIn_13_1 = (param17);
          this.field_t = stackIn_13_1;
          this.blendStartAngle = param20;
          this.leftCollisionStartOffset = param7;
          this.end = param1;
          stackIn_16_1 = (param13);
          this.field_w = stackIn_16_1;
          this.rightRoadStartOffset = param4;
          this.leftRoadStartOffset = param3;
          this.controlPathEndOffset = param12;
          this.layer = param2;
          stackIn_19_1 = (param15);
          this.field_m = stackIn_19_1;
          this.segmentLength = (float)Math.sqrt((double)((this.end.y - this.start.y) * (-this.start.y + this.end.y) + (-this.start.x + this.end.x) * (this.end.x - this.start.x)));
          this.setOffsetDirection(51, param19);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var23 = decompiledCaughtException;
          stackIn_23_0 = var23;
          stackIn_23_1 = new StringBuilder().append("dd.<init>(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(',').append(param21).append(')').toString());
        }
    }

    static {
        field_H = "Highscores";
    }
}
