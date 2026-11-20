/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GpuQuadBuffers {
    static TextureCombineOperation field_c;
    private GpuVertexBuffer vertexBuffer;
    private GpuVertexBuffer normalBuffer;
    private GpuIndexBuffer indexBuffer;

    final void releaseVertexBuffer(boolean param0) {
        this.vertexBuffer.release(-108);
        if (param0) {
          GpuQuadBuffers.clearSharedReferences((byte) -55);
        }
    }

    final static boolean isValidPlayerNameSyntax(byte param0, CharSequence param1, boolean param2) {
        int var6 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = VoidHunters.field_G;
        try {
          if (param1 == null) {
            return false;
          }
          var3_int = param1.length();
          if (var3_int >= 1 &&
            12 >= var3_int) {
            var4 = ConstantColorTextureOperation.normalizeName(false, param1);
            if (var4 != null &&
              var4.length() >= 1) {
              if (MouseWheelInput.isNameSeparator(var4.charAt(0), 104)) {
                return false;
              }
              if (MouseWheelInput.isNameSeparator(var4.charAt(var4.length() - 1), 26)) {
                return false;
              }
              var5 = 0;
              for (var6 = 0; param1.length() > var6; var6++) {
                var7 = param1.charAt(var6);
                if (!MouseWheelInput.isNameSeparator((char) var7, 46)) {
                  var5 = 0;
                } else {
                  var5++;
                }
                if (var5 >= 2 &&
                  !param2) {
                  return false;
                }
              }
              if (0 < var5) {
                return false;
              }
              if (param0 != -31) {
                GpuQuadBuffers.a((byte) 82);
              }
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_41_0 = var3;
          stackIn_41_1 = new StringBuilder().append("je.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_c = null;
        if (param0 != 117) {
          GpuQuadBuffers.clearSharedReferences((byte) -3);
        }
    }

    final static void a(byte param0) {
        lsa var1 = (lsa) (ScreenSizeController.field_p.first(0));
        if (param0 <= 108) {
          GpuQuadBuffers.clearSharedReferences((byte) -96);
        }
        if (var1 == null) {
          FighterBayWeaponDefinition.l(-116);
          return;
        }
        IsaacPacketBuffer var2 = AccountNameAvailabilityReplies.field_b;
        var2.readInt(62);
        var2.readInt(90);
        var2.readInt(60);
        var2.readInt(93);
        var1.unlink(-3846);
    }

    final void allocateVertexBuffer(int param0, GpuToolkit param1) {
        try {
          this.vertexBuffer.allocate(param0, 786336, 97);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "je.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    GpuQuadBuffers(GpuToolkit param0) {
        int var4_int = 0;
        int var5 = 0;
        jaclib.memory.Buffer var7 = null;
        jaclib.memory.Stream var8 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        jaclib.memory.Stream var4 = null;
        jaclib.memory.Buffer var9 = null;
        int var5Lifetime1;
        try {
          param0.createVertexDeclaration(10, new VertexStreamLayout[]{new VertexStreamLayout(new VertexAttribute[]{VertexAttribute.field_k, VertexAttribute.field_d, VertexAttribute.field_l}), new VertexStreamLayout(VertexAttribute.field_g)});
          this.vertexBuffer = param0.createVertexBuffer(true, 3);
          this.normalBuffer = param0.createVertexBuffer(false, 3);
          this.normalBuffer.allocate(12, 393168, 119);
          this.indexBuffer = param0.createIndexBuffer((byte) -19, false);
          this.indexBuffer.allocate(25427, 49146);
          var7 = this.indexBuffer.lock((byte) -30, true);
          if (var7 != null) {
            var8 = param0.getBufferWriter(var7, false);
            if (jaclib.memory.Stream.isBigEndian()) {
              for (var4_int = 0; var4_int < 8191; var4_int++) {
                var5 = var4_int * 4;
                var8.writeShort(var5);
                var8.writeShort(var5 + 1);
                var8.writeShort(var5 + 2);
                var8.writeShort(var5 + 2);
                var8.writeShort(3 + var5);
                var8.writeShort(var5);
              }
            } else {
              for (var4_int = 0; 8191 > var4_int; var4_int++) {
                var5 = 4 * var4_int;
                var8.writeShortLE(var5);
                var8.writeShortLE(var5 + 1);
                var8.writeShortLE(var5 + 2);
                var8.writeShortLE(2 + var5);
                var8.writeShortLE(var5 + 3);
                var8.writeShortLE(var5);
              }
            }
            var8.flush();
            this.indexBuffer.unlock(-93);
          }
          var9 = this.normalBuffer.lock(true, (byte) 41);
          if (var9 != null) {
            var4 = param0.getBufferWriter(var9, false);
            if (jaclib.memory.Stream.isBigEndian()) {
              for (var5Lifetime1 = 0; var5Lifetime1 < 8191; var5Lifetime1++) {
                var4.writeFloat(0.0f);
                var4.writeFloat(-1.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(-1.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(-1.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(0.0f);
                var4.writeFloat(-1.0f);
                var4.writeFloat(0.0f);
              }
            } else {
              for (var5Lifetime1 = 0; var5Lifetime1 < 8191; var5Lifetime1++) {
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(-1.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(-1.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(-1.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(0.0f);
                var4.writeFloatLE(-1.0f);
                var4.writeFloatLE(0.0f);
              }
            }
            var4.flush();
            this.normalBuffer.unlock(-20836);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("je.<init>(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    static {
        field_c = new TextureCombineOperation();
    }
}
