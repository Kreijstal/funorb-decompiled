/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DroneIntroductionOverlay {
    private int droneType;
    static MidiPcmStream field_e;
    static PacketBuffer field_c;
    private boolean visible;
    private int dismissalDelay;
    static int field_a;

    final static String validateDisplayName(CharSequence text, int guard, boolean allowRepeatedSeparators) {
        int var5 = 0;
        String var3 = null;
        int var4 = 0;
        int var6 = 0;
        String stackIn_4_0 = null;
        String stackIn_11_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          var4 = -114 % ((-29 - guard) / 39);
          var3 = QueuedIntArrayRequest.validateNameSeparators(allowRepeatedSeparators, 97, text);
          if (var3 != null) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          for (var5 = 0; var5 < text.length(); var5++) {
            if (!jl.a((byte) 110, text.charAt(var5))) {
              stackIn_11_0 = MarkerTrackWidget.namesCanOnlyContainText;
              return stackIn_11_0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("qc.D(");
          if (text == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(guard).append(',').append(allowRepeatedSeparators).append(')').toString());
        }
    }

    final void render(GraphicsToolkit toolkit, int guard) {
        String var10 = null;
        String var11 = null;
        int var7 = 0;
        int var8 = 0;
        DelegatingCanvas.a(ResizingDialog.field_H, 160, 140, -16777216, 3, toolkit, 360, 170, 1, true);
        if (!(Sumoblitz.field_J.length <= this.droneType)) {
          DelegatingCanvas.a(up.field_c, Sumoblitz.field_J[this.droneType].height() + 6, 167, -16777216, 3, toolkit, Sumoblitz.field_J[this.droneType].width() + 6, 187, 1, true);
          Sumoblitz.field_J[this.droneType].draw(170, 190);
        }
        int var3_int = Sumoblitz.field_J.length > this.droneType ? 380 : 320;
        int var4 = 200;
        int var5 = 160;
        String var9 = LimitedRandomAccessFile.droneDescriptions[this.droneType * 2];
        QueuedIntArrayRequest.field_k.a(var9, -11753985, -1, var4, var3_int, 0);
        uq.field_a.a(var9, -1, -1, var4, var3_int, 0);
        if (guard != -4475) {
          return;
        }
        try {
          var10 = LimitedRandomAccessFile.droneDescriptions[2 * this.droneType + 1];
          var3_int -= 10;
          MessageDialog.field_db.a(480, -11753985, 0, 20 + var5, -(var5 / 2) + var3_int, (int[]) null, (ToolkitSprite[]) null, var4 + 8, -1, 0, SocketConnector.field_a.field_i, guard - 4312, var10, (SpriteMask) null, 1, 0);
          LegacyOpenGlEffect.field_c.a(480, -1, 0, var5 + 20, -(var5 / 2) + var3_int, (int[]) null, (ToolkitSprite[]) null, var4 + 8, -1, 0, SocketConnector.field_a.field_i, -8787, var10, (SpriteMask) null, 1, 0);
          if (this.dismissalDelay <= 0) {
            var4 += 115;
            var3_int -= 50;
            var11 = IntNode.clickToContinueText;
            var7 = -this.dismissalDelay << 3;
            var8 = var7 % 510 <= 255 ? var7 % 255 : 510 - var7 % 255;
            QueuedIntArrayRequest.field_k.a(var11, 5023231 | var8 << 24, -1, var4, var3_int, 0);
            uq.field_a.a(var11, -1, -1, var4, var3_int, 0);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "qc.F(" + (toolkit != null ? "{...}" : "null") + ',' + guard + ')');
        }
    }

    final void update(int guard) {
        if ((ActiveCanvasProvider.field_c == 1 || hw.field_b[83]) &&
          this.dismissalDelay <= 0) {
          this.hide(-127);
        }
        if (guard != 0) {
          field_a = -33;
        }
        this.dismissalDelay = this.dismissalDelay - 1;
    }

    final boolean isVisible(byte guard) {
        if (guard != 91) {
          this.isVisible((byte) -1);
        }
        return this.visible;
    }

    private final void setDroneType(int type, int guard) {
        if (guard > -11) {
          field_e = (MidiPcmStream) null;
        }
        this.droneType = type;
    }

    final static void a(boolean param0, boolean param1, boolean param2) {
        int var4 = Sumoblitz.field_L ? 1 : 0;
        if (!vs.isGuestSession((byte) 9)) {
          LruNodeCache.gameplaySession.submitSessionStatistics(-113);
          HardwareTextureCache.field_f = null;
        } else {
          if (0 < IntrusiveNodeHashTable.field_c) {
            StrongCacheReference.switchMenuScreen(-7753, param0, 6);
          } else {
            StrongCacheReference.switchMenuScreen(-7753, param0, 0);
          }
        }
        EnemyDrone.o(250);
        LruNodeCache.gameplaySession.resetSession(66);
        if (!param1) {
          return;
        }
        DropDownWidget.field_N.hide((byte) -128);
        AffineTransform3D.field_j = 0;
    }

    public static void releaseStatics(byte param0) {
        field_e = null;
        field_c = null;
        int var1 = 85 / ((param0 - 13) / 43);
    }

    final void hide(int guard) {
        if (guard > -41) {
          return;
        }
        this.visible = false;
    }

    final static GraphicsToolkit a(int param0, int param1, int param2, java.awt.Canvas param3, TextureProvider param4) {
        RuntimeException var5 = null;
        NativeSoftwareGraphicsToolkit stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -1) {
            DroneIntroductionOverlay.releaseStatics((byte) 64);
          }
          stackIn_3_0 = new NativeSoftwareGraphicsToolkit(param3, param4, param1, param0);
          return (GraphicsToolkit) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_6_0 = var5;
          stackIn_6_1 = new StringBuilder().append("qc.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
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
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    DroneIntroductionOverlay() {
        this.dismissalDelay = 200;
    }

    final void show(int guard, int type) {
        this.visible = true;
        this.setDroneType(type, -119);
        this.dismissalDelay = 200;
        if (guard != -3388) {
          DroneIntroductionOverlay.releaseStatics((byte) 117);
        }
    }

    static {
    }
}
