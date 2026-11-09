/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveLoadingStage {
    String progressText;
    float progress;
    static String[] nameSuggestions;
    private int weight;
    static ToolkitSprite field_j;
    private int currentRequirement;
    static SpriteData field_c;
    private int requirementCount;
    private ArchiveLoadRequirement[] requirements;
    static String highText;
    static int textColor;
    static SpriteData[] field_b;

    final static void b(byte param0) {
        if (null != RenderPresentationException.field_a) {
          RenderPresentationException.field_a.finishDialogAnimations(false);
          if (null != HardwareGraphicsHeap.field_n) {
            HardwareGraphicsHeap.field_n.k(-43);
          }
          HardwareGraphicsToolkit.j((byte) 89);
          if (param0 != -116) {
            nameSuggestions = (String[]) null;
            return;
          }
          return;
        }
        if (null != HardwareGraphicsHeap.field_n) {
          HardwareGraphicsHeap.field_n.k(-43);
        }
        HardwareGraphicsToolkit.j((byte) 89);
        if (param0 != -116) {
          nameSuggestions = (String[]) null;
          return;
        }
    }

    final static void blendGouraudSpan(int greenStep, int redStep, int[] pixels, int count, int blueStep, int green, int red, int offset, boolean guard, int blue) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!guard) {
            ArchiveLoadingStage.releaseStatics((byte) 51);
          }
          while (true) {
            count--;
            if (count < 0) {
              return;
            }
            var17 = pixels;
            var10 = var17;
            var11 = offset;
            var12 = red;
            var13 = green;
            var14 = blue;
            var15 = (var17[var11] & 16711422) >> 1;
            var10[var11] = LegacyOpenGlPostProcessManager.bitwiseAnd(var12 >> 1, 16711680) + LegacyOpenGlPostProcessManager.bitwiseAnd(65280, var13 >> 9) - (-LegacyOpenGlPostProcessManager.bitwiseAnd(255, var14 >> 17) - var15);
            blue = blue + blueStep;
            green = green + greenStep;
            offset++;
            red = red + redStep;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_8_0 = var10_ref;
          stackIn_8_1 = new StringBuilder().append("mn.E(").append(greenStep).append(',').append(redStep).append(',');
          if (pixels == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(count).append(',').append(blueStep).append(',').append(green).append(',').append(red).append(',').append(offset).append(',').append(guard).append(',').append(blue).append(')').toString());
        }
    }

    final static void sendServerDataWrite(ServerDataWriteRequest request, int guard, int opcode) {
        IsaacPacketBuffer var5 = InwardSparkParticle.outgoingPacket;
        IsaacPacketBuffer var3 = var5;
        var5.writeCipherByte(opcode, 8);
        var5.position = var5.position + 1;
        int var4 = var5.position;
        if (guard > -5) {
          return;
        }
        try {
          var5.writeByte((byte) 53, 1);
          if (null != request.payload) {
            var5.writeByte((byte) 72, request.payload.length);
            var5.writeBytes(request.payload, (byte) -123, request.payload.length, 0);
          } else {
            var5.writeByte((byte) 52, 0);
          }
          var5.appendCrc32(var4, false);
          var5.position = var5.position - 4;
          request.requestCrc = var5.readInt(true);
          var5.patchByteLength(-var4 + var5.position, -13745);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "mn.D(" + (request != null ? "{...}" : "null") + ',' + guard + ',' + opcode + ')');
        }
    }

    final boolean pollReady(int guard) {
        int var3;
        ArchiveLoadRequirement var4;
        var3 = Sumoblitz.field_L ? 1 : 0;
        while (this.currentRequirement < this.requirementCount) {
          var4 = this.requirements[this.currentRequirement];
          if (!var4.archive.loadIndex((byte) 127)) {
            this.updateProgress(0, -111, var4);
            return false;
          }
          if (var4.groupId >= 0 &&
            !var4.archive.tryLoadGroup((byte) -110, var4.groupId)) {
            this.updateProgress(var4.archive.groupLoadPercent(var4.groupId, (byte) 67), -75, var4);
            return false;
          }
          if (null != var4.groupName &&
            !var4.archive.tryLoadNamedGroup(var4.groupName, 100)) {
            this.updateProgress(var4.archive.namedGroupLoadPercent(var4.groupName, (byte) 33), -18, var4);
            return false;
          }
          if (0 > var4.groupId &&
            var4.groupName == null &&
            null != var4.loadingText &&
            !var4.archive.tryLoadAllGroups(true)) {
            this.updateProgress(var4.archive.loadPercent(0), -113, var4);
            return false;
          }
          this.currentRequirement = this.currentRequirement + 1;
        }
        if (guard == 100) {
          return true;
        }
        this.weight = 103;
        return true;
    }

    private final void updateProgress(int percent, int guard, ArchiveLoadRequirement requirement) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (guard >= -10) {
            ArchiveLoadingStage.b((byte) -42);
          }
          var4_float = (float)(1 + this.currentRequirement) + (float)percent / 100.0f;
          this.progress = var4_float * (float)this.weight / (float)(1 + this.requirementCount);
          if (0 != percent) {
            this.progressText = requirement.loadingText + " - " + percent + "%";
            return;
          }
          this.progressText = requirement.waitingText;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("mn.F(").append(percent).append(',').append(guard).append(',');
          if (requirement == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        nameSuggestions = null;
        field_b = null;
        field_j = null;
        field_c = null;
        highText = null;
        if (param0 == 17) {
          return;
        }
        field_b = (SpriteData[]) null;
    }

    private ArchiveLoadingStage() throws Throwable {
        throw new Error();
    }

    static {
        highText = "High";
        textColor = 0;
    }
}
