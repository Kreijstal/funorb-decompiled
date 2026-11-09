/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LegacyOpenGlReflectionEffect extends LegacyOpenGlEffect {
    static int[] field_h;
    private LegacyOpenGlDisplayLists stateLists;
    static SpriteData[] field_j;
    static double field_k;
    private boolean active;
    static l[] field_i;
    static String field_e;

    final void disable(int guard) {
        if (!this.active) {
          this.toolkit.a(114, 0, 5890, 770);
          this.toolkit.setTextureCombineOperations(20685, 8448, 8448);
          this.active = false;
          if (guard >= -125) {
            field_e = (String) null;
            return;
          }
          return;
        }
        this.stateLists.callList((byte) 121, '\001');
        this.toolkit.setActiveTextureUnit(1, 113);
        this.toolkit.bindTexture(78, (LegacyOpenGlTexture) null);
        this.toolkit.setActiveTextureUnit(0, 121);
        this.toolkit.setTextureCombineOperations(20685, 8448, 8448);
        this.active = false;
        if (guard >= -125) {
          field_e = (String) null;
          return;
        }
    }

    LegacyOpenGlReflectionEffect(LegacyOpenGlGraphicsToolkit owner) {
        super(owner);
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.active = false;
        try {
          if (!owner.field_Ob) {
            return;
          }
          this.stateLists = new LegacyOpenGlDisplayLists(owner, 2);
          this.stateLists.beginList(0, 4864);
          this.toolkit.setActiveTextureUnit(1, 116);
          this.toolkit.setTextureCombineOperations(20685, 7681, 34165);
          this.toolkit.b(34168, 770, 2, 9);
          this.toolkit.a(109, 0, 34167, 770);
          jaggl.OpenGL.glTexGeni(8192, 9472, 34066);
          jaggl.OpenGL.glTexGeni(8193, 9472, 34066);
          jaggl.OpenGL.glTexGeni(8194, 9472, 34066);
          jaggl.OpenGL.glEnable(3168);
          jaggl.OpenGL.glEnable(3169);
          jaggl.OpenGL.glEnable(3170);
          this.toolkit.setActiveTextureUnit(0, 115);
          this.stateLists.endList(true);
          this.stateLists.beginList(1, 4864);
          this.toolkit.setActiveTextureUnit(1, 121);
          this.toolkit.setTextureCombineOperations(20685, 8448, 8448);
          this.toolkit.b(34166, 770, 2, -123);
          this.toolkit.a(115, 0, 5890, 770);
          jaggl.OpenGL.glDisable(3168);
          jaggl.OpenGL.glDisable(3169);
          jaggl.OpenGL.glDisable(3170);
          jaggl.OpenGL.glMatrixMode(5890);
          jaggl.OpenGL.glLoadIdentity();
          jaggl.OpenGL.glMatrixMode(5888);
          this.toolkit.setActiveTextureUnit(0, 121);
          this.stateLists.endList(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("au.<init>(");
          if (owner == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean isSupported(byte guard) {
        if (guard >= -64) {
          field_j = (SpriteData[]) null;
          return true;
        }
        return true;
    }

    final void bindTexture(byte guard, int combineMode, LegacyOpenGlTexture texture) {
        try {
          if (guard != 35) {
            LegacyOpenGlTexture var5 = (LegacyOpenGlTexture) null;
            this.bindTexture((byte) 33, -117, (LegacyOpenGlTexture) null);
          }
          this.toolkit.bindTexture(41, texture);
          this.toolkit.setTextureCombineMode(combineMode, true);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "au.A(" + guard + ',' + combineMode + ',' + (texture != null ? "{...}" : "null") + ')');
        }
    }

    final void refreshState(int guard, boolean lighting) {
        this.toolkit.setTextureCombineOperations(20685, 7681, 8448);
        if (guard > -30) {
          String var4 = (String) null;
          LegacyOpenGlReflectionEffect.accountError(-31, (String) null, -127);
        }
    }

    public static void releaseStatics(byte param0) {
        field_i = null;
        field_h = null;
        field_j = null;
        field_e = null;
        if (param0 > -124) {
          field_j = (SpriteData[]) null;
        }
    }

    final void enable(byte guard, boolean lighting) {
        LegacyOpenGlCubeTexture var3;
        var3 = this.toolkit.environmentCube((byte) 62);
        if (this.stateLists == null) {
          this.toolkit.a(112, 0, 34168, 770);
        } else {
          if (var3 == null) {
            this.toolkit.a(112, 0, 34168, 770);
          } else {
            if (!lighting) {
              this.toolkit.a(112, 0, 34168, 770);
            } else {
              this.stateLists.callList((byte) 121, '\0');
              this.toolkit.setActiveTextureUnit(1, 98);
              this.toolkit.bindTexture(119, var3);
              jaggl.OpenGL.glMatrixMode(5890);
              jaggl.OpenGL.glLoadMatrixf(this.toolkit.field_mc.a(5), 0);
              jaggl.OpenGL.glMatrixMode(5888);
              this.toolkit.setActiveTextureUnit(0, 85);
              this.active = true;
            }
          }
        }
        if (guard > 33) {
          return;
        }
        field_h = (int[]) null;
    }

    final void setParameters(byte guard, int parameters0, int parameters1) {
        if (guard <= 39) {
          this.active = true;
        }
    }

    final static AccountServiceResult accountError(int guard, String message, int code) {
        AccountServiceResult var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        AccountServiceResult stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new AccountServiceResult(false);
          var4 = -107 % ((-23 - guard) / 61);
          var3.errorCode = code;
          var3.errorMessage = message;
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("au.G(").append(guard).append(',');
          if (message == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(code).append(')').toString());
        }
    }

    final static void a(int param0, ResourceArchive param1) {
        TimedSceneEffect.field_m[0] = MusicTrack.load(param1, "titlescreen_track");
        TimedSceneEffect.field_m[1] = MusicTrack.load(param1, "track2");
        TimedSceneEffect.field_m[2] = MusicTrack.load(param1, "track3");
        if (param0 != -1509) {
          return;
        }
        try {
          TimedSceneEffect.field_m[3] = MusicTrack.load(param1, "track5");
          TimedSceneEffect.field_m[4] = MusicTrack.load(param1, "track6");
          TimedSceneEffect.field_m[5] = MusicTrack.load(param1, "track7");
          TimedSceneEffect.field_m[6] = MusicTrack.load(param1, "win_track");
          TimedSceneEffect.field_m[7] = MusicTrack.load(param1, "defeat_track");
          TimedSceneEffect.field_m[8] = MusicTrack.load(param1, "challenge_mode_track");
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "au.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean c(int param0) {
        if (param0 != 1) {
          LegacyOpenGlReflectionEffect.releaseStatics((byte) 90);
          return true;
        }
        return true;
    }

    final static void d(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = ConfirmedEmailValidator.field_h;
        synchronized (var1) {
          LegacyOpenGlTexture.field_h = LegacyOpenGlTexture.field_h + 1;
          HotspotTextWidget.activePointerButton = LegacyOpenGlNormalMapGenerator.field_a;
          ko.field_p = SoftCacheReference.field_C;
          pi.field_e = SecondaryNodeDeque.field_b;
          sl.field_d = ResourceArchive.field_i;
          ResourceArchive.field_i = false;
          hk.field_c = kb.field_i;
          nb.field_a = GzipDecompressor.field_d;
          if (param0 < 93) {
            LegacyOpenGlReflectionEffect.d(-50);
          }
          AgeValidator.field_f = LegacyOpenGlTexture3D.field_l;
          kb.field_i = 0;
        }
    }

    static {
        field_h = new int[8192];
        field_k = 0.0;
        field_e = "That name is not available";
    }
}
