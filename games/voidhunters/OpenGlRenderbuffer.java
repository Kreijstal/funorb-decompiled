/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlRenderbuffer extends DualLinkNode implements OpenGlFramebufferAttachment {
    private OpenGlToolkit toolkit;
    private int renderbufferId;
    private int framebufferTarget;
    static int field_o;
    static int field_v;
    static boolean field_n;
    private int framebufferAttachment;
    static String field_r;
    int width;
    static String field_p;
    int byteSize;
    int height;
    private int internalFormat;

    public static void clearSharedReferences(int param0) {
        field_p = null;
        field_r = null;
        if (param0 < 30) {
          OpenGlRenderbuffer.clearSharedReferences(-90);
        }
    }

    final static void drawRectangleBorderUnclipped(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var6_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int[] var7 = null;
        int var8 = 0;
        var8 = VoidHunters.field_G;
        try {
          incrementValue$0 = param2;
          param2++;
          GetSalvoRepairTimeMultiplier.fillArraySpan(param0, param5, ResourceNode.rasterTargetRows[incrementValue$0], (byte) 75, param4);
          if (param1 < 57) {
            field_o = 108;
          }
          incrementValue$1 = param3;
          param3--;
          GetSalvoRepairTimeMultiplier.fillArraySpan(param0, param5, ResourceNode.rasterTargetRows[incrementValue$1], (byte) 75, param4);
          for (var6_int = param2; var6_int <= param3; var6_int++) {
            var7 = ResourceNode.rasterTargetRows[var6_int];
            var7[param5] = param0;
            var7[param4] = param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) var6), "nv.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void sendClientDataWrite(byte param0, ClientDataWriteRequest param1, int param2) {
        IsaacPacketBuffer var4 = null;
        int var5 = 0;
        try {
          int var3_int = -87 % ((4 - param0) / 54);
          var4 = RequestNewestBlackboxRecording.field_p;
          var4.writeIsaacByte(24335, param2);
          var4.position = var4.position + 1;
          var5 = var4.position;
          var4.writeByte(0, 1);
          if (null != param1.data) {
            var4.writeByte(0, param1.data.length);
            var4.writeBytes(0, param1.data, -1, param1.data.length);
          } else {
            var4.writeByte(0, 0);
          }
          var4.writeCrc(1595, var5);
          var4.position = var4.position - 4;
          param1.payloadCrc = var4.readInt(35);
          var4.writeLengthByte(var4.position - var5, -129);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "nv.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    protected final void finalize() throws Throwable {
        this.dispose((byte) 116);
        super.finalize();
    }

    final void dispose(byte param0) {
        if (this.renderbufferId > 0) {
          this.toolkit.enqueueRenderbufferDisposal(this.byteSize, this.renderbufferId, (byte) 77);
          this.renderbufferId = 0;
          if (param0 >= 106) {
            return;
          }
          this.toolkit = (OpenGlToolkit) null;
          return;
        }
        if (param0 < 106) {
          this.toolkit = (OpenGlToolkit) null;
          return;
        }
    }

    public final void detachFromFramebuffer(int param0) {
        if (param0 != 31294) {
          this.internalFormat = -106;
          jaggl.OpenGL.glFramebufferRenderbufferEXT(this.framebufferTarget, this.framebufferAttachment, 36161, 0);
          this.framebufferTarget = -1;
          this.framebufferAttachment = -1;
          return;
        }
        jaggl.OpenGL.glFramebufferRenderbufferEXT(this.framebufferTarget, this.framebufferAttachment, 36161, 0);
        this.framebufferTarget = -1;
        this.framebufferAttachment = -1;
    }

    final void attachToFramebuffer(int param0, int param1, int param2) {
        jaggl.OpenGL.glFramebufferRenderbufferEXT(param2, param1, 36161, this.renderbufferId);
        this.framebufferAttachment = param1;
        if (param0 != 1) {
          this.height = -15;
          this.framebufferTarget = param2;
          return;
        }
        this.framebufferTarget = param2;
    }

    final static String getObjectiveHint(int param0, int param1, boolean param2) {
        int var3;
        String stackIn_22_0 = null;
        String stackIn_26_0 = null;
        String stackIn_30_0 = null;
        String stackIn_34_0 = null;
        if (4 <= param0) {
          if (param2) {
            return ThrusterBehaviour.field_a[param0];
          }
          return (String) null;
        }
        if (param1 < 0) {
          if (param2) {
            return ThrusterBehaviour.field_a[param0];
          }
          return (String) null;
        }
        if (param1 >= SetMissionTerrainAsteroidProbability.field_p) {
          if (param2) {
            return ThrusterBehaviour.field_a[param0];
          }
          return (String) null;
        }
        var3 = param0;
        if (var3 == 0) {
          if (param1 != 0) {
            stackIn_22_0 = GameResourceLoader.defendYourBaseText;
          } else {
            stackIn_22_0 = SetMachineGunAimarc.field_r;
          }
          return stackIn_22_0;
        }
        if (var3 == 1) {
          if (param1 != 0) {
            stackIn_26_0 = ConvoyObjectiveText.stopEnemyConvoyText;
          } else {
            stackIn_26_0 = FadingMidiPcmStream.field_T;
          }
          return stackIn_26_0;
        }
        if (2 == var3) {
          if (param1 != 0) {
            stackIn_30_0 = UiComboBoxArrowRenderer.protectVipText;
          } else {
            stackIn_30_0 = BricksTextureOperation.field_t;
          }
          return stackIn_30_0;
        }
        if (var3 != 3) {
          if (param2) {
            return ThrusterBehaviour.field_a[param0];
          }
          return (String) null;
        }
        if (0 == param1) {
          stackIn_34_0 = GetThrusterParticleSpeedDownshift.field_q;
        } else {
          stackIn_34_0 = CellularNoiseTextureOperation.field_q;
        }
        return stackIn_34_0;
    }

    OpenGlRenderbuffer(OpenGlToolkit param0, int param1, int param2, int param3) {
        this.framebufferAttachment = -1;
        this.framebufferTarget = -1;
        try {
          this.toolkit = param0;
          this.internalFormat = param1;
          this.height = param3;
          this.width = param2;
          jaggl.OpenGL.glGenRenderbuffersEXT(1, SetMachineGunReload.field_p, 0);
          this.renderbufferId = SetMachineGunReload.field_p[0];
          jaggl.OpenGL.glBindRenderbufferEXT(36161, this.renderbufferId);
          jaggl.OpenGL.glRenderbufferStorageEXT(36161, this.internalFormat, this.width, this.height);
          this.byteSize = this.height * this.width * this.toolkit.getTextureFormatByteSize(this.internalFormat, 2);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "nv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    OpenGlRenderbuffer(OpenGlToolkit param0, int param1, int param2, int param3, int param4) {
        this.framebufferAttachment = -1;
        this.framebufferTarget = -1;
        try {
          this.internalFormat = param1;
          this.toolkit = param0;
          this.height = param3;
          this.width = param2;
          jaggl.OpenGL.glGenRenderbuffersEXT(1, SetMachineGunReload.field_p, 0);
          this.renderbufferId = SetMachineGunReload.field_p[0];
          jaggl.OpenGL.glBindRenderbufferEXT(36161, this.renderbufferId);
          jaggl.OpenGL.glRenderbufferStorageMultisampleEXT(36161, param4, this.internalFormat, this.width, this.height);
          this.byteSize = this.width * (this.height * this.toolkit.getTextureFormatByteSize(this.internalFormat, 2));
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "nv.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_v = 360;
        field_n = false;
        field_o = 4;
        field_p = "Use this alternative as your account name";
    }
}
