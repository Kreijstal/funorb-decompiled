/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ch {
    static int field_d;
    LegacyOpenGlTexture3D field_b;
    LegacyOpenGlTexture3D field_c;
    LegacyOpenGlTexture2D[] field_a;
    static String playFreeVersionText;
    static boolean field_h;
    boolean field_g;
    LegacyOpenGlTexture3D field_f;
    LegacyOpenGlTexture2D[] field_i;

    public static void releaseStatics(byte param0) {
        playFreeVersionText = null;
        if (param0 < 54) {
          ch.a(-75);
        }
    }

    final static void a(int param0) {
        iu.a((byte) -128);
        pg.field_a = true;
        ScrollPane.field_E = true;
        RenderPresentationException.field_a.closeAllDialogs((byte) -64);
        if (param0 != 0) {
          ch.a(20);
        }
        oc.a(qe.connectionLostAttemptingToText, false, (byte) 49);
    }

    ch(LegacyOpenGlGraphicsToolkit param0) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        LegacyOpenGlTexture3D var4 = null;
        LegacyOpenGlNormalMapGenerator var10 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int var2_intLifetime1;
        this.field_b = null;
        this.field_a = null;
        this.field_c = null;
        this.field_f = null;
        this.field_i = null;
        try {
          this.field_g = param0.field_Ic;
          MusicPatchEnvelope.a(param0, (byte) 123);
          if (!this.field_g) {
            this.field_i = new LegacyOpenGlTexture2D[16];
            for (var2_int = 0; var2_int < 16; var2_int++) {
              var23 = iq.a(ic.field_b, 14381, 32768, var2_int * 32768);
              this.field_i[var2_int] = new LegacyOpenGlTexture2D(param0, 3553, 6410, 128, 128, true, var23, 6410, false);
            }
            this.field_a = new LegacyOpenGlTexture2D[16];
            for (var2_intLifetime1 = 0; var2_intLifetime1 < 16; var2_intLifetime1++) {
              var24 = iq.a(GameplaySession.field_j, 14381, 32768, var2_intLifetime1 * 32768);
              this.field_a[var2_intLifetime1] = new LegacyOpenGlTexture2D(param0, 3553, 6410, 128, 128, true, var24, 6410, false);
            }
            return;
          }
          var20 = ab.extractByteArray(false, ic.field_b, 0);
          this.field_b = new LegacyOpenGlTexture3D(param0, 6410, 128, 128, 16, var20, 6410);
          var21 = ab.extractByteArray(false, GameplaySession.field_j, 0);
          this.field_f = new LegacyOpenGlTexture3D(param0, 6410, 128, 128, 16, var21, 6410);
          var10 = param0.field_Sb;
          if (var10.ensureProgram((byte) -101)) {
            var22 = ab.extractByteArray(false, PlayingSound.field_m, 0);
            this.field_c = new LegacyOpenGlTexture3D(param0, 6408, 128, 128, 16);
            var4 = new LegacyOpenGlTexture3D(param0, 6409, 128, 128, 16, var22, 6409);
            if (!var10.generateNormalMap(this.field_c, 2.0f, false, var4)) {
              this.field_c.close((byte) 106);
              this.field_c = null;
            } else {
              this.field_c.generateMipmaps(false);
            }
            var4.close((byte) 126);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("ch.<init>(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        playFreeVersionText = "Play free version";
    }
}
