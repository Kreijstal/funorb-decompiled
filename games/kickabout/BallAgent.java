/*
 * Decompiled by CFR-JS 0.4.0.
 */
class BallAgent extends MatchAgent {
    int field_j;
    int field_i;
    int velocityX;
    boolean field_y;
    int field_o;
    int velocityY;
    int height;
    int highFriction;
    static QuickChatCommandType field_z;
    int modelId;
    int positionX;
    static boolean field_u;
    static IndexedSprite[] field_f;
    boolean field_x;
    boolean field_k;
    static String field_g;
    static String[][] field_w;
    int uncatchable;
    int possessorSlot;
    int verticalVelocity;
    int possessorTeam;
    int positionY;

    public static void releaseStatics(int param0) {
        field_w = (String[][]) null;
        field_f = null;
        field_g = null;
        if (param0 != 0) {
          return;
        }
        field_z = null;
    }

    final int computeChecksum(int param0) {
        int var3 = 18 / ((81 - param0) / 37);
        int var2 = 0;
        var2 = ConsoleLexer.rotateLeftFourBits(-40, var2 ^ this.positionX);
        var2 = ConsoleLexer.rotateLeftFourBits(-40, this.positionY ^ var2);
        var2 = ConsoleLexer.rotateLeftFourBits(-40, this.height ^ var2);
        var2 = ConsoleLexer.rotateLeftFourBits(-40, this.velocityX ^ var2);
        var2 = ConsoleLexer.rotateLeftFourBits(-40, var2 ^ this.velocityY);
        var2 = ConsoleLexer.rotateLeftFourBits(-40, var2 ^ this.verticalVelocity);
        var2 = ConsoleLexer.rotateLeftFourBits(-40, this.possessorTeam ^ var2);
        var2 = ConsoleLexer.rotateLeftFourBits(-40, this.possessorSlot ^ var2);
        var2 = ConsoleLexer.rotateLeftFourBits(-40, var2 ^ this.uncatchable);
        var2 = ConsoleLexer.rotateLeftFourBits(-40, this.highFriction ^ var2);
        var2 = ConsoleLexer.rotateLeftFourBits(-40, this.modelId ^ var2);
        return var2;
    }

    void setPositionAndStop(int param0, int param1, byte param2, int param3) {
        if (param2 == 26) {
          this.positionX = param0;
          this.verticalVelocity = 0;
          this.positionY = param3;
          this.height = param1;
          this.velocityX = 0;
          this.velocityY = 0;
          return;
        }
    }

    public final String toString() {
        StringBuilder var2 = new StringBuilder("AgentBall p=[");
        GameResourceLoader.appendFixed16Decimal(this.positionX, 100, var2);
        StringBuilder discarded$0 = var2.append(",");
        GameResourceLoader.appendFixed16Decimal(this.positionY, 100, var2);
        StringBuilder discarded$1 = var2.append(",");
        GameResourceLoader.appendFixed16Decimal(this.height, 100, var2);
        StringBuilder discarded$2 = var2.append("]\tv=[");
        GameResourceLoader.appendFixed16Decimal(this.velocityX, 100, var2);
        StringBuilder discarded$3 = var2.append(",");
        GameResourceLoader.appendFixed16Decimal(this.velocityY, 100, var2);
        StringBuilder discarded$4 = var2.append(",");
        GameResourceLoader.appendFixed16Decimal(this.verticalVelocity, 100, var2);
        StringBuilder discarded$5 = var2.append("]\tposessor=" + this.possessorTeam + "/" + this.possessorSlot);
        StringBuilder discarded$6 = var2.append("\tuncatchable=" + this.uncatchable);
        StringBuilder discarded$7 = var2.append("\thigh_friction=" + this.highFriction);
        StringBuilder discarded$8 = var2.append("\tmodel_id=" + this.modelId);
        return var2.toString();
    }

    final static void writeCookie(String param0, java.applet.Applet param1, byte param2, long param3, String param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              var8 = param1.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              var9 = param4 + "=" + param0 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (param2 != -5) {
                field_u = false;
              }
              if (param3 < 0L) {
                var7Lifetime4 = var9 + "; Discard;";
              } else {
                var7Lifetime4 = var9 + "; Expires=" + SoundCache.formatCookieExpiry(MonotonicClock.monotonicMillis(-121) + 1000L * param3, -102) + "; Max-Age=" + param3;
              }
              AppletJavaScriptBridge.evaluateScript("document.cookie=\"" + var7Lifetime4 + "\"", param1, (byte) 24);
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("tj.I(");
            if (param0 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
            if (param1 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int pixelHeight(boolean param0) {
        if (!param0) {
          return 99;
        }
        return this.height >> 16;
    }

    final int pixelX(boolean param0) {
        if (!param0) {
          this.positionY = 99;
          return this.positionX >> 16;
        }
        return this.positionX >> 16;
    }

    final int horizontalSpeedSquared(int param0) {
        int var2 = this.velocityX >> 8;
        int var3 = this.velocityY >> 8;
        int var4 = -84 / ((-60 - param0) / 39);
        return var3 * var3 + var2 * var2;
    }

    final int pixelY(int param0) {
        if (param0 != 879306160) {
          return 87;
        }
        return this.positionY >> 16;
    }

    final void readDeltaState(CipherPacketBuffer param0, int param1) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (ContentTransitionDialog.readBooleanBit(param0, (byte) -39)) {
            this.possessorTeam = -1 + param0.readBits(2, param1 ^ 42);
            this.possessorSlot = param0.readBits(3, 59);
          }
          if (param1 != 17) {
            return;
          }
          if (ContentTransitionDialog.readBooleanBit(param0, (byte) -39)) {
            this.positionX = this.positionX + BufferedCacheFile.readSignedFourRangeBits((byte) 125, 17, param0, 0, 22, 30);
            this.positionY = this.positionY + BufferedCacheFile.readSignedFourRangeBits((byte) 125, 17, param0, 0, 22, 30);
            this.height = this.height + BufferedCacheFile.readSignedFourRangeBits((byte) 125, 20, param0, 0, 24, 30);
            this.velocityX = this.velocityX + BufferedCacheFile.readSignedFourRangeBits((byte) 125, 11, param0, 0, 16, 30);
            this.velocityY = this.velocityY + BufferedCacheFile.readSignedFourRangeBits((byte) 125, 11, param0, 0, 16, 30);
            this.verticalVelocity = this.verticalVelocity + BufferedCacheFile.readSignedFourRangeBits((byte) 125, 18, param0, 0, 24, 30);
          }
          if (!ContentTransitionDialog.readBooleanBit(param0, (byte) -39)) {
            return;
          }
          this.uncatchable = ClientInteractionSupport.readTwoRangeUnsigned(22531, 9, param0, 0);
          this.highFriction = ClientInteractionSupport.readTwoRangeUnsigned(22531, 5, param0, 0);
          this.modelId = param0.readBits(4, 59);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("tj.F(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void readFullState(CipherPacketBuffer param0, byte param1) {
        int discarded$0 = 0;
        try {
          this.possessorTeam = param0.readBits(2, 59) - 1;
          this.possessorSlot = param0.readBits(3, 59);
          this.positionX = param0.readBits(32, 59);
          this.positionY = param0.readBits(32, 59);
          this.height = param0.readBits(32, 59);
          this.velocityX = param0.readBits(32, 59);
          this.velocityY = param0.readBits(32, 59);
          this.verticalVelocity = param0.readBits(32, 59);
          this.uncatchable = param0.readBits(10, 59);
          this.highFriction = param0.readBits(5, 59);
          if (param1 >= -94) {
            discarded$0 = this.pixelHeight(false);
          }
          this.modelId = param0.readBits(4, 59);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "tj.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean canBeCaught(int param0) {
        int var2 = 58 / ((param0 + 51) / 54);
        if (this.uncatchable != 0) {
          return false;
        }
        if (this.pixelHeight(true) >= 30) {
          return false;
        }
        if (0 > this.positionY) {
          return false;
        }
        if (this.positionY <= 88080384) {
          return true;
        }
        return false;
    }

    final void copyStateFrom(byte param0, MatchAgent param1) {
        BallAgent var5 = null;
        try {
          var5 = (BallAgent) (param1);
          this.possessorTeam = var5.possessorTeam;
          this.verticalVelocity = var5.verticalVelocity;
          this.possessorSlot = var5.possessorSlot;
          this.modelId = var5.modelId;
          this.field_o = var5.field_o;
          this.height = var5.height;
          if (param0 > -52) {
            CipherPacketBuffer var4 = (CipherPacketBuffer) null;
            this.readDeltaState((CipherPacketBuffer) null, -54);
          }
          this.positionX = var5.positionX;
          this.velocityX = var5.velocityX;
          this.positionY = var5.positionY;
          this.highFriction = var5.highFriction;
          this.uncatchable = var5.uncatchable;
          this.field_i = var5.field_i;
          this.velocityY = var5.velocityY;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "tj.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void stepPhysics(byte param0, int param1, PlayArea[] param2) {
        int stackIn_14_0 = 0;
        long stackIn_17_0 = 0L;
        long stackIn_38_0 = 0L;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        long var8 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int[] var17 = null;
        try {
          this.field_x = false;
          if (this.uncatchable > 0) {
            this.uncatchable = this.uncatchable - 1;
          }
          this.field_y = false;
          this.field_k = false;
          if (this.highFriction > 0) {
            this.highFriction = this.highFriction - 1;
          }
          var4_int = 90 / ((-3 - param0) / 59);
          this.field_j = -1;
          if (this.possessorTeam != -1) {
            return;
          }
          if (this.positionY >= -65536) {
            stackIn_14_0 = (this.positionY > 88145920) ? 1 : 0;
          } else {
            stackIn_14_0 = 1;
          }
          var5 = stackIn_14_0;
          stackIn_17_0 = (var5 != 0) ? 2000L : 58982L;
          var6 = stackIn_17_0;
          var8 = MusicPatch.field_m[param1];
          var17 = PlayAreaMovementSupport.moveWithinAreas(this.velocityX, this.velocityY, param2, -66, this.height, this.positionY, this.positionX, this.verticalVelocity);
          this.height = var17[2];
          this.positionX = var17[0];
          this.positionY = var17[1];
          if (this.velocityX != var17[3]) {
            this.velocityX = CheckboxLabelWidget.multiplyFixed16(var6, var17[3], (byte) 115);
            this.field_y = true;
          }
          if (this.velocityY != var17[4]) {
            this.velocityY = CheckboxLabelWidget.multiplyFixed16(var6, var17[4], (byte) 119);
            this.field_y = true;
          }
          if (var17[5] != this.verticalVelocity) {
            this.verticalVelocity = FixedVelocitySupport.decelerateFixedVelocity(true, CheckboxLabelWidget.multiplyFixed16(var8, var17[5], (byte) 105));
            if (this.verticalVelocity == 0) {
              this.height = 0;
            }
            this.field_k = true;
          }
          if (this.velocityX == 0 &&
            this.velocityY == 0 &&
            this.verticalVelocity == 0 &&
            this.height == 0) {
            return;
          }
          if (this.highFriction > 10) {
            stackIn_38_0 = 60293L;
          } else {
            if (this.height >= 65536) {
              stackIn_38_0 = ByteArrayPoolState.field_d[param1];
            } else {
              stackIn_38_0 = PlayerSurnameSortCriterion.field_q[param1];
            }
          }
          var11 = stackIn_38_0;
          this.velocityX = (int)(var11 * (long)this.velocityX >> 16);
          this.velocityY = (int)((long)this.velocityY * var11 >> 16);
          if (this.height > 0) {
            this.verticalVelocity = this.verticalVelocity - 16384;
          }
          var13 = this.horizontalSpeedSquared(-128);
          if (4096 <= var13) {
            return;
          }
          this.velocityY = 0;
          this.velocityX = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_46_0 = var4;
          stackIn_46_1 = new StringBuilder().append("tj.JA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(')').toString());
        }
    }

    public BallAgent() {
        this.field_j = -1;
        this.field_o = -1;
        this.possessorSlot = 0;
        this.field_i = -1;
        this.possessorTeam = -1;
        this.highFriction = 0;
    }

    static {
        field_z = new QuickChatCommandType(14, 0, 4, 1);
        field_u = false;
        field_g = "Move";
        field_w = new String[][]{new String[]{"<img=0>Use the 'Bid' button on a lot to submit a bid. <col=ffff00>There are no refunds! Once submitted, your bid cannot be retracted.</col>", "<img=0>The bid price is automatically set by the auction house. To outbid somebody, you must offer 10% more than them.", "<img=0>If the option is available, click the 'Buyout' button to instantly purchase a character for a set price.", "<img=0>The Auction House takes a <col=ffff00>10%<nbsp>commission</col> on all auctions sold."}, new String[]{"<img=0>Characters you are bidding on appear in your team grid under a green hammer icon. They cannot be used in-game; the slot is reserved for them, should you win the auction.", "<img=0>Characters you are selling appear in your team grid under a red hammer icon. They cannot be used in-game."}};
    }
}
