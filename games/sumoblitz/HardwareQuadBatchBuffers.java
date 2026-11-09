/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HardwareQuadBatchBuffers {
    private IndexBuffer indices;
    private VertexBuffer normals;
    static TickClock field_a;
    private VertexBuffer dynamicVertices;

    public static void releaseStatics(int param0) {
        if (param0 != 786336) {
          field_a = (TickClock) null;
        }
        field_a = null;
    }

    final static boolean hasActivePlayer(int guard) {
        boolean stackIn_7_0 = false;
        if (guard >= -19) {
          HardwareQuadBatchBuffers.resendFourStatHiscoreRequests(0, false);
        }
        stackIn_7_0 = (25 > OpenGlShaderProgram.levelIndex) && (SpriteMask.drones[0] != null) && (SpriteMask.drones[0].isActive((byte) 115));
        return stackIn_7_0;
    }

    final static void notifyBrowserResizing(int guard, int mode) {
        try {
          try {
            BrowserScriptBridge.call(-126, LegacyOpenGlUnlitEffect.activeApplet(guard - 23), "resizing", new Object[]{new Integer(mode)});
          } catch (Throwable throwable) {
          }
          if (guard != 25) {
            field_a = (TickClock) null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean isAllowedNameCharacter(byte guard, char character) {
        if (Character.isISOControl(character)) {
          return false;
        }
        if (DroneEscalationSupport.isAsciiAlphanumeric(57, character)) {
          return true;
        }
        if (character != 45 &&
          160 != character &&
          character != 32) {
          if (character == 95) {
            return true;
          }
          if (guard != 110) {
            field_a = (TickClock) null;
          }
          return false;
        }
        return true;
    }

    final static void resendFourStatHiscoreRequests(int opcode, boolean guard) {
        int var3 = 0;
        FourStatHiscoreRequest var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          var4 = (FourStatHiscoreRequest) (EmailValidationError.field_a.first(111));
          if (!guard) {
            field_a = (TickClock) null;
          }
          while (var4 != null) {
            MarkerTrackRenderer.sendFourStatHiscoreRequest(-1, var4, opcode);
            var4 = (FourStatHiscoreRequest) (EmailValidationError.field_a.next((byte) 18));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "jl.B(" + opcode + ',' + guard + ')');
        }
    }

    final static void quitToWebsite(java.applet.Applet applet, boolean guard) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(applet.getCodeBase(), "quit.ws");
              if (guard) {
                return;
              }
              applet.getAppletContext().showDocument(MusicPatch.a((byte) 125, applet, var2), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("jl.A(");
            if (applet == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(guard).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, int param1, boolean param2, byte param3) {
        int var4;
        int var5;
        if (!param2) {
          if (IntroductionOverlaySupport.field_c[param0] > IntroductionOverlaySupport.field_c[param1]) {
            return true;
          }
          if (IntroductionOverlaySupport.field_c[param0] < IntroductionOverlaySupport.field_c[param1]) {
            return false;
          }
          if (LoginFieldValue.field_a[param1] < LoginFieldValue.field_a[param0]) {
            return true;
          }
          if (LoginFieldValue.field_a[param1] > LoginFieldValue.field_a[param0]) {
            return false;
          }
        } else {
          if (LoginFieldValue.field_a[param0] > LoginFieldValue.field_a[param1]) {
            return true;
          }
          if (LoginFieldValue.field_a[param1] > LoginFieldValue.field_a[param0]) {
            return false;
          }
          if (IntroductionOverlaySupport.field_c[param1] < IntroductionOverlaySupport.field_c[param0]) {
            return true;
          }
          if (IntroductionOverlaySupport.field_c[param0] < IntroductionOverlaySupport.field_c[param1]) {
            return false;
          }
        }
        var4 = SlowBurstParticle.field_z[param1] + LegacyOpenGlInterleavedStream.field_c[param1] + ContentTransitionPhase.field_f[param1];
        if (param3 != 98) {
          return true;
        }
        var5 = SlowBurstParticle.field_z[param0] + ContentTransitionPhase.field_f[param0] + LegacyOpenGlInterleavedStream.field_c[param0];
        if (var4 < var5) {
          return true;
        }
        if (var5 < var4) {
          return false;
        }
        return !(param0 <= param1);
    }

    final void closeDynamicVertices(int guard) {
        this.dynamicVertices.close(12001);
        if (guard != -19073) {
          HardwareQuadBatchBuffers.a(121, -85, true, (byte) 9);
        }
    }

    HardwareQuadBatchBuffers(HardwareGraphicsToolkit toolkit) {
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
          toolkit.createVertexLayout(new VertexStreamLayout[]{new VertexStreamLayout(new VertexAttribute[]{VertexAttribute.POSITION, VertexAttribute.COLOR, VertexAttribute.TEXCOORD2}), new VertexStreamLayout(VertexAttribute.NORMAL)}, (byte) 53);
          this.dynamicVertices = toolkit.createVertexBuffer((byte) 51, true);
          this.normals = toolkit.createVertexBuffer((byte) 51, false);
          this.normals.allocate(12, (byte) -35, 393168);
          this.indices = toolkit.createIndexBuffer(3, false);
          this.indices.allocate((byte) -116, 49146);
          var7 = this.indices.map(true, 10081);
          if (var7 != null) {
            var8 = toolkit.streamForBuffer(true, var7);
            if (!jaclib.memory.Stream.isNativeBigEndian()) {
              for (var4_int = 0; var4_int < 8191; var4_int++) {
                var5 = 4 * var4_int;
                var8.writeShortLittleEndian(var5);
                var8.writeShortLittleEndian(var5 + 1);
                var8.writeShortLittleEndian(2 + var5);
                var8.writeShortLittleEndian(var5 + 2);
                var8.writeShortLittleEndian(var5 + 3);
                var8.writeShortLittleEndian(var5);
              }
            } else {
              for (var4_int = 0; var4_int < 8191; var4_int++) {
                var5 = 4 * var4_int;
                var8.writeShortBigEndian(var5);
                var8.writeShortBigEndian(1 + var5);
                var8.writeShortBigEndian(var5 + 2);
                var8.writeShortBigEndian(2 + var5);
                var8.writeShortBigEndian(var5 + 3);
                var8.writeShortBigEndian(var5);
              }
            }
            var8.flush();
            this.indices.unmap(-28833);
          }
          var9 = this.normals.map(7454, true);
          if (var9 != null) {
            var4 = toolkit.streamForBuffer(true, var9);
            if (!jaclib.memory.Stream.isNativeBigEndian()) {
              for (var5Lifetime1 = 0; 8191 > var5Lifetime1; var5Lifetime1++) {
                var4.writeFloatLittleEndian(0.0f);
                var4.writeFloatLittleEndian(-1.0f);
                var4.writeFloatLittleEndian(0.0f);
                var4.writeFloatLittleEndian(0.0f);
                var4.writeFloatLittleEndian(-1.0f);
                var4.writeFloatLittleEndian(0.0f);
                var4.writeFloatLittleEndian(0.0f);
                var4.writeFloatLittleEndian(-1.0f);
                var4.writeFloatLittleEndian(0.0f);
                var4.writeFloatLittleEndian(0.0f);
                var4.writeFloatLittleEndian(-1.0f);
                var4.writeFloatLittleEndian(0.0f);
              }
            } else {
              for (var5Lifetime1 = 0; 8191 > var5Lifetime1; var5Lifetime1++) {
                var4.writeFloatBigEndian(0.0f);
                var4.writeFloatBigEndian(-1.0f);
                var4.writeFloatBigEndian(0.0f);
                var4.writeFloatBigEndian(0.0f);
                var4.writeFloatBigEndian(-1.0f);
                var4.writeFloatBigEndian(0.0f);
                var4.writeFloatBigEndian(0.0f);
                var4.writeFloatBigEndian(-1.0f);
                var4.writeFloatBigEndian(0.0f);
                var4.writeFloatBigEndian(0.0f);
                var4.writeFloatBigEndian(-1.0f);
                var4.writeFloatBigEndian(0.0f);
              }
            }
            var4.flush();
            this.normals.unmap(22957);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("jl.<init>(");
          if (toolkit == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final void allocateDynamicVertices(int guard, HardwareGraphicsToolkit toolkit) {
        try {
          int var3_int = -4 % ((guard - 65) / 32);
          this.dynamicVertices.allocate(24, (byte) -35, 786336);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "jl.D(" + guard + ',' + (toolkit != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
