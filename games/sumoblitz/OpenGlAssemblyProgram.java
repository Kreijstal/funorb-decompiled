/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlAssemblyProgram {
    private OpenGlGraphicsToolkit toolkit;
    int programId;

    final static int b(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          var3_int = 0;
          var4 = ProxyAuthenticationRequiredException.field_f;
          if (param1 != 1882601153) {
            OpenGlAssemblyProgram.createSolidSprite(78, -126, 77);
          }
          while (IntIndexHashTable.field_c.length > var3_int) {
            var5 = LegacyOpenGlPostProcessManager.field_a[var3_int];
            if (var5 < 0) {
              var4 = var4 + GameClientShell.field_t;
            } else {
              var6 = MessageDialog.$cfr$intArgs$a$590e95718a07(-59, IntIndexHashTable.field_c[var3_int], true);
              var7 = BeveledCheckboxRenderer.field_a - (var6 >> 1);
              var4 = var4 + qc.field_a;
              if (HardwareUnlitEffect.a(var4, (byte) 122, param2, var7 - DebouncedInputValidator.field_b, LegacyOpenGlUnderwaterEffect.field_h + (TextLayout.field_b << 1), param0, (DebouncedInputValidator.field_b << 1) + var6)) {
                stackIn_8_0 = var5;
                return stackIn_8_0;
              }
              var4 = var4 + (qc.field_a + (TextLayout.field_b << 1) + LegacyOpenGlUnderwaterEffect.field_h);
            }
            var3_int++;
          }
          stackIn_14_0 = -1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var3), "wg.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int floorLog2Magnitude(int guard, int value) {
        int var2 = 0;
        if (guard < -113) {
          if (value < 0) {
            value = -value;
          }
          var2 = 0;
          if (value > 65535) {
            var2 = var2 | 16;
            value = value >>> 16;
          }
          if (value > 255) {
            var2 = var2 | 8;
            value = value >>> 8;
          }
          if (value > 15) {
            var2 = var2 | 4;
            value = value >>> 4;
          }
          if (3 < value) {
            value = value >>> 2;
            var2 = var2 | 2;
          }
          if (value > 1) {
            value = value >>> 1;
            var2 = var2 | 1;
          }
          return var2;
        }
        return 84;
    }

    protected final void finalize() throws Throwable {
        this.toolkit.a(this.programId, (byte) -96);
        super.finalize();
    }

    OpenGlAssemblyProgram(OpenGlGraphicsToolkit owner, int target, int id) {
        try {
          this.programId = id;
          this.toolkit = owner;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "wg.<init>(" + (owner != null ? "{...}" : "null") + ',' + target + ',' + id + ')');
        }
    }

    final static Sprite createSolidSprite(int size, int color, int guard) {
        int var4 = 0;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        Sprite var6 = new Sprite(size, size);
        Sprite var3 = var6;
        for (var4 = 0; var3.pixels.length > var4; var4++) {
          var6.pixels[var4] = color;
        }
        if (guard == 3) {
          return var3;
        }
        return (Sprite) null;
    }

    static {
    }
}
