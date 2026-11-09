/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlDisplayLists {
    private int baseListId;
    static LegacyBitmapFont field_a;

    final static void playSoundEffectIfChanged(int guard, int sampleId, boolean loop) {
        if (sampleId == GameInstructions.field_b) {
          return;
        }
        GameInstructions.field_b = sampleId;
        if (loop) {
          TextureCoordinateGeneration.stopSoundStream(GameInstructions.field_b, 124);
          QueuedIntArrayRequest.playLoopingSample(GameInstructions.field_b, 4);
          if (guard > -87) {
            field_a = (LegacyBitmapFont) null;
            return;
          }
          return;
        }
        ArchiveLoadRequirement.playSoundEffect(GameInstructions.field_b, true);
        if (guard > -87) {
          field_a = (LegacyBitmapFont) null;
          return;
        }
    }

    final void endList(boolean guard) {
        if (!guard) {
          this.beginList(-14, 14);
        } else {
          jaggl.OpenGL.glEndList();
          return;
        }
        jaggl.OpenGL.glEndList();
    }

    LegacyOpenGlDisplayLists(LegacyOpenGlGraphicsToolkit toolkit, int count) {
        try {
          this.baseListId = jaggl.OpenGL.glGenLists(count);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "tq.<init>(" + (toolkit != null ? "{...}" : "null") + ',' + count + ')');
        }
    }

    final void callList(byte guard, char index) {
        jaggl.OpenGL.glCallList(index + this.baseListId);
        if (guard != 121) {
          field_a = (LegacyBitmapFont) null;
        }
    }

    final void beginList(int index, int mode) {
        jaggl.OpenGL.glNewList(this.baseListId + index, mode);
    }

    public static void releaseStatics(byte param0) {
        if (param0 >= -6) {
          field_a = (LegacyBitmapFont) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static boolean hasFlag256(int unused, boolean guard, int flags) {
        if (guard) {
          return (flags & 256) != 0 ? true : false;
        }
        LegacyOpenGlDisplayLists.playSoundEffectIfChanged(34, -21, true);
        return (flags & 256) != 0 ? true : false;
    }

    final static void maybeSpawnScorePowerup(byte guard, Drone drone) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (HardwareUnlitEffect.powerupScoreThreshold <= FadingWidget.score) {
            GameKeyHandler.spawnPowerupFromDrone(drone, -1);
            HardwareUnlitEffect.powerupScoreThreshold = (int)((double)HardwareUnlitEffect.powerupScoreThreshold + 1.5 * (double)HardwareUnlitEffect.powerupScoreThreshold);
          }
          if (guard == -106) {
            return;
          }
          LegacyOpenGlDisplayLists.releaseStatics((byte) -12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("tq.G(").append(guard).append(',');
          if (drone == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
    }
}
