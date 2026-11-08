/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class au extends LegacyOpenGlEffect {
    static int[] field_h;
    private tq field_f;
    static SpriteData[] field_j;
    static double field_k;
    private boolean field_g;
    static l[] field_i;
    static String field_e;

    final void b(int param0) {
        if (!this.field_g) {
          this.field_b.a(114, 0, 5890, 770);
          this.field_b.a(20685, 8448, 8448);
          this.field_g = false;
          if (param0 >= -125) {
            field_e = (String) null;
            return;
          }
          return;
        }
        this.field_f.a((byte) 121, '\001');
        this.field_b.g(1, 113);
        this.field_b.a(78, (ht) null);
        this.field_b.g(0, 121);
        this.field_b.a(20685, 8448, 8448);
        this.field_g = false;
        if (param0 >= -125) {
          field_e = (String) null;
          return;
        }
    }

    au(LegacyOpenGlGraphicsToolkit param0) {
        super(param0);
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_g = false;
        try {
          if (!param0.field_Ob) {
            return;
          }
          this.field_f = new tq(param0, 2);
          this.field_f.a(0, 4864);
          this.field_b.g(1, 116);
          this.field_b.a(20685, 7681, 34165);
          this.field_b.b(34168, 770, 2, 9);
          this.field_b.a(109, 0, 34167, 770);
          jaggl.OpenGL.glTexGeni(8192, 9472, 34066);
          jaggl.OpenGL.glTexGeni(8193, 9472, 34066);
          jaggl.OpenGL.glTexGeni(8194, 9472, 34066);
          jaggl.OpenGL.glEnable(3168);
          jaggl.OpenGL.glEnable(3169);
          jaggl.OpenGL.glEnable(3170);
          this.field_b.g(0, 115);
          this.field_f.a(true);
          this.field_f.a(1, 4864);
          this.field_b.g(1, 121);
          this.field_b.a(20685, 8448, 8448);
          this.field_b.b(34166, 770, 2, -123);
          this.field_b.a(115, 0, 5890, 770);
          jaggl.OpenGL.glDisable(3168);
          jaggl.OpenGL.glDisable(3169);
          jaggl.OpenGL.glDisable(3170);
          jaggl.OpenGL.glMatrixMode(5890);
          jaggl.OpenGL.glLoadIdentity();
          jaggl.OpenGL.glMatrixMode(5888);
          this.field_b.g(0, 121);
          this.field_f.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("au.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean b(byte param0) {
        if (param0 >= -64) {
          field_j = (SpriteData[]) null;
          return true;
        }
        return true;
    }

    final void a(byte param0, int param1, ht param2) {
        try {
          if (param0 != 35) {
            ht var5 = (ht) null;
            this.a((byte) 33, -117, (ht) null);
          }
          this.field_b.a(41, param2);
          this.field_b.c(param1, true);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "au.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, boolean param1) {
        this.field_b.a(20685, 7681, 8448);
        if (param0 > -30) {
          String var4 = (String) null;
          au.a(-31, (String) null, -127);
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

    final void a(byte param0, boolean param1) {
        hp var3;
        var3 = this.field_b.j((byte) 62);
        if (this.field_f == null) {
          this.field_b.a(112, 0, 34168, 770);
        } else {
          if (var3 == null) {
            this.field_b.a(112, 0, 34168, 770);
          } else {
            if (!param1) {
              this.field_b.a(112, 0, 34168, 770);
            } else {
              this.field_f.a((byte) 121, '\0');
              this.field_b.g(1, 98);
              this.field_b.a(119, var3);
              jaggl.OpenGL.glMatrixMode(5890);
              jaggl.OpenGL.glLoadMatrixf(this.field_b.field_mc.a(5), 0);
              jaggl.OpenGL.glMatrixMode(5888);
              this.field_b.g(0, 85);
              this.field_g = true;
            }
          }
        }
        if (param0 > 33) {
          return;
        }
        field_h = (int[]) null;
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 <= 39) {
          this.field_g = true;
        }
    }

    final static an a(int param0, String param1, int param2) {
        an var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        an stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new an(false);
          var4 = -107 % ((-23 - param0) / 61);
          var3.field_e = param2;
          var3.field_g = param1;
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("au.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, ResourceArchive param1) {
        TimedSceneEffect.field_m[0] = MusicTrack.a(param1, "titlescreen_track");
        TimedSceneEffect.field_m[1] = MusicTrack.a(param1, "track2");
        TimedSceneEffect.field_m[2] = MusicTrack.a(param1, "track3");
        if (param0 != -1509) {
          return;
        }
        try {
          TimedSceneEffect.field_m[3] = MusicTrack.a(param1, "track5");
          TimedSceneEffect.field_m[4] = MusicTrack.a(param1, "track6");
          TimedSceneEffect.field_m[5] = MusicTrack.a(param1, "track7");
          TimedSceneEffect.field_m[6] = MusicTrack.a(param1, "win_track");
          TimedSceneEffect.field_m[7] = MusicTrack.a(param1, "defeat_track");
          TimedSceneEffect.field_m[8] = MusicTrack.a(param1, "challenge_mode_track");
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "au.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean c(int param0) {
        if (param0 != 1) {
          au.releaseStatics((byte) 90);
          return true;
        }
        return true;
    }

    final static void d(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = wk.field_h;
        synchronized (var1) {
          ht.field_h = ht.field_h + 1;
          ar.field_G = b.field_a;
          ko.field_p = kl.field_C;
          pi.field_e = SecondaryNodeDeque.field_b;
          sl.field_d = ResourceArchive.field_i;
          ResourceArchive.field_i = false;
          hk.field_c = kb.field_i;
          nb.field_a = jg.field_d;
          if (param0 < 93) {
            au.d(-50);
          }
          jc.field_f = ek.field_l;
          kb.field_i = 0;
        }
    }

    static {
        field_h = new int[8192];
        field_k = 0.0;
        field_e = "That name is not available";
    }
}
