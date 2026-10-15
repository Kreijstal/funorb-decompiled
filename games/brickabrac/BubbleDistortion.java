/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BubbleDistortion extends CircleBody {
    static int[] viewFacePointThreeZ;
    private int animationPhase;
    int oscillationStep;
    int oscillationOffset;
    static int field_z;
    static String field_A;
    static int[] chatHistoryCategoryCounts;
    private int fadeStep;
    int oscillationAmplitude;
    int distortionAmount;

    final static void insertNodeBefore(IntrusiveNode node, int obfuscationGuard, IntrusiveNode before) {
        try {
          if (null != node.previous) {
            node.unlink((byte) 111);
          }
          node.previous = before.previous;
          node.next = before;
          node.previous.next = node;
          int var3_int = 73 / ((-34 - obfuscationGuard) / 43);
          node.next.previous = node;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "il.O(" + (node != null ? "{...}" : "null") + ',' + obfuscationGuard + ',' + (before != null ? "{...}" : "null") + ')');
        }
    }

    final void readBodySnapshot(int obfuscationGuard, PacketBuffer packet) {
        try {
          super.readBodySnapshot(123, packet);
          this.radius256 = packet.readUnsignedByte(255) << 8;
          this.animationPhase = packet.readUnsignedByte(255);
          this.oscillationOffset = packet.readUnsignedShort(65280);
          if (obfuscationGuard <= 89) {
            IntrusiveNode var4 = (IntrusiveNode) null;
            BubbleDistortion.insertNodeBefore((IntrusiveNode) null, 19, (IntrusiveNode) null);
          }
          this.oscillationStep = packet.readUnsignedShort(65280);
          this.oscillationAmplitude = packet.readUnsignedShort(65280);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "il.L(" + obfuscationGuard + ',' + (packet != null ? "{...}" : "null") + ')');
        }
    }

    final void advance(int obfuscationGuard) {
        int var3 = BrickABrac.field_J ? 1 : 0;
        this.y256 = this.y256 + this.velocityY256;
        if (obfuscationGuard == -2081170685) {
          this.x256 = this.x256 + this.velocityX256;
          if (-6144 > this.y256) {
            this.y256 = this.y256 + 129024;
          }
          if (this.animationPhase == 0) {
            if (this.stateWord == 32) {
              this.animationPhase = 1;
            }
            this.distortionAmount = this.distortionAmount + 500;
            this.stateWord = this.stateWord + 1;
            return;
          }
          if (this.animationPhase != 1) {
            if (this.animationPhase != 2) {
              this.stateWord = this.stateWord + 1;
              return;
            }
            if (this.fadeStep < this.distortionAmount) {
              this.distortionAmount = this.distortionAmount - this.fadeStep;
              if (this.stateWord == 564) {
                this.unlink((byte) 111);
              }
              this.stateWord = this.stateWord + 1;
              return;
            }
            if (this.fadeStep / 2 < this.distortionAmount) {
              this.distortionAmount = this.distortionAmount * 4 / 5;
              if (this.stateWord == 564) {
                this.unlink((byte) 111);
              }
              this.stateWord = this.stateWord + 1;
              return;
            }
            if (this.stateWord == 564) {
              this.unlink((byte) 111);
            }
            this.stateWord = this.stateWord + 1;
            return;
          }
          this.distortionAmount = (this.oscillationAmplitude * InteractiveGameClient.sine8192(this.oscillationOffset + this.stateWord * this.oscillationStep, obfuscationGuard ^ 2081174780) >> 16) + 16000;
          if (this.stateWord == 532) {
            this.animationPhase = 2;
            this.fadeStep = this.distortionAmount / 32;
            this.stateWord = this.stateWord + 1;
            return;
          }
          this.stateWord = this.stateWord + 1;
          return;
        }
        this.animationPhase = 106;
        this.x256 = this.x256 + this.velocityX256;
        if (-6144 <= this.y256) {
          if (this.animationPhase == 0) {
            if (this.stateWord == 32) {
              this.animationPhase = 1;
            }
            this.distortionAmount = this.distortionAmount + 500;
            this.stateWord = this.stateWord + 1;
            return;
          }
          if (this.animationPhase != 1) {
            if (this.animationPhase != 2) {
              this.stateWord = this.stateWord + 1;
              return;
            }
            if (this.fadeStep >= this.distortionAmount) {
              if (this.fadeStep / 2 >= this.distortionAmount) {
                if (this.stateWord == 564) {
                  this.unlink((byte) 111);
                }
                this.stateWord = this.stateWord + 1;
                return;
              }
              this.distortionAmount = this.distortionAmount * 4 / 5;
              if (this.stateWord != 564) {
                this.stateWord = this.stateWord + 1;
                return;
              }
              this.unlink((byte) 111);
              this.stateWord = this.stateWord + 1;
              return;
            }
            this.distortionAmount = this.distortionAmount - this.fadeStep;
            if (this.stateWord != 564) {
              this.stateWord = this.stateWord + 1;
              return;
            }
            this.unlink((byte) 111);
            this.stateWord = this.stateWord + 1;
            return;
          }
          this.distortionAmount = (this.oscillationAmplitude * InteractiveGameClient.sine8192(this.oscillationOffset + this.stateWord * this.oscillationStep, obfuscationGuard ^ 2081174780) >> 16) + 16000;
          if (this.stateWord == 532) {
            this.animationPhase = 2;
            this.fadeStep = this.distortionAmount / 32;
            this.stateWord = this.stateWord + 1;
            return;
          }
          this.stateWord = this.stateWord + 1;
          return;
        }
        this.y256 = this.y256 + 129024;
        if (this.animationPhase == 0) {
          if (this.stateWord != 32) {
            this.distortionAmount = this.distortionAmount + 500;
            this.stateWord = this.stateWord + 1;
            return;
          }
          this.animationPhase = 1;
          this.distortionAmount = this.distortionAmount + 500;
          this.stateWord = this.stateWord + 1;
          return;
        }
        if (this.animationPhase != 1) {
          if (this.animationPhase != 2) {
            this.stateWord = this.stateWord + 1;
            return;
          }
          if (this.fadeStep >= this.distortionAmount) {
            if (this.fadeStep / 2 >= this.distortionAmount) {
              if (this.stateWord != 564) {
                this.stateWord = this.stateWord + 1;
                return;
              }
              this.unlink((byte) 111);
              this.stateWord = this.stateWord + 1;
              return;
            }
            this.distortionAmount = this.distortionAmount * 4 / 5;
            if (this.stateWord == 564) {
              this.unlink((byte) 111);
              this.stateWord = this.stateWord + 1;
              return;
            }
            this.stateWord = this.stateWord + 1;
            return;
          }
          this.distortionAmount = this.distortionAmount - this.fadeStep;
          if (this.stateWord == 564) {
            this.unlink((byte) 111);
            this.stateWord = this.stateWord + 1;
            return;
          }
          this.stateWord = this.stateWord + 1;
          return;
        }
        this.distortionAmount = (this.oscillationAmplitude * InteractiveGameClient.sine8192(this.oscillationOffset + this.stateWord * this.oscillationStep, obfuscationGuard ^ 2081174780) >> 16) + 16000;
        if (this.stateWord != 532) {
          this.stateWord = this.stateWord + 1;
          return;
        }
        this.animationPhase = 2;
        this.fadeStep = this.distortionAmount / 32;
        this.stateWord = this.stateWord + 1;
    }

    final static void a(MidiSynthesizer param0, PlatformServices param1, int param2, int param3, int param4, int param5, java.awt.Component param6, boolean param7) {
        try {
          PcmPlayer.configureOutput(param2, param7, 10);
          DirectByteStorage.field_f = PcmPlayer.create(param1, param6, 0, param4);
          UnderwaterBackground.field_w = PcmPlayer.create(param1, param6, 1, param3);
          PasswordFieldRenderer.soundMixer = new AudioMixer();
          AchievementBrowserScreen.field_u = param5 * param3 / param2;
          UnderwaterBackground.field_w.setRootStream(PasswordFieldRenderer.soundMixer);
          ConditionalTextValue.musicSynthesizer = param0;
          ConditionalTextValue.musicSynthesizer.setMasterGain(ScorePopup.field_p, false);
          DirectByteStorage.field_f.setRootStream(ConditionalTextValue.musicSynthesizer);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "il.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    public static void c(int param0) {
        if (param0 <= 122) {
          return;
        }
        field_A = null;
        viewFacePointThreeZ = null;
        chatHistoryCategoryCounts = null;
    }

    BubbleDistortion(int x256, int y256, int velocityX256, int velocityY256, int radius256, int typeId) {
        super(x256, y256, velocityX256, velocityY256, radius256, typeId);
    }

    final static void a(byte param0, int param1) {
        if (param0 != 86) {
          BubbleDistortion.e((byte) -105);
          SoundCache.a(param0 ^ 87, param1);
          return;
        }
        SoundCache.a(param0 ^ 87, param1);
    }

    final static void a(int param0, RgbSprite param1, RgbSprite param2, int param3, int param4, RgbSprite param5, int param6, int param7, int param8, int param9, RgbSprite param10, int param11) {
        try {
          param2.drawAt(param9 + ((-param2.canvasWidth + param11) / 2 + (param0 * 5 >> 16)), param8);
          param5.drawTransparent((10 * param0 >> 16) + ((-param5.canvasWidth + param11) / 2 + param9 - 87 / param3), -(80 / param3) + (-param5.canvasHeight + 480 + (param6 + param8)));
          param1.drawTransparent(-(5 / param3) + ((param0 * 20 >> 16) + ((param11 - param1.canvasWidth) / 2 + param9)), -param1.canvasHeight + (480 + param6 + param8));
          QuickChatMenu.a(-121, 16, 0, param10, 16777215, -(5 / param3) + ((param0 * 2 >> 16) + ((param11 - param10.canvasWidth) / param4 + param9)), 480 + (param8 + param6 - param10.canvasHeight));
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "il.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + (param10 != null ? "{...}" : "null") + ',' + param11 + ')');
        }
    }

    final int computeSyncChecksum(int obfuscationGuard, StringBuilder diagnostics) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        java.awt.Component var4 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard <= 79) {
            var4 = (java.awt.Component) null;
            BubbleDistortion.a((MidiSynthesizer) null, (PlatformServices) null, 83, 59, 15, -106, (java.awt.Component) null, true);
          }
          var3_int = super.computeSyncChecksum(120, diagnostics) ^ -72674834;
          if (diagnostics != null) {
            discarded$3 = diagnostics.append(this.x256 + " " + this.y256 + " ");
            discarded$4 = diagnostics.append(this.oscillationOffset + " " + this.stateWord + " ");
            discarded$5 = diagnostics.append("\n");
          }
          var3_int = var3_int ^ 97 * this.animationPhase + 9269 << 3;
          var3_int = var3_int ^ 39185 + 47 * this.distortionAmount << 13;
          var3_int = var3_int ^ this.oscillationOffset * 17 + 31 << 2;
          var3_int = var3_int ^ 30 + 19 * this.oscillationStep << 22;
          var3_int = var3_int ^ 27 * this.oscillationAmplitude + 21554 << 10;
          stackIn_6_0 = var3_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("il.A(").append(obfuscationGuard).append(',');
          if (diagnostics == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static boolean e(byte param0) {
        if (param0 < -77) {
          return MatchResultScreen.logoAnimationTicks > 250 ? true : false;
        }
        RgbSprite var2 = (RgbSprite) null;
        BubbleDistortion.a(-62, (RgbSprite) null, (RgbSprite) null, 105, -38, (RgbSprite) null, 49, -61, 61, -69, (RgbSprite) null, 126);
        return MatchResultScreen.logoAnimationTicks > 250 ? true : false;
    }

    static {
        viewFacePointThreeZ = new int[8192];
        field_z = -1;
        field_A = "Show chat";
    }
}
