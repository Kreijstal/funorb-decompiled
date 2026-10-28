/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SelfDestructEffects {
    static boolean moderatorCheats;
    static boolean field_s;
    static String field_d;
    static Js5Transport field_j;
    static int field_q;
    static boolean field_n;
    static Sprite field_b;
    private IntrusiveDeque particles;
    private int flashTicks;
    private int blastDiameter;
    private TrackerMusicDefinition musicOverride;
    private int warningMusicThresholdTicks;
    private int musicVolumeOverride;
    private Sprite blastMask;
    private int particleIntervalTicks;
    private GameplaySession session;
    private Random random;
    private int flashDurationTicks;
    private int particleStartThresholdTicks;

    private final void drawParticles(boolean guard, int cameraY, int cameraX) {
        int var6 = EscapeVector.obfuscationControl;
        if (this.particles.isEmpty(-98)) {
          return;
        }
        IntrusiveNode var4 = this.particles.first(false);
        while (var4 != null) {
          PointCloudEffect var5 = (PointCloudEffect) (var4);
          var5.draw(99, cameraX, cameraY);
          var4 = this.particles.next((byte) 70);
        }
        if (!guard) {
          java.awt.Component var7 = (java.awt.Component) null;
          SelfDestructEffects.detachMouseInput((java.awt.Component) null, (byte) -120);
        }
    }

    final static void flattenFaceDepthBuckets(int guard) {
        int var5 = EscapeVector.obfuscationControl;
        try {
          int var1_int = AccountFormStage.faceDepthBucketCounts[0];
          int var3 = -128 % ((guard + 36) / 48);
          for (int var2 = 1; AccountFormStage.faceDepthBucketCounts.length > var2; var2++) {
            int var4 = AccountFormStage.faceDepthBucketCounts[var2];
            ArraySupport.copy(SavedDataQuerySupport.bucketedFaceIndices, var2 << 4, SavedDataQuerySupport.bucketedFaceIndices, var1_int, var4);
            var1_int = var1_int + var4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var1), "od.B(" + guard + ')');
        }
    }

    private final void buildBlastMask(byte guard) {
        this.blastMask = new Sprite(this.blastDiameter, this.blastDiameter);
        int[] var8 = new int[4];
        int[] var2 = var8;
        SoftwareRasterizer.saveClip(var8);
        this.blastMask.bindAsFramebuffer();
        int var3 = this.blastDiameter / 2;
        int var4 = this.blastDiameter / 2;
        int var5 = this.blastDiameter / 2;
        int var6 = 1;
        SoftwareRasterizer.fillCircle(var3, var4, var5, var6);
        if (AlphaContainer.field_D != null) {
          AlphaContainer.field_D.bindRaster(125);
        }
        int var7 = -25 / ((guard + 25) / 58);
        SoftwareRasterizer.restoreClip(var8);
    }

    final static void drawMenuEdges(int guard) {
        if (guard != 2) {
          java.awt.Component var2 = (java.awt.Component) null;
          SelfDestructEffects.detachMouseInput((java.awt.Component) null, (byte) -63);
        }
        AccountPanelInputSupport.drawCachedEdgeSegments(0, -14, 0);
    }

    private final int wrapWorldX(boolean guard, int x) {
        int var4 = EscapeVector.obfuscationControl;
        int var3 = this.session.worldWidth;
        while (x < 0) {
          x = x + var3;
        }
        while (var3 <= x) {
          x = x - var3;
        }
        if (guard) {
          this.spawnCountdownBlast(-66);
        }
        return x;
    }

    private final void spawnCountdownBlast(int guard) {
        int var2 = 640;
        int var3 = 480;
        if (guard > -99) {
          this.random = (Random) null;
        }
        int var4 = (this.session.shipXQ16 >> 16) - var2 / 2;
        int var5 = (this.session.shipYQ16 >> 16) - var3 / 2;
        int var6 = this.randomOffset(var2, 1) + var4;
        var6 = this.wrapWorldX(false, var6);
        int var7 = this.randomOffset(var3, 1) + var5;
        if (var7 < 0) {
          var7 = 0;
        }
        int var8 = this.session.worldHeight;
        if (var7 >= var8) {
          var7 = -this.blastMask.fullHeight + (-1 + var8);
        }
        PcmSample var9 = SessionCounterState.objectExplosionSamples[0];
        PointCloudEffect var10 = new PointCloudEffect(this.blastMask, var6, var7, var9);
        this.particles.addLast(-12328, var10);
    }

    final static int pollAccountFormExchange(byte guard, boolean receiveNews, String password, LoginText email, LoginText identifier, int affiliateId, int age) {
        String stackIn_13_2 = null;
        String stackIn_16_2 = null;
        String stackIn_68_2 = null;
        String stackIn_71_2 = null;
        String stackIn_74_2 = null;
        int var9 = 0;
        int var13 = EscapeVector.obfuscationControl;
        try {
          String var14 = identifier.text(-106);
          String var8 = email.text(-78);
          if (guard != -32) {
            field_s = false;
          }
          if (null == TextLayout.field_c &&
            !ChatMessageDecoder.pollAccountConnection(false, (byte) 0)) {
            int stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          if (AccountFormStage.field_d == SessionCounterState.field_d) {
            DialWidgetPainter.field_g = null;
            QuickChatDynamicCommand.outgoingPackets.position = 0;
            if (password != null) {
              var9 = 0;
              PathPoint.field_a.position = 0;
              if (receiveNews) {
                var9 = var9 | 1;
              }
              PathPoint.field_a.writeInt((byte) 123, QuitPageSupport.field_a.nextInt());
              PathPoint.field_a.writeInt((byte) 124, QuitPageSupport.field_a.nextInt());
              PathPoint.field_a.writeCircumfixedString((byte) 100, var14);
              PathPoint.field_a.writeCircumfixedString((byte) 100, var8);
              CharSequence var15 = (CharSequence) ((Object) password);
              PathPoint.field_a.writeCircumfixedString((byte) 100, ThemeAssetSupport.normalizeAsciiName(0, var15));
              PathPoint.field_a.writeShort(-116, affiliateId);
              PathPoint.field_a.writeByte(age, -123);
              PathPoint.field_a.writeByte(var9, -123);
              QuickChatDynamicCommand.outgoingPackets.writeByte(18, guard ^ 101);
              QuickChatDynamicCommand.outgoingPackets.position = QuickChatDynamicCommand.outgoingPackets.position + 2;
              int var10 = QuickChatDynamicCommand.outgoingPackets.position;
              String var11_ref_String = PauseMenuScreen.readSettingsCookie(-1, PointCloudEffect.activeApplet((byte) -110));
              if (var11_ref_String == null) {
                var11_ref_String = "";
              }
              QuickChatDynamicCommand.outgoingPackets.writeString(var11_ref_String, 105);
              AccountPayloadSupport.writeEncryptedPayload(guard ^ -32, QuickChatDynamicCommand.outgoingPackets, PathPoint.field_a, MarkerSlider.field_O, MeshProjectionSupport.field_c);
              QuickChatDynamicCommand.outgoingPackets.backpatchShortLength(QuickChatDynamicCommand.outgoingPackets.position - var10, 32614);
            } else {
              PathPoint.field_a.position = 0;
              PathPoint.field_a.writeInt((byte) 124, QuitPageSupport.field_a.nextInt());
              PathPoint.field_a.writeInt((byte) 127, QuitPageSupport.field_a.nextInt());
              PacketBuffer stackIn_12_0 = PathPoint.field_a;
              int stackIn_12_1 = 100;
              if (!identifier.isFlagged(114)) {
                stackIn_13_2 = "";
              } else {
                stackIn_13_2 = var14;
              }
              ((PacketBuffer) (Object) stackIn_12_0).writeCircumfixedString((byte) stackIn_12_1, stackIn_13_2);
              PacketBuffer stackIn_15_0 = PathPoint.field_a;
              int stackIn_15_1 = 100;
              if (email.isFlagged(88)) {
                stackIn_16_2 = var8;
              } else {
                stackIn_16_2 = "";
              }
              ((PacketBuffer) (Object) stackIn_15_0).writeCircumfixedString((byte) stackIn_15_1, stackIn_16_2);
              QuickChatDynamicCommand.outgoingPackets.writeByte(16, -123);
              QuickChatDynamicCommand.outgoingPackets.position = QuickChatDynamicCommand.outgoingPackets.position + 1;
              var9 = QuickChatDynamicCommand.outgoingPackets.position;
              AccountPayloadSupport.writeEncryptedPayload(0, QuickChatDynamicCommand.outgoingPackets, PathPoint.field_a, MarkerSlider.field_O, MeshProjectionSupport.field_c);
              QuickChatDynamicCommand.outgoingPackets.backpatchByteLength(-38, -var9 + QuickChatDynamicCommand.outgoingPackets.position);
            }
            ClientException.flushAccountPackets(-1, 30785);
            AccountFormStage.field_d = IntrusiveDeque.field_a;
          }
          if (IntrusiveDeque.field_a == AccountFormStage.field_d &&
            Checkbox.readIncomingBytes(30000, 1)) {
            int var9Lifetime1 = QuickChatDynamicCommand.incomingPackets.readUnsignedByte(0);
            QuickChatDynamicCommand.incomingPackets.position = 0;
            if (100 <= var9Lifetime1 &&
              var9Lifetime1 <= 105) {
              AccountTermsPanel.field_I = new String[-100 + var9Lifetime1];
              AccountFormStage.field_d = ResourceArchive.field_k;
            } else {
              if (var9Lifetime1 == 248) {
                FrameCadenceSupport.writeBrowserSessionMarker((byte) 81, PointCloudEffect.activeApplet((byte) -108));
                MouseWheelInput.field_a = LoadingProgressDialog.field_fb;
                ConnectionSupport.closeTransport(guard ^ -16);
                RegistrationFlowSupport.field_c = false;
                int stackIn_34_0 = var9Lifetime1;
                return stackIn_34_0;
              }
              if (var9Lifetime1 == 99) {
                Checkbox.readIncomingBytes(30000, ArchivePreloader.booleanReplyLength(92));
                DialWidgetPainter.field_g = new Boolean(SecondaryIntrusiveDeque.readBoolean(QuickChatDynamicCommand.incomingPackets, true));
                QuickChatDynamicCommand.incomingPackets.position = 0;
              } else {
                EmailSyntaxValidator.field_r = -1;
                LegacyStyleNode.field_v = var9Lifetime1;
                AccountFormStage.field_d = LoginIdentifierSupport.field_h;
              }
            }
          }
          if (AccountFormStage.field_d == ResourceArchive.field_k) {
            int var9Lifetime2 = 2;
            if (Checkbox.readIncomingBytes(guard + 30032, var9Lifetime2)) {
              int var10Lifetime1 = QuickChatDynamicCommand.incomingPackets.readUnsignedShort(guard + 1984);
              QuickChatDynamicCommand.incomingPackets.position = 0;
              if (Checkbox.readIncomingBytes(guard + 30032, var10Lifetime1)) {
                int var11 = AccountTermsPanel.field_I.length;
                for (int var12 = 0; var12 < var11; var12++) {
                  AccountTermsPanel.field_I[var12] = QuickChatDynamicCommand.incomingPackets.readCircumfixedString((byte) 125);
                }
                ConnectionSupport.closeTransport(16);
                RegistrationFlowSupport.field_c = false;
                int stackIn_44_0 = var11 + 100;
                return stackIn_44_0;
              }
            }
          }
          if (AccountFormStage.field_d == LoginIdentifierSupport.field_h &&
            ArchiveKeyRequest.hasCompletePacket(guard ^ -10538)) {
            if (LegacyStyleNode.field_v != 255) {
              MouseWheelInput.field_a = QuickChatDynamicCommand.incomingPackets.readString(false);
            } else {
              String var9_ref_String = QuickChatDynamicCommand.incomingPackets.readNullableString(guard - 15176);
              if (var9_ref_String != null) {
                GameKeyHandler.setSettingsCookie(var9_ref_String, (byte) 30, PointCloudEffect.activeApplet((byte) -83));
              }
            }
            ConnectionSupport.closeTransport(16);
            RegistrationFlowSupport.field_c = false;
            int stackIn_53_0 = LegacyStyleNode.field_v;
            return stackIn_53_0;
          }
          if (TextLayout.field_c == null) {
            if (RegistrationFlowSupport.field_c) {
              if (30000L < PasswordFieldPainter.millisecondsSinceLastReceive(64655)) {
                MouseWheelInput.field_a = DualLinkNode.field_l;
              } else {
                MouseWheelInput.field_a = IntegerParseSupport.field_a;
              }
              RegistrationFlowSupport.field_c = false;
              int stackIn_61_0 = 249;
              return stackIn_61_0;
            }
            int var9Lifetime3 = BitCountSupport.field_b;
            BitCountSupport.field_b = StringNode.field_i;
            StringNode.field_i = var9Lifetime3;
            RegistrationFlowSupport.field_c = true;
          }
          int stackIn_64_0 = -1;
          return stackIn_64_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_67_0 = var7;
          StringBuilder stackIn_67_1 = new StringBuilder().append("od.N(").append(guard).append(',').append(receiveNews).append(',');
          if (password == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          StringBuilder stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',');
          if (email == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          StringBuilder stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',');
          if (identifier == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(',').append(affiliateId).append(',').append(age).append(')').toString());
        }
    }

    final void updateCountdownEffects(int guard) {
        this.updateBeepGain(true);
        if (!this.session.countdownActive) {
          return;
        }
        int var2 = this.session.countdownTicks;
        if (this.warningMusicThresholdTicks >= var2) {
          this.musicOverride = MenuInputState.panicMusic;
          this.musicVolumeOverride = 64;
        }
        if (this.particleStartThresholdTicks < var2) {
          return;
        }
        var2 = -var2 + this.particleStartThresholdTicks;
        if (guard == ~(var2 % this.particleIntervalTicks)) {
          this.spawnCountdownBlast(-110);
        }
        this.updateParticles(50);
        var2 = this.session.countdownTicks;
        if (this.flashDurationTicks >= var2) {
          this.flashTicks = this.flashTicks + 1;
        }
        if (this.flashDurationTicks < this.flashTicks) {
          this.flashTicks = this.flashDurationTicks;
        }
        if (1 == this.flashTicks) {
          PcmStreamMixer var3 = AlternateUsernameCredentials.field_n;
          PcmSample var4 = RasterBuffer.fiveSecondExplosionSample;
          int var5 = 100;
          int var6 = IterableNodeHashTable.field_c * 6144 / 64;
          int var7 = 8192;
          var3.playSampleWithPan(var4, var5, var6, var7);
        }
    }

    private final void updateParticles(int guard) {
        Object var3 = null;
        int var4 = EscapeVector.obfuscationControl;
        if (this.particles.isEmpty(-120)) {
          return;
        }
        IntrusiveNode var2 = this.particles.first(false);
        if (guard != 50) {
          this.blastDiameter = 75;
        }
        while (var2 != null) {
          PointCloudEffect var3_ref = (PointCloudEffect) (var2);
          var3_ref.updateParticles();
          var2 = this.particles.next((byte) 70);
        }
        var2 = this.particles.first(false);
        while (var2 != null) {
          PointCloudEffect var3_refLifetime1 = (PointCloudEffect) (var2);
          if (var3_refLifetime1.finished) {
            var3_refLifetime1.unlink((byte) -119);
            break;
          }
          var2 = this.particles.next((byte) 70);
        }
    }

    private final int randomOffset(int span, int excludedTail) {
        long var3 = (long)this.random.nextInt();
        if (var3 < 0L) {
          var3 = -var3;
        }
        var3 = (long)(span - excludedTail) * var3 / 2147483647L;
        return (int)var3;
    }

    final void draw(byte guard, int cameraX, int cameraY) {
        this.drawParticles(true, cameraY, cameraX);
        if (guard != -87) {
          this.musicOverride(true);
        }
        if (this.flashTicks <= 0) {
          return;
        }
        int var4 = 256;
        int var5 = this.flashTicks * var4 / this.flashDurationTicks;
        int var6 = 640;
        int var7 = 480;
        int var8 = 16777215;
        SoftwareRasterizer.fillRectangleAlpha(0, 0, var6, var7, var8, var5);
    }

    final TrackerMusicDefinition musicOverride(boolean guard) {
        if (!guard) {
          field_d = (String) null;
        }
        return this.musicOverride;
    }

    private final void updateBeepGain(boolean guard) {
        boolean var2 = (this.session.countdownActive);
        int var3 = this.session.countdownTicks;
        var2 = ((var3 > this.warningMusicThresholdTicks)) & var2;
        if (!guard) {
          int discarded$0 = this.wrapWorldX(false, 28);
        }
        int var4 = IterableNodeHashTable.field_c * 6144 / 64;
        int var5 = 8192;
        if (!var2) {
          var4 = 0;
          var5 = 0;
        }
        PcmSampleStream var6 = this.session.countdownBeepStream;
        if (var6 == null) {
          return;
        }
        var6.setVolumeAndPanQ6(var4, var5);
    }

    final int musicVolumeOverride(boolean guard) {
        if (!guard) {
          this.blastDiameter = -125;
        }
        return this.musicVolumeOverride;
    }

    final static void detachMouseInput(java.awt.Component component, byte guard) {
        try {
          component.removeMouseListener(QuickChatDynamicCommand.mouseHandler);
          component.removeMouseMotionListener(QuickChatDynamicCommand.mouseHandler);
          int var2_int = 100 % ((-57 - guard) / 62);
          component.removeFocusListener(QuickChatDynamicCommand.mouseHandler);
          LoginCredentials.heldMouseButton = 0;
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "od.F(" + (component != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    public static void releaseStatics(int guard) {
        field_d = null;
        field_j = null;
        field_b = null;
        if (guard != -12548) {
          field_d = (String) null;
        }
    }

    SelfDestructEffects(GameplaySession session) {
        this.particles = new IntrusiveDeque();
        this.warningMusicThresholdTicks = 1500;
        this.musicVolumeOverride = -1;
        this.blastDiameter = 32;
        this.particleStartThresholdTicks = 500;
        this.particleIntervalTicks = 50;
        this.musicOverride = null;
        this.flashDurationTicks = 50;
        try {
          this.session = session;
          this.buildBlastMask((byte) 110);
          int var2_int = (int)MonotonicClockSupport.monotonicMillis(128);
          this.random = new Random((long)var2_int);
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "od.<init>(" + (session != null ? "{...}" : "null") + ')');
        }
    }

    static {
        moderatorCheats = false;
        field_n = false;
        field_q = -1;
    }
}
